package news.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import news.biz.CategoryBiz;
import news.entity.Category;
import news.mapper.CategoryMapper;

@Service
public class CategoryBizImpl implements CategoryBiz{

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> getAll() {
		return categoryMapper.getAll();
	}

	@Override
	public void deleteDouble() {
		categoryMapper.delete(1);
		categoryMapper.delete(6);
	}

}
