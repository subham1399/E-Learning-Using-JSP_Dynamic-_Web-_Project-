package com.admin.controller;

import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import course.admin.dao.courseAddDao;
	import com.courseadd.admin.courseAdd;

	@WebServlet({"/addCourse"})
	public class  addSurvlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private courseAddDao uDao;

	    public addSurvlet() {
	    }

	    public void init() {
	        this.uDao = new courseAddDao();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	String courseID = request.getParameter("courseID") ;
	        String courseName = request.getParameter("courseName");
	  
	        
	        courseAdd employee = new courseAdd();
	        employee.setCourseID(courseID);
	        employee.setCourseName(courseName);
	 

	        try {
	            this.uDao.registerEmployee(employee);
	        } catch (Exception var11) {
	            var11.printStackTrace();
	        } catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        response.sendRedirect("JSP/courseAddSucess.jsp");
	    }
	}



