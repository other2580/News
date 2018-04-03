package news.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import news.entity.Detail;

public interface DetailBiz {

	Detail getAll(int id);

	List<Detail> fetchById(@Param("categoryid") int categoryid, @Param("title") String title);

	void Update(Detail detail);

}
