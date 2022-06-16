import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColor", value = "/pick-color")
public class PickColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String pickcolor = request.getParameter("pickcolor");
//        request.setAttribute("pickcolor", pickcolor);
//        System.out.println("Favorite color " + pickcolor);


        request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pickcolor = request.getParameter("pickcolor");
        response.sendRedirect("/view-color?pickcolor=" + pickcolor);


    }
}