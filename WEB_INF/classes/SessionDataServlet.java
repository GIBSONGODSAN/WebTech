import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionDataServlet")
public class SessionDataServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the current session or create a new one if it doesn't exist
        HttpSession session = request.getSession();

        // Get session attributes
        String username = (String) session.getAttribute("username");
        String userRole = (String) session.getAttribute("userRole");

        response.getWriter().println("Username: " + username);
        response.getWriter().println("User Role: " + userRole);
    }
}
