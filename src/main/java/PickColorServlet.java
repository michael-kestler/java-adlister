import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColor", value = "/pcolorservlet")
public class PickColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("vcolorservlet");

//        String address = request.getParameter("delivery address");
//        request.setAttribute("address", address);
//        System.out.println("Your delivery address is " + address);


        request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);

    }

}