
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Feedback Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
   
   <tr>
     <td>Roll Number</td>
     <td><input type="text" name="id" /></td>
    </tr>
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
     <td>Comments</td>
     <td><input type="text" style="height: 100px" name="comments" /></td>
    </tr>
   </table>
   <input type = 'submit' value = 'Submit' onClick='f();'/>
 
    <!--<input type="submit" value="Submit" <a href="<%=request.getContextPath()%>/SubmitServlet"/>/>-->
  </form>
  
  <script>
    function f() {
        window.open('UserDetails.jsp');
        return true;
    }
</script>
 </div>
</body>
</html>