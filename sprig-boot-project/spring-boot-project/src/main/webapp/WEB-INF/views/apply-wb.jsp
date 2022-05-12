<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<style>
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
form:input[type=email ] {
  width: 100%;
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


</style>
<body style=" background-color: grey;">
<form:form action="applySuccess" method="post" modelAttribute="applyModel">
<c:if test="${msg ne null}">
<c:out value="${msg }"/>
</c:if>
<hr>
<table style="width:100%;" class ="center">
<tr><td>ENTER NAME</td><td><form:input placeholder="Your name.." type = "text" path="name"/></td><td style="color:red;"><form:errors path="name" cssClass="error" /></td></tr>
<tr><td>ENTER MOBILE NO.</td><td><form:input  placeholder="Your mobile.." type = "text" path="mobile"/></td><td style="color:red;"><form:errors path="mobile" cssClass="error" /></td></tr>
<tr><td>ENTER EMAIL ID</td><td><form:input placeholder="Your email.."  type = "email" path="email"/></td><td style="color:red;"><form:errors path="email" cssClass="error" /></td></tr>
<tr><td>ENTER HIGHEST QUALIFICATION</td><td><form:input placeholder="Your highest qualification.." type = "text" path="degree"/></td><td style="color:red;"><form:errors path="degree" cssClass="error" /></td></tr>
<tr><td>ENTER ADDRESS</td><td><form:input placeholder="Your address.." type = "text" path="address"/></td><td style="color:red;"><form:errors path="address" cssClass="error" /></td></tr>
<tr><td>ENTER SKILLS</td><td><form:input placeholder="Your skill.." type = "text" path="skill"/></td><td style="color:red;"><form:errors path="skill" cssClass="error" /></td></tr>
 <tr><td colspan="3"><form:hidden path="job" value="wb"/></td></tr>
 <tr>
     <td  colspan="3"  align="center">  <input type="submit"  value="SUBMIT"></td>
   </tr> 
</table>
</form:form>
</body>
</html>




