package com.et.web.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.et.web.entity.News;
import com.et.web.service.NewsService;


/**
 * Servlet implementation class NewsController
 */
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewsController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ApplicationContext context =  WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		NewsService nService = (NewsService) context.getBean("newServiceImpl");
//		String myContent = request.getParameter("myContent");
//		if(myContent==null){
//			myContent="";
//		}
//		List<Map<String, Object>>queryNewsByContent = nService.queryNewsByContent(myContent);
//		
//	
//		request.setAttribute("newsList", queryNewsByContent);
//		request.setAttribute("myContent", myContent);
//		request.getRequestDispatcher("/news.ftl").forward(request, response);
		
		String newsContent = request.getParameter("newsContent");
		if(newsContent==null){
			newsContent="";
		}
		List<News> news = nService.queryNewsReturnForNews(newsContent);
		System.out.println(news);
		request.setAttribute("news", news);
		request.setAttribute("newsContent", newsContent);
		 request.getRequestDispatcher("/demo/News.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
