package com.feedback.controller;

    import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import com.login.feedback.dao.UsersDao;
	import com.login.feedback.model.Users;

	@WebServlet({"/register"})
	public class  UsersServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private UsersDao uDao;

	    public UsersServlet() {
	    }

	    public void init() {
	        this.uDao = new UsersDao();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	String id = request.getParameter("id") ;
	        String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("lastName");
	        String comments = request.getParameter("comments");
	        
	        Users employee = new Users();
	        employee.setId(id);
	        employee.setFirstName(firstName);
	        employee.setLastName(lastName);
	        employee.setComments(comments);

	        try {
	            this.uDao.registerEmployee(employee);
	        } catch (Exception var11) {
	            var11.printStackTrace();
	        } catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        response.sendRedirect("JSP/UserDetails.jsp");
	    }
	}


