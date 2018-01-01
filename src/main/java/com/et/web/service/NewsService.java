package com.et.web.service;

import java.util.List;
import java.util.Map;

import com.et.web.entity.News;

public interface NewsService {
	public List<Map<String,Object>>queryNewsByContent(String content);
	public List<News>queryNewsReturnForNews(String content);
	public void addNews(String title, String contenet, String newPath, String createTime);
}
