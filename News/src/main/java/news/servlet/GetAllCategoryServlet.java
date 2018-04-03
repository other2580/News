package news.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import news.biz.CategoryBiz;
import news.biz.DetailBiz;
import news.entity.Category;
import news.entity.Detail;

@WebServlet("/index")
public class GetAllCategoryServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		CategoryBiz categoryBiz = ctx.getBean(CategoryBiz.class);
		DetailBiz detailBiz = ctx.getBean(DetailBiz.class);		
		
		int categoryid = 0;
		String title = "";
		if(req.getParameter("categoryid")!=null && !req.getParameter("categoryid").isEmpty()){
			categoryid = Integer.valueOf(req.getParameter("categoryid"));
		}
		if(req.getParameter("title")!=null && !req.getParameter("title").isEmpty()){
			title = req.getParameter("title");
		}
		
		req.setAttribute("category", categoryBiz.getAll());
		req.setAttribute("dateil", detailBiz.fetchById(categoryid, title));
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
