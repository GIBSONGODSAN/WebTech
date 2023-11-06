import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve session data from hidden fields
        String sessionId = request.getParameter("sessionId");
        String username = request.getParameter("username");

        // Perform session-related operations, such as storing data in session attributes
        HttpSession session = request.getSession();
        session.setAttribute("sessionId", sessionId);
        session.setAttribute("username", username);

        // Redirect to another page
        response.sendRedirect("welcome.jsp");
    }
}
