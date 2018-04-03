package news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import news.biz.CategoryBiz;
import news.biz.DetailBiz;
import news.entity.Detail;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		DetailBiz detailBiz = ctx.getBean(DetailBiz.class);
		CategoryBiz categoryBiz = ctx.getBean(CategoryBiz.class);
		int id =Integer.valueOf(req.getParameter("id"));
		req.setAttribute("list", detailBiz.getAll(id));
		req.setAttribute("category", categoryBiz.getAll());
		req.getRequestDispatcher("update.jsp").forward(req, resp);
	}
	
}
