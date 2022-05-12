<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>web development</title>
	
	<style>
	
#header{
	
	
	color: white;
	font-weight: bolder;
	
      text-align: left;
      
}
#body1{
  
  opacity: 1;
  background-image: url("img\\bg_2.jpg");
  width: 100%;
   height: 600px;
}
span{
  width: 22%;
  height: 200px;
  float: left;
  margin-left: 30px;
  margin-top: 85px;
}
#joblist{
  margin-top: 90px;
}
#testimonial{
margin-top: 800px;
height: 400px;

}
#testimonial span{
  width: 30%;
  height: 200px;
  float: left;
  margin-left: 30px;
  margin-top: 85px;
}
#joblist  a{

   text-decoration:none;
   color:black;
   margin: 2px;
   display: block;
   padding: 15px 16px;

}

#joblist #lr{
  border: 1px solid grey;
  border-radius: 3px;
 
}
#joblist a:hover{
   color: green;
}
#newsletter{
  width: 100%;
 height: 350px;
 background-color: rgb(0, 102, 255);
}
#about{
  background-color: rgb(77, 77, 77);
  width: 100%;
  height: 300px;
  
}
#about span{
  width: 45%;
  height: 200px;
  float: left;
  margin-left: 30px;
  margin-top: 85px;

}
#about span i{
  color: white;
}

ul{
	list-style-type: none;
	overflow: hidden;
	margin: 0;
	padding: 0;
}
li{
	text-align: center;
	float: right;
	color: white;
	display: block;
	padding:   15px 16px;
	

}
li a{
	text-decoration:none;
	color: white; 
}
li:hover{
   text-decoration: underline;
   border-right: 1px white solid; 
}
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}


</style>

</head>
<body>
	<div id = "body1">
		<div id="header">
         <h>Job Portal</h>
        </div>

<div id="nav">
	<ul>
		<li ><a href="/project/#about">About</a></li>
		<li ><a href="/project/#login2">Post a job</a></li>
        <li><a href="/project/#company">Company</a></li>
        <li><a  href="/project/#joblist">Job ?</a></li>
        <li><a href="/project">Home</a></li>
	</ul>
</div>
<div id="centered1">
	
	
	<h3 style="color: white; font-weight: bolder ;padding-left: 80px; ">Home > Job?</h3><br>
     <h1 style="color: white; font-weight: bolder ;padding-left: 80px;font-size: 76px;">Apply Job</h1>
	
      </div> 
 </div>


<div style="width: 100%;">
<table id="customers" style="width:100%; border:1px solid black;">
<tr><th>NAME</th><th>MOBILE</th><th>EMAIL</th><th>DEGREE</th><th>SKILL</th><th>ADDRESS</th></tr>
<c:if test="${!empty list1 }">
<c:forEach items ="${list1 }" var="l">
<tr>
<td> <c:out value="${l.name }"/></td>
<td> <c:out value="${l.mobile }"/></td>
<td> <c:out value="${l.email }"/></td>
<td> <c:out value="${l.degree }"/></td>
<td> <c:out value="${l.skill }"/></td>
<td> <c:out value="${l.address }"/></td>

</tr>
</c:forEach>
</c:if>
</table>

</div>
</body>
</html>