package news.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

import news.entity.Category;

public interface CategoryMapper {

	List<Category> getAll();
	
	@Delete("delete from news_category where id=#{id}")
	void delete(int id);
	
}
