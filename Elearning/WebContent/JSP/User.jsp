<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Page</title>
</head>
<% //In case, if User session is not set, redirect to Login page.
if((request.getSession(false).getAttribute("User")== null) )
{
%>
<jsp:forward page="/JSP/Login.jsp"></jsp:forward>
<%} %>
	<element>
		<body>
			<center>
				<h2>Student's Home</h2>
			</center>
			Welcome
			<%=request.getAttribute("userName")%>


	<form action="JSP/UserRegister.jsp">  
	<input type="submit" value="Give Feedback"><br/>   
	</form>  
	<br>
<form action="JSP/UserView.jsp">  
<input type="submit" value="View Courses Alloted"><br/>   
</form> 
<br>
			<div style="text-align: right">
				<a href="<%=request.getContextPath()%>/LogoutServlet">
					Logout
				</a>
			</div>

		</body>
	</element>
</html>


<!--<jsp:include page="UserRegister.jsp" />-->