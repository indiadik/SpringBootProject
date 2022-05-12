<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<title>Post Job</title>
<head>
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
.center {
  border-radius: 5px;
 
  padding: 20px;
}
input  {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
radiobutton{
width: 45%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: red;
}
button{
width: 95%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
button:hover{
background-color: red;
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
	
	
	<h3 style="color: white; font-weight: bolder ;padding-left: 80px; ">Home > Post a Job</h3><br>
     <h1 style="color: white; font-weight: bolder ;padding-left: 80px;font-size: 76px;"> Post a Job</h1>
	
      </div> 
      
 </div>
 


<div style="width: 100%; ">
<form:form action="postSuccess" method="post" modelAttribute="postBean">
<c:if test="${msg ne null}">
<c:out value="${msg }"/>
</c:if>
<hr>
<table style="width:100%;" class ="center">
<tr>
<td>SELECT JOB</td><td><form:select path="name"><form:option value="">------select-------</form:option><form:options items="${postBean.jobs }"/></form:select></td><td style="color:red;"><form:errors path="name"/></td>
</tr>

<tr><td>LOCATION</td><td><form:input placeholder="Enter Location.."  type = "text" path="loc"/></td><td style="color:red;"><form:errors path="loc" cssClass="error" /></td></tr>

<tr><td>ENTER SALARY</td><td><form:input placeholder="Enter Salary.." type = "text" path="sal"/></td><td style="color:red;"><form:errors path="sal" cssClass="error" /></td></tr>
<tr>
<td>JOB TYPE</td><td><form:radiobutton path="type" value="fulltime" label="FullTime"/><form:radiobutton path="type" value="parttime" label="PARTTIME"/></td><td style="color:red;"><form:errors path="type"/></td>
</tr>
<tr>
<td>QUALIFICATION</td><td><form:radiobutton path="qual" value="freasher" label="Freasher"/><form:radiobutton path="qual" value="experience" label="Experience"/></td><td style="color:red;"><form:errors path="type"/></td>
</tr>
 <tr>
     <td  colspan="3"  align="center">  <input type="submit"  value="POST"></td>
   </tr>
    
</table>
</form:form>

     
    <a href="getCandidate"><button >LOOKING FOR A CANDIDATE ?</button></a>
</div>
</body>
</html>
 