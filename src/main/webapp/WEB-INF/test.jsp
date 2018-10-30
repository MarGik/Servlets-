<%@ page import="fr.univlyon1.m1if.m1if03.Messages" %>
<%--
  Created by IntelliJ IDEA.
  User: giku
  Date: 26/10/18
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8" />
    <title>Test</title>
</head>

<body>
<p>Ceci est une page générée depuis une JSP.</p>
<%
   Messages messages = (Messages) request.getAttribute("messages");

    for (int i = 0; i< messages.getLength();i++) {

        out.println(messages.getMessage(i).getPseudo()+" : "+messages.getMessage(i).getTexte());
        out.print("</br>");

    }
%>




</body>
</html>
