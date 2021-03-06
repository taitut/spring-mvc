package com.laptrinhjavaweb.dto;

public class NewsDto extends abstractDTO<NewsDto> {
	
	private String title;
    private String thumbnail;
    private String shortDescription;
    private String content;
    private Long catgoryId;
    private String categoryCode;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getCatgoryId() {
		return catgoryId;
	}
	public void setCatgoryId(Long catgoryId) {
		this.catgoryId = catgoryId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
    
    

}
