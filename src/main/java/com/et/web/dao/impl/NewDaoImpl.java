package com.et.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.et.web.dao.NewsDao;
import com.et.web.entity.News;

@Repository
public class NewDaoImpl implements NewsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> queryAll() {
		String sql = "select * from mynews";
		return jdbcTemplate.queryForList(sql);
	}

	public List<Map<String, Object>> queryNewsByContent(String content) {
		String sql = "select * from mynews where content like '%" + content + "%'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

		return list;
	}

	public void addNews(String title, String contenet, String newPath, String createTime) {
		String sql = "insert into mynews(title,content,htmlpath,createtime) values ('" + title + "','" + contenet
				+ "','" + newPath + "','" + createTime + "')";
		jdbcTemplate.execute(sql);
	}

	public List<News> queryAllNews() {
		String sql = "select * from mynews";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(News.class));

	}

	public List<News> queryContentNews(String content) {
		String sql = "select * from mynews where content like '%" + content + "%'";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(News.class));
	}

	public void addNews(String id, String title, String content) {
		// TODO Auto-generated method stub
		
	}
}
