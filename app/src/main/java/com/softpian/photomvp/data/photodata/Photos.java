package com.softpian.photomvp.data.photodata;

import com.squareup.moshi.Json;

import java.util.List;

public class Photos{

	@Json(name = "perpage")
	private int perpage;

	@Json(name = "total")
	private String total;

	@Json(name = "pages")
	private String pages;

	@Json(name = "photo")
	private List<PhotoItem> photo;

	@Json(name = "page")
	private int page;

	public void setPerpage(int perpage){
		this.perpage = perpage;
	}

	public int getPerpage(){
		return perpage;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setPages(String pages){
		this.pages = pages;
	}

	public String getPages(){
		return pages;
	}

	public void setPhoto(List<PhotoItem> photo){
		this.photo = photo;
	}

	public List<PhotoItem> getPhoto(){
		return photo;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	@Override
 	public String toString(){
		return 
			"Photos{" + 
			"perpage = '" + perpage + '\'' + 
			",total = '" + total + '\'' + 
			",pages = '" + pages + '\'' + 
			",photo = '" + photo + '\'' + 
			",page = '" + page + '\'' + 
			"}";
		}
}