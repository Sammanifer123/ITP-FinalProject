<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
	body{
				line-height: 175%;
				}
			
	body {
              background-image: url("images/dark-background-bright-furniture-0-349.jpg");
  
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
			color:white;
                }	
   
   #button{
		
		background-color: red;
		border-radius: 12px;
		cursor:pointer;
        border: none;
        color: white;
		padding: 10px 50px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
        margin: 10px 20px;
	}
	 .pdf{
		
		background-color: black;
		border-radius: 12px;
		cursor:pointer;
        border: none;
        color: white;
		padding: 10px 50px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
        margin: 10px 20px;
	}
	
	table {
			border-spacing: 40px;
			border: 2px solid ;
            border-radius: 12px;
			background:rgba(0,0,0,0.9);
			
           }
           
	#Type,#Description{
			width:300px;
			height:35px;
			border-radius: 6px;
			
			}
			
			
	#Description{
			width:300px;
			height:150px;
			border-radius: 6px;
			
		}	

			{
			font-family:#ff0000;
			}

   
   </style>
   
   <script>
   function check()
   {
	if(document.getElementById("tick").checked){
			document.getElementById("button").disabled = false;
			 alert("please click the checkbox"); 
		
	}
	
	else
	{
	document.getElementById("button").disabled = true;
 
	}
}
   </script>
</head>

<body><br><br>
	<center>
	<b><h1 style = "font-family: Arial, Helvetica, sans-serif;
				        color:red;
				        font-size: 3.0em;
				        text-shadow: 3px 2px #d9d9d9;">Past Project</h1><b>
				        </center>
	  
	  <hr>
		
			<form  method="post" action="PastPojectInsert">
			<center>
		     <table>
		     <br><br><br>
					
					<tr>
					<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Type </b>
					    <select name="Type" id="Type" type ="text"  required>
					    <option>Aluminum works propoties </option>
					    <option> furniture</option>
					    <option>catring and carpentry </option>
					    <option>wooden floor </option>
					    <option>Landscaping </option>
					    <option>Civil Construction </option>
					    </select>
					    </td> 	
					</tr>
												
					<tr>
						
						<td><b>Description</b>
						<br><input name="Description" type ="text" id ="Description"  required></td> 	
					</tr>
					
					
					</table>
				
						<input type = "checkbox" value = "condition" id = "tick" onclick = "check()"> Fill All  The Details 
						<br><br>
			
			<input type="submit" value="ADD PROJECT" id ="button"class="button" disabled ></a><br><br>
			 <input type="button" value="demo" id="button" onclick="demo2()"></input> 
			</form>
			<form action="PDFgen" method="post">
			 <button type ="submit" id="button" class="button">past project history pdf</button>
			</form>
		</table>
		</center>
		<br>
		<br>
	
	       
			
        
</body>
<script type="text/javascript">
function demo2(){

	document.getElementById("Description").value="this is our best project had already done by in 2019";
	
	
}

</script>
</html>