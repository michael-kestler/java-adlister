import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet(urlPatterns = "/login.do")
    public class LoginPracticeServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request,
                             HttpServletResponse response) throws ServletException, IOException {

                request.getRequestDispatcher("/views/login.jsp").forward(request, response);

        }




    }



//        PrintWriter out = response.getWriter();
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<style>");
//            out.println("body{color: red}");
//            out.println("body{font-size: 28px}");
//            out.println("</style>");
//            out.println("<title>Yahoo</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("My First Servlet");
//            out.println("</body>");
//            out.println("</html>");


