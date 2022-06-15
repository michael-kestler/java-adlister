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
////        request.setAttribute("address", address);
//        System.out.println("Your delivery address is " + address);

        //Step 1: get request dispatcher
        request.getRequestDispatcher("/order.jsp").forward(request, response);

        //Step 2: forward the request to JSP

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read form fields
        String address = request.getParameter("address");


        System.out.println("address: " + address);


        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Your delivery address is: " + address + "<br/>";
        htmlResponse += "</html>";

        // return response
        writer.println(htmlResponse);

    }
}
