<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>
<p>Liste des clients</p>
 <ul>
        <c:forEach var="client" items="${ clients }">
            <li><c:out value="${ client.c_prenom }" /> <c:out value="${ client.c_nom }" /></li>
        </c:forEach>
    </ul>   
    
</body>
</html>