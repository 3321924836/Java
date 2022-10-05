package liusiyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import liusiyuan.db.DBClass;
import liusiyuan.entity.Book;

@WebServlet("/ListBookServlet")
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Collection<Book> books = DBClass.getAll();
		out.write("Books on sale: <br/>");
		for (Book b : books) {
			String url = "/ShoppingCart/PurchaseServlet?id=" + b.getID();
			out.write(b.getName() + "<a href='" + url + " '>Click here to perchase!</a><br/>");
		}
	}

}