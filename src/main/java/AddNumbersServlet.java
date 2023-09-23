

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddNumbersServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.sendRedirect("index.html");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		// Get the values from the HTML form
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");

        // Parse the values as integers
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Perform addition
        int result = num1 + num2;

        // Create the response
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Result:</h2>");
        response.getWriter().println("<p>" + num1 + " + " + num2 + " = " + result + "</p>");
        response.getWriter().println("</body></html>");
	}

}
