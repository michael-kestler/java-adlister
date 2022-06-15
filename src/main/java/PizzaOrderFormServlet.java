import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PizzaOrderFormServlet", value = "/pizzaservlet")
public class PizzaOrderFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Step 0: Add data
//        String address = request.getParameter("delivery address");
//        request.setAttribute("address", address);
//        System.out.println("Your delivery address is " + address);

        //Step 1: get request dispatcher
        request.getRequestDispatcher("/order.jsp").forward(request, response);

        //Step 2: forward the request to JSP

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read form fields
        String sauce = request.getParameter("sauce");
        System.out.println("Sauce is: " + sauce);

        PrintWriter writer1 = response.getWriter();

        String sauceResponse = "<html>";
        sauceResponse += "<h2>Your order is as follows... <br/>";
        sauceResponse += "Sauce: " + sauce + "<br/>";
        sauceResponse += "</html>";

        writer1.println(sauceResponse);

        String crust = request.getParameter("crust");
        System.out.println("Crust: " + crust);

        PrintWriter writer2 = response.getWriter();

        String crustResponse = "<html>";
        crustResponse += "Crust: " + crust + "<br/>";
        crustResponse += "</html>";

        writer2.println(crustResponse);

        String toppings[] = request.getParameterValues("toppings");

        if (toppings != null) {
            System.out.println("Toppings are: ");
            for (String topping : toppings) {
                System.out.println("\t" + topping);

                PrintWriter writer3 = response.getWriter();

                String toppingResponse = "<html>";
                toppingResponse += "Toppings: " + topping + "<br/>";
                toppingResponse += "</html>";

                writer3.println(toppingResponse);
            }

        }







        String address = request.getParameter("address");


        System.out.println("address: " + address);


        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlResponse = "<html>";
        htmlResponse += "Delivery address: " + address + "<br/>";
        htmlResponse += "</html>";

        // return response
        writer.println(htmlResponse);









    }
}
