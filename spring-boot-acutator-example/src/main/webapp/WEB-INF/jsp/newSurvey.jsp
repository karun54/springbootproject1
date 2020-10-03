<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Add survey Form</title>

 
 </head>

<body style="font-family: Arial; font-size:smaller;">


   <form:form action="/saveSurvey" method="post" modelAttribute="survey">
      
    <table> 
     <tr>
      <td width="50" align="right">SURVEY_NAME</td>
      <td width="50">
      <form:input path="SURVEY_NAME"/></td>
      <td align="left">
      <form:errors path="SURVEY_NAME" cssStyle="color:red"></form:errors> 
      </td> 
      </tr>
       
      <tr>
      <td width="50" align="right"> Question #1</td>
      <td width="50">
      <form:input path="QUESTION"/></td>
      <td align="left">
      <form:errors path="QUESTION" cssStyle="color:red"></form:errors> 
      </td> 
      </tr>
     
    <tr>
      <td width="50" align="right"> Question #2</td>
      <td width="50">
      <form:input path="QUESTION"/></td>
      <td align="left">
      <form:errors path="QUESTION" cssStyle="color:red"></form:errors> 
      </td> 
      </tr>
      <tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
      </table>
      </form:form>
    
  
</body>
</html>