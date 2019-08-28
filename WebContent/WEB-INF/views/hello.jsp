<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
  <h1>${appName}</h1>
  <div>
    <p>${message}</p>
    <p>${now}</p>
  </div>
  <div>
    <img src="/demo-spring5-webmvc/resources/images/sample_1.png" />
  </div>
  <div>
    <ol>
    <c:forEach var="value" items="${fruits}" varStatus="index">
      <li>${value} (${index.count})</li>
    </c:forEach>
    </ol>
  </div>
</body>
</html>
