package news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import news.biz.DetailBiz;
import news.entity.Detail;

@WebServlet("/save")
public class UpdateSaveServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		DetailBiz detailBiz = ctx.getBean(DetailBiz.class);
		int id = Integer.valueOf(req.getParameter("id"));
		int categoryid = Integer.valueOf(req.getParameter("categoryid"));
		String title = req.getParameter("title");
		String sumary = req.getParameter("sumary");
		String author = req.getParameter("author");
		
		Detail de = new Detail(id,categoryid,title,sumary,author);
		detailBiz.Update(de);
		resp.sendRedirect("index");
	}
}
