import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Student Registration</title></head><body>");
        out.println("<h1>Student Registration Form</h1>");
        out.println("<form method='post'>");
        out.println("Name: <input type='text' name='name'><br>");
        out.println("Roll Number: <input type='text' name='roll'><br>");
        out.println("<input type='submit' value='Register'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String roll = request.getParameter("roll");

        out.println("<html><head><title>Student Details</title></head><body>");
        out.println("<h1>Student Details</h1>");
        out.println("Name: " + name + "<br>");
        out.println("Roll Number: " + roll + "<br>");
        out.println("</body></html>");
    }
}
