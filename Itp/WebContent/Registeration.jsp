<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
body{
				line-height: 100%;
				}
			
	body {
              background-image: url("images/UFI96SASB_G.jpg");
  
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
			color:black;
			opacity: 0.8;
			 }
			 a{
			  color: dodgerblue;
			 }
			 	
#Name ,#Age,#Email,#contactNum,#Address,#WorkingExperience,#PASSWORD,#retypePASSWORD,#NIC {
  display: block; 
  box-sizing: border-box; 
  margin-bottom: 20px;
  padding: 0px; 
  width: 350px; 
  height: 30px;
  border:  1px solid #AAA;
  font-family: 'Roboto', sans-serif; 
  font-weight: 400; 
  font-size: 18px;
  transition: 0.1s ease;
  }

#button{
  margin-top: 10px; width: 250px; height: 40px; background:black; border: none; border-radius: 8px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
}
</style>

</head>
<body >
	<form method="post" action="CustomerInsert" >
		<div
			style="position: relative; margin: 5% auto; width: 600px; height: 700px; background: rgb(240, 231, 231); border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">
			
			
				  <table align="center">
          <tr><br>
          <center><h2>Registration </h2></center>
          </tr>
          <tr>
         <td ></td>
         <td>Name with initials<input type="text" name="Name" id ="Name" required></tr>
          <tr>
         <td></td>
         <td>Address<input type="text" name="Address"  id="Address" required>
         </tr>
          <tr>
         <td></td>
         <td>Contact number<input type="number" name="contactNum" id="contactNum"pattern="[0-9]{10}" title="invalid contact number" required>         </tr>
          <tr>
         <td></td>
         <td>NIC<input type="text" name="NIC"  id ="NIC"pattern = "[0-9]{9}[V|v]" title="invalid NIC number" required>         </tr>
         
          <tr>
         <td></td>
         <td>Email<input type="text" name="Email"  id = "Email"pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="please enter valid email Address" required>         </tr>
 
         <tr>
         <td></td>
         <td>Password<input type="password" name="PASSWORD"  id ="PASSWORD" title="Password must contain at least 6 characters, including UPPER/lowercase and numbers."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required >         </tr>
        
         <tr>
         <td></td>
         <td>Confirm password<input type="password" name="retypePASSWORD"  id="retypePASSWORD" title="Please enter the same Password as above."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"required></tr>
    
         <tr>
         <td></td>
           
         <td><input type = "checkbox" value = "condition" id = "tick" onclick = "check()"><B> I do not have an account? </B> </tr>
         <tr>
         <td></td>
         </tr>
        
         <tr>
         <td></td>
         <td>
         
         <center>
         <input type="submit" value="Register" id="button" onclick="onSubmit()"></input> 
          <input type="button" value="demo" id="button" onclick="demo()"></input> 
         
         </center>
         </td>
         </tr>
        </table>
       </div>
       </div>
    </form>
</body>
<script type="text/javascript">
function demo(){
	document.getElementById("Name").value="sammani fernando";
	document.getElementById("Address").value="katuwapitiya negombo";
	document.getElementById("contactNum").value="0775360993";
	document.getElementById("NIC").value="987721430V";
	document.getElementById("Email").value="sammani@gmail.com";
	document.getElementById("PASSWORD").value="Sammani.123";
	document.getElementById("retypePASSWORD").value="Sammani.123";
}

</script>
</html>