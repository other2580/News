package news.entity;

import java.sql.Date;

public class Detail {

	private int id;
	private int catrgoryId;
	private String title;
	private String sumary;
	private String author;
	private Date createdate;
	
	public Detail(){}
	public Detail (int id,int catrgoryId,String title,String sumary,String author){
		super();
		this.id = id;
		this.catrgoryId = catrgoryId;
		this.title = title;
		this.sumary = sumary;
		this.author = author;
	}
	public Detail (int catrgoryId,String title){
		this.catrgoryId = catrgoryId;
		this.title = title;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCatrgoryId() {
		return catrgoryId;
	}
	public void setCatrgoryId(int catrgoryId) {
		this.catrgoryId = catrgoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSumary() {
		return sumary;
	}
	public void setSumary(String sumary) {
		this.sumary = sumary;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
}
