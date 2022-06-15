<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

</head>

<body>
<h1>Color Picker</h1>


<form action="pickcolorservlet" method="GET">
    <div class="form-group">
        <label for="pick color">What's your favorite color?</label>
        <input id="pick color" name="pickcolor" class="form-control" type="text">
    </div>
    <br>
    <input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>





<%--<button onclick="pickColor()">Click to Enter Favorite Color</button>--%>



<script>

    // function pickColor() {
    //     return prompt("What is your favorite color?");
    // }

    // let favColor = prompt("Please enter your favorite color");


</script>


</body>



</html>