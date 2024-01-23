import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("Hello, World!");
    }
}
