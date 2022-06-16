<%--
  Created by IntelliJ IDEA.
  User: michaelkestler
  Date: 6/16/22
  Time: 8:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form action="/guess" method="POST">
  <div class="form-group">
    <label for="guess">Guess a number between 1 and 3</label>
    <input id="guess" name="guess" class="form-control" type="text">
  </div>
  <br>
  <input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>

</body>
</html>
