package news.biz;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

import news.entity.Category;

public interface CategoryBiz {

	List<Category> getAll();
	
	@Delete("delete from news_category where id=#{id}")
	void deleteDouble();
}
