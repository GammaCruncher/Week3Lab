<%-- 
    Document   : arithmeticcalculator
    Created on : 28-Jan-2023, 7:26:49 PM
    Author     : David Doan <your.name at your.org>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <p>
        <form method="post" action="calculator">
            First: <input type="text" name="firstnumber" value="${firstnumber}"><br>
            Second: <input type="text" name="secondnumber" value="${secondnumber}"><br>
            <input type="submit" value="+" name="equation">
            <input type="submit" value="-" name="equation">
            <input type="submit" value="*" name="equation">
            <input type="submit" value="%" name="equation">
        </form>
        <br>
        Results: ${message}
        <br><a href="age">Age Calculator</a></p>
</body>
</html>
