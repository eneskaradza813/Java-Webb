<%-- 
    Document   : index
    Created on : Jun 27, 2020, 11:07:23 AM
    Author     : mesa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytags" uri="/WEB-INF/tlds/my_tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <mytags:formattag colour="blue" font_size="40" is_uppercase="false">
            This is text from custom tag.
        </mytags:formattag>
    </body>
</html>
