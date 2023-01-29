package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David Doan
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get the two parameters from the POST request
        String age = request.getParameter("age");

        // set the attributes for the JSP
        request.setAttribute("age", age);

        // validation: if the parameters don't exist or are empty, show the first page again
        if (age == null || age.equals("")) {
            // set an attribute for a message
            request.setAttribute("message", "You must give your current age.");
            // forward the request and response objects to the JSP
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
                    .forward(request, response);
            return; // very important!
        } else {
            try {
                int ageInput = Integer.parseInt(age);
                // set an attribute for the message and adds 1
                request.setAttribute("message", "Your age next birthday will be " + ++ageInput);
            } catch (Exception e) {
                //  Block of code to handle text input errors
                request.setAttribute("message", "You must enter a number.");
            }
            // return to first page
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
                    .forward(request, response);
        }
    }
}
