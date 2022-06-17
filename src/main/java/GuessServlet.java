import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Guess", urlPatterns = "/guess")

public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        double randomNo = Math.floor(Math.random() * 3) + 1;
        String number = request.getParameter("number");
        double answerInt = Integer.parseInt(number);

        if (randomNo == answerInt) {
            String result = "You won! Your number was " + number + " The correct number was " + Math.round(randomNo) +
                    ".";
            request.setAttribute("result", result);
            response.sendRedirect("/correct?result=" + result);
//
        } else {
            String result = "You lost. Your number was " + number + " The correct number was " + Math.round(randomNo) +
                    ".";
            request.setAttribute("result", result);
            response.sendRedirect("/incorrect?result=" + result);
//

        }


        }

}


