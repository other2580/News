package news.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import news.biz.DetailBiz;
import news.entity.Detail;
import news.mapper.DetailMapper;

@Service
public class DetailBizImpl implements DetailBiz{

	@Autowired
	private DetailMapper detailMapper;
	
	@Override
	public Detail getAll(int id) {
		return detailMapper.getAll(id);
	}

	@Override
	public List<Detail> fetchById(int categoryid, String title) {
		return detailMapper.fetchById(categoryid, title);
	}

	@Override
	public void Update(Detail detail) {
		detailMapper.Update(detail);
	}

}
