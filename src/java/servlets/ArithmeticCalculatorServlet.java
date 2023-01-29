package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David Doan
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get the two parameters from the POST request
        String firstnumber = request.getParameter("firstnumber");
        String secondnumber = request.getParameter("secondnumber");
        String equation = request.getParameter("equation");

        // set the attributes for the JSP
        request.setAttribute("firstnumber", firstnumber);
        request.setAttribute("secondnumber", secondnumber);

        try {
            int firstnumb = Integer.parseInt(firstnumber);
            int secondnumb = Integer.parseInt(secondnumber);
            int total = 0;

            //Equation operation selection results
            switch (equation) {
                case "+":
                    total = firstnumb + secondnumb;
                    // set an attribute for the message
                    request.setAttribute("message", total);
                    break;
                case "-":
                    total = firstnumb - secondnumb;
                    // set an attribute for the message
                    request.setAttribute("message", total);
                    break;
                case "*":
                    total = firstnumb * secondnumb;
                    // set an attribute for the message
                    request.setAttribute("message", total);
                    break;
                case "%":
                    total = firstnumb % secondnumb;
                    // set an attribute for the message
                    request.setAttribute("message", total);
                    break;
            }
        } catch (NumberFormatException e) {
            //  Block of code to handle text input errors
            request.setAttribute("message", "Invalid");
        }
        // return to first page
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

}

