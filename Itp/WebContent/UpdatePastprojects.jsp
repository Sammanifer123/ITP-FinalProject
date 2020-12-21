<%@page import="oop.itp.model.PastProject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#proect_ID ,#Type{
display: block; 
box-sizing: border-box; 
margin-bottom: 20px;
 padding: 4px; width: 220px; 
 height: 32px;
  border:  1px solid #AAA;
font-family: 'Roboto', sans-serif; 
font-weight: 400; 
font-size: 15px;
transition: 0.2s ease;

}
#Description{
display: block; 
box-sizing: border-box; 
margin-bottom: 20px;
 padding: 4px; width: 220px; 
 height: 150px;
  border:  1px solid #AAA;
font-family: 'Roboto', sans-serif; 
font-weight: 400; 
font-size: 15px;
transition: 0.2s ease;

}


body{
				line-height: 175%;
				}
			
	body {
            background-image: url("images/UFI96SASB_G.jpg");
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
			color:white;
			opacity: 0.8;
			
                }	
                #h2{
                font-color:rgb(60, 60, 60);
                }
#button{
  margin-top: 10px; width: 120px; height: 32px; background:white; border: none; border-radius: 2px; color: black; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
}
</style>
</head>
<body>
<h2 align="center" id="h2"><font><strong>Update Past  Projects</strong></font></h2>


 
 <%@page import="java.sql.ResultSet"%>
 <%@page import="java.sql.PreparedStatement"%>
 <%@page import="java.sql.Connection"%>
 <%@page import="com.itp.util.DatabaseUtil"%>
<%
Connection connection;
 
PreparedStatement preparedStatement;
	
 ResultSet res;
%>

<%
try{ 
connection =DatabaseUtil.getConnection();
PastProject ps= new PastProject();

String sql1 = "select * from pastproject where proect_ID=?";

preparedStatement =connection.prepareStatement(sql1);

String val=request.getParameter("proect_update_ID");
preparedStatement.setString(1, val);

res  = preparedStatement.executeQuery();

while(res.next()){

%>

<div style="position: relative; margin: 5% auto; width: 600px; height: 600px; background: black; border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">
<td><form action="PastProjectUpdate" method= "post">
<B>
<center>
<table>
 <table>
</div>

	<tr>
	<div style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
	<td></td>
	</tr>
	<tr>
	<td></td>
	     <td>Project ID :  <input name="proect_ID" type ="text" id ="proect_ID" placeholder ="proect_ID"value="<%=res.getString("proect_ID") %>" readonly required></td>
         </tr>
         <tr>
         <td></td>
         <td>Type :  <input name="Type" type ="text" id ="Type" placeholder ="Type"value="<%=res.getString("Type") %>" readonly required></td>	
         </tr>
          <tr>
         <td></td>
         <td>Description :  <input name="Description" type ="text" id ="Description" placeholder ="Description" value="<%=res.getString("Description") %>"required><br></td>
         </tr>   
	</table>
	</center>
	
	<center>
 	
 	<input type="submit" value="Update" id="button"><br></center><br>
 	</B>
 	</form></td>
</tr>

<tr>
<td></td>
<td ></td> 

</tr>
<td>
<br><br>
</td>
</tr>
</table>
</div>
<% 
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>