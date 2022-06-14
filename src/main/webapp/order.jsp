<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
<%--    <jsp:include page="partials/head.jsp">--%>
<%--        <jsp:param name="title" value="Please Log In" />--%>
<%--    </jsp:include>--%>
</head>
<body>
<div class="container">
    <h1>How would you like your pizza?</h1>
    <form action="/login.jsp" method="POST">
        <div class = "form-group">
            <label for="sauce">Choose sauce:</label>
            <select name="sauce" id="sauce">
                <option value="no sauce">No Sauce</option>
                <option value="light sauce">Light Sauce</option>
                <option value="regular sauce">Regular Sauce</option>
                <option value="audi">Extra Sauce</option>
            </select>
        </div>

        <div class = "form-group">
            <label for="crust">Choose crust:</label>
            <select name="crust" id="crust">
                <option value="thin">Thin</option>
                <option value="hand tossed">Hand Tossed</option>
                <option value="stuffed">Stuffed</option>
                <option value="deep dish">Deep Dish</option>
            </select>
        </div>
        <br>
        <div class="form-group">Choose Toppings:
            <div class="checkbox">
                <input type="checkbox" id="toppings1" name="toppings1" value="Pepperoni">
                <label for="toppings1"> Pepperoni</label><br>
                <input type="checkbox" id="toppings2" name="toppings2" value="Sausage">
                <label for="toppings2"> Sausage</label><br>
                <input type="checkbox" id="toppings3" name="toppings3" value="Jalapeno">
                <label for="toppings3"> Jalapeno</label><br>
                <input type="checkbox" id="toppings4" name="toppings4" value="Green Pepper">
                <label for="toppings4"> Green Pepper</label><br>
                <input type="checkbox" id="toppings5" name="toppings5" value="Onion">
                <label for="toppings5"> Onion</label><br>
            </div>
                 <button type="submit" class="btn btn-default">Submit</button>
            </div>

        <br>
        <div class="form-group">
            <label for="delivery address">Delivery Address</label>
            <input id="delivery address" name="address" class="form-control" type="address">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</div>
</body>
</html>