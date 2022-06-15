import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "PizzaOrderFormServlet", value = "/pizzaservlet")
public class PizzaOrderFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Step 0: Add data
        String address = request.getParameter("delivery_address");
        request.setAttribute("delivery_address", address);

        //Step 1: get request dispatcher
        request.getRequestDispatcher("/order.jsp").forward(request, response);

        //Step 2: forward the request to JSP

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//
//    }
}
