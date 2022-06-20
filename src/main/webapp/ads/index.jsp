<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

<div class="container">
    <h1>Current Advertisements</h1>

    <c:forEach var="ad" items="${allAds}">
        <div class="col-md-6">
            <h2>${ad.getTitle}</h2>
            <p>${ad.getDescription}</p>
        </div>
    </c:forEach>


</div>
</body>
</html>