<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div style="text-align: center;">

<h1 style="color: blue;" ><sp:message code="emp.enter.title"/></h1>

<div style="text-align: center;">
<form:form modelAttribute="emp" >
<table border="1" bgcolor="cyan" >

<tr>
<td><sp:message code="emp.enter.id"/></td>
<td><form:input path="id"/></td>
</tr>
<tr>
<td><sp:message code="emp.enter.name"/></td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td><sp:message code="emp.enter.Department"/></td>
<td><form:input path="Department"/></td>
</tr>

<tr>
<td><sp:message code="emp.enter.salary"/></td>
<td><form:input path="salary"/></td>
</tr>
<tr>
<td>
<input type="submit" value="<sp:message code="emp.bt.page" />">
</td>

</tr>

</table>
</form:form>
</div>

<br><br>
<p>
<a href="?lang=fr_FR">French</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=de_DE">German</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=hi_IN">Hindi</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=en_US">English</a>&nbsp;&nbsp;&nbsp;
</p>
</div>