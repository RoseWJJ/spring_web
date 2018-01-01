package com.et.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.web.dao.NewsDao;
import com.et.web.entity.News;
import com.et.web.service.NewsService;

@Service
public class NewServiceImpl implements NewsService{
	
	@Autowired
	private NewsDao dao;
	
	public List<Map<String, Object>> queryNewsByContent(String content) {
		if(content==null){
			content="";
		}
		return dao.queryNewsByContent(content);
	}

	public List<News> queryNewsReturnForNews(String content) {
		if(content==null){
			content="";
		}
		return dao.queryContentNews(content);
	}

	public void addNews(String title, String contenet, String newPath, String createTime) {
		dao.addNews(title, contenet, newPath, createTime);
		
	}

}
