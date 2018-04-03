package news.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import news.biz.CategoryBiz;
import news.biz.DetailBiz;
import news.entity.Category;
import news.entity.Detail;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		CategoryBiz categoryBiz = ctx.getBean(CategoryBiz.class);
		categoryBiz.deleteDouble();
	}

}
