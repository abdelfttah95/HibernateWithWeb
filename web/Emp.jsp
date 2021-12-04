<%-- 
    Document   : Emp
    Created on : Dec 4, 2021, 12:34:01 AM
    Author     : abdel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hibernate</title>
    </head>
    <body>
        <form action="./EmpServl">
            <center>
                <font size="5" color="black">
                <b>${message}</b>
                </font>
                <font size="3" color="blue">
                <h2>Insert Your Data</h2>
                <div>
                    First Name : <input type="text" name="first" value="" /><br>
                    Last Name : <input type="text" name="last" value="" /><br>
                    Position : <input type="text" name="position" value="" /><br>
                    Salary : <input type="text" name="salary" value="" /><br>
                    <input type="submit" value="Add" /><br>
                </div>
            </center>
        </form>
    </body>
</html>
