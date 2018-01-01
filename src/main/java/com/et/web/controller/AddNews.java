package com.et.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


import com.et.web.entity.News;
import com.et.web.service.NewsService;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

/**
 * Servlet implementation class AddNews
 */
public class AddNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNews() {
        super();
    }
   	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ApplicationContext context =  WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		NewsService nService = (NewsService) context.getBean("newServiceImpl");

   		String title = request.getParameter("title");
   		String content = request.getParameter("content");
   		Date date  = new Date();
   		String dateStr = sdf.format(date);
   		String uuid =UUID.randomUUID().toString();
		nService.addNews(title, content, uuid+".html", dateStr);
		System.out.println(title+"----------"+content);
		request.getRequestDispatcher("NewsController").forward(request,response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
