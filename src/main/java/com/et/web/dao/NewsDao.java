package com.et.web.dao;

import java.util.List;
import java.util.Map;

import com.et.web.entity.News;

public interface NewsDao {
	
	public List<Map<String, Object>> queryAll();
	
	public List<Map<String, Object>> queryNewsByContent(String content);

	
	
	
	
	public List<News> queryAllNews();

	public List<News> queryContentNews(String content);
	
	
	public void addNews(String title, String contenet, String Path, String createTime);
	
	
}
