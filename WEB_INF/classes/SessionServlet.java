import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the current session or create a new one if it doesn't exist
        HttpSession session = request.getSession();

        // Set session attributes
        session.setAttribute("username", "john_doe");
        session.setAttribute("userRole", "admin");

        // Set a session timeout (optional)
        session.setMaxInactiveInterval(30 * 60); // 30 minutes

        // Create and send a cookie to the client
        Cookie cookie = new Cookie("sessionId", session.getId());
        cookie.setMaxAge(30 * 60); // Set the cookie's max age to match the session timeout
        response.addCookie(cookie);

        response.getWriter().println("Session created and cookie set.");
    }
}
