package liusiyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import liusiyuan.entity.Book;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		List<Book> cart = null;
		boolean Flag = true;
		HttpSession session = request.getSession(false);
		if (session == null) {
			Flag = false;
		} else {
			cart = (List<Book>) session.getAttribute("cart");
			if (cart == null) {
				Flag = false;
			}
		}
		if (!Flag) {
			out.write("No items in your shopping cart.");
		} else {
			out.write("Items in your shopping cart: <br/>");
			for (Book b : cart) {
				out.write(b.getName() + "<br/>");
			}
		}
	}

}