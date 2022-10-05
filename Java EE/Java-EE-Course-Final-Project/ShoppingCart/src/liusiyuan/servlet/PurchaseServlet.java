package liusiyuan.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import liusiyuan.db.DBClass;
import liusiyuan.entity.Book;

@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		if (id == null) {
			String url = "/ShoppingCart/ListBookServlet";
			response.sendRedirect(url);
			return;
		}
		Book book = DBClass.getBook(id);
		HttpSession session = request.getSession();
		List<Book> cart = (List<Book>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<Book>();
			session.setAttribute("cart", cart);
		}
		cart.add(book);
		Cookie cookie = new Cookie("JSESSION", session.getId());
		cookie.setMaxAge(60 * 30);
		cookie.setPath("/ShoppingCart");
		response.addCookie(cookie);
		String url = "/ShoppingCart/CartServlet";
		response.sendRedirect(url);
	}
}