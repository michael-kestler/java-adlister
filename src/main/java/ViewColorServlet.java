import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewColor", value = "/view-color")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pickcolor = request.getParameter("pickcolor");
        request.setAttribute("pickcolor", pickcolor);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
    }


}
