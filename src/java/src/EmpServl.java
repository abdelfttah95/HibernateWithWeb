package src;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author abdel
 */
public class EmpServl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Employee e = new Employee();
        e.setFirstName(request.getParameter("first"));
        e.setLastName(request.getParameter("last"));
        e.setPosition(request.getParameter("position"));
        e.setSalary(request.getParameter("salary"));
        
        EmployeeM1 p = new EmployeeM1();
        p.addEmp(e);
        
        String message = "Data Inserted ...";
        request.setAttribute("message", message);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Emp.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
