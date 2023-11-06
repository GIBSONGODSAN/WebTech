import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Verify the username and password (for simplicity, always assume valid for this example)
        if (true) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("jsp/WelcomePage.jsp");
        } else {
            response.sendRedirect("jsp/ErrorPage.jsp");
        }
    }
}
