
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Add Course</h1>
  <form action="<%= request.getContextPath() %>/addCourse" method="post">
   <table style="with: 80%">
   
   <tr>
     <td>Course ID</td>
     <td><input type="text" name="courseID" /></td>
    </tr>
    <tr>
     <td>Course Name</td>
     <td><input type="text" name="courseName" /></td>
    </tr>
   </table>
   <input type = 'submit' value = 'Submit' onClick='f();'/>
 
    <!--<input type="submit" value="Submit" <a href="<%=request.getContextPath()%>/SubmitServlet"/>/>-->
  </form>
  
  <script>
    function f() {
        window.open('courseAddSucess.jsp');
        return true;
    }
</script>
 </div>
</body>
</html>