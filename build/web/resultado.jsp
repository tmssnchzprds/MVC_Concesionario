<%-- 
    Document   : vista
    Created on : 06-feb-2017, 17:30:09
    Author     : jose
--%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Lista de  modelos disponibles:</h1>
<p>
    <%
        ArrayList modelos_recibidos=(ArrayList)request.getAttribute("modelos");
        for (Object c_actual:modelos_recibidos)
        {
            out.println("<li>"+c_actual+"</li>");
        }
    %>
</p>
    </body>
</html>
