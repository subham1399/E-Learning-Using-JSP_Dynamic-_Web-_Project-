package com.delete.controller;

	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import com.coursedelete.admin.dao.courseDeleteDao;
	import com.coursedelete.admin.courseDelete;

	@WebServlet({"/deleteCourse"})
	public class  deleteSurvlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private courseDeleteDao uDao;

	    public deleteSurvlet() {
	    }

	    public void init() {
	        this.uDao = new courseDeleteDao();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	String courseID = request.getParameter("courseID") ;
	       //String courseName = request.getParameter("courseName");
	  
	        
	        courseDelete employee = new courseDelete();
	        employee.setCourseID(courseID);
	       // employee.setCourseName(courseName);
	 

	        try {
	            this.uDao.registerEmployee(employee);
	        } catch (Exception var11) {
	            var11.printStackTrace();
	        } catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        response.sendRedirect("JSP/courseDeleteSucess.jsp");
	    }
	}



