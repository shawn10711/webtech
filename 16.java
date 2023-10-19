import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Retrieve employee details from the request
        String empName = request.getParameter("empName");
        String empId = request.getParameter("empId");
        String empDepartment = request.getParameter("empDepartment");
        String empMobile = request.getParameter("empMobile");

        out.println("<html>");
        out.println("<head><title>Employee Details</title></head>");
        out.println("<body>");
        out.println("<h1>Employee Details</h1>");
        out.println("<p>Name: " + empName + "</p>");
        out.println("<p>ID: " + empId + "</p>");
        out.println("<p>Department: " + empDepartment + "</p>");
        out.println("<p>Mobile: " + empMobile + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
