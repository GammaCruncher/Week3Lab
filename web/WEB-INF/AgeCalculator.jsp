<%-- 
    Document   : AgeCalculator
    Created on : 28-Jan-2023, 4:06:22 PM
    Author     : David Doan 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            ${message}
        <a href="url">Arithmetic Calculator</a>
        
    </body>
</html>
