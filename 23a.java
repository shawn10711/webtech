import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OrderConfirmationServlet")
public class OrderConfirmationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Order Confirmation</title></head><body>");
        out.println("<h1>Order Confirmation</h1>");
        out.println("<p>Confirmed Dishes:</p>");
        
        String[] selectedDishes = request.getParameterValues("dishes");
        if (selectedDishes != null) {
            out.println("<ul>");
            for (String dish : selectedDishes) {
                out.println("<li>" + dish + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No dishes selected.</p>");
        }
        
        out.println("</body></html>");
    }
}
