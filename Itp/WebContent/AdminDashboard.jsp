<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
   background-color: transparent;
}
li
 
  {
background-color: transparent;
  float: left;
}

li a {
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: white;
}
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
  
}
.dropdown:hover {
  background-color: white;
}
.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: black;
  padding: 14px 16px;
  background-color: transparent;
  font-family: inherit;
  margin: 0;
}
body{
background-image:url(images/UFI96SASB_G.jpg);
 background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
}


</style>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>




<h3><%= (new java.util.Date()).toLocaleString()%></h3>
<br><br><br>


<form method="get" action="LogOut_servelet">
<button type="submit" value="Logout"  style="float: right;
  width: 100px;
  border: 3px solid #73AD21;
  padding: 10px;" >Logout</button>
</form>



<ul>
  <li><a href="">Home</a></li>
   <li>  <div class="dropdown">
   <button class="dropbtn">Create Ad</button>
  <div class="dropdown-content">
    <a href="">Event</a>
    <a href="">Discount</a>
   
  </div>
</div></li>
<li><a href="ownerRtrieve(backend).jsp">Owner profile</a></li>
  <li><div class="dropdown">
  <button class="dropbtn">Sell items</button>
  <div class="dropdown-content">
    <a href="">Household Furniture</a>
    <a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a>
  </div>
  
</div>
</li>
  <li><div class="dropdown">
  <button class="dropbtn">Pricing Properties</button>
  <div class="dropdown-content">
    <a href="Pricing_Properties.jsp">Entering properties</a>
    <a href="HouseHoldFurniturePropeties.jsp">Household Furniture properties</a>
    <a href="HotelFurnitureProperties.jsp">Hotel Furniture properties</a>
    <a href="Office_Furniture_properties.jsp">Office Furniture properties</a>
    <a href="Sofasetes_properties.jsp">Sofasetes Furniture properties</a>
    <a href="Pantey_and_kitchen.jsp">Pantry&Kitchen Furniture properties</a>
    <a href="WoodenDecking_and_timber_floring.jsp">Wooden&Decking Furniture properties</a>
    
  </div>
</div></li>
  <li><a href="">Feebacks</a></li>
  <li><a href="EditPastProjects.jsp">PastProjects</a></li>
  
  </div>
</div></li>

    
</ul>
<ul>
<table>
<th>
<td>
<li><a href="ownerRtrieve(backend).jsp"><input type="submit"  value="Owner Profile" id="button" ></li>
<li><a href="ProjectInsert.jsp"><input type="submit"  value="Past Project intert" id="button" ></li>
</td></th></table>
</ul>


</body>
</html>