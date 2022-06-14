import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PizzaOrderFormServlet", value = "/Servlet")
public class PizzaOrderFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Step 0: Add data
        String address = request.getParameter("delivery_address");
        request.setAttribute("delivery_address", address);
        
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/main/webapp/order.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
