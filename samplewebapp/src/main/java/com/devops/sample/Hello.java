package com.devops.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public  class Hello
  extends HttpServlet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
  {
    response.setContentType("text/html");
    PrintWriter writer = response.getWriter();
    
    writer.println("<html>");
    writer.println("<head>");
    writer.println("<title>Sample Application Servlet Page</title>");
    writer.println("</head>");
    writer.println("<body bgcolor= white>");
    
    writer.println("<table border=\"0\">");
    writer.println("<tr>");
    
    writer.println("<td>");
    writer.println("<h1>Sample Application Servlet</h1>");
    writer.println("This is the output of a servlet that is part of");
    writer.println("the sample application.");
    writer.println("</td>");
    writer.println("</tr>");
    writer.println("</table>");
    
    writer.println("</body>");
    writer.println("</html>");
  }
}

