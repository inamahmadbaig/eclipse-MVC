<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Submission Success</title>
</head>
<body>
    <h2>Employee Details Submitted Successfully!</h2>
    
    <table border="1" cellpadding="5">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>ID:</td>
            <td>${emp.id}</td> 
        </tr>
        <tr>
            <td>Name:</td>
            <td>${emp.name}</td>
        </tr>
        <tr>
            <td>Department:</td>
            <!-- Note: Spring EL usually expects the property name to start with a lowercase letter, even if the Java variable is capitalized, as long as the getter is getDepartment() -->
            <td>${emp.department}</td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td>${emp.salary}</td>
        </tr>
    </table>
    
    <br><br>
    <a href="<spring:url value='/' />">Go Back to Home</a>
</body>
</html>