

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class get
 */
//@WebServlet("/get")
public class get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter		out;
		String			title = "Simple Servlet Example2";

		// set content type and other response header fields first
		response.setContentType("text/html");

		// then write the response
		out = response.getWriter();

		out.println("<HTML><HEAD><TITLE>");
		out.println(title);
		out.println("</TITLE></HEAD><BODY>");
		out.println("<H1>Simple Servlet Example2</H1>");
		out.println("<FORM ACTION=\"http://info.cse.iitb.ac.in:5050/servlet/Ex2\" method =\"POST\">");
		out.println("<TABLE BORDER=0>");
		out.println("<TR>");
		out.println("<TD> <P>Enter Your Name</P> </TD>");
		out.println("<TD> <P><INPUT TYPE=text NAME=Name SIZE=50></P> </TD>");
		out.println("</TR>");
		out.println("<TR>");
		out.println("<TD> <P>Enter Your Roll Number</P> </TD>");
		out.println("<TD> <P><INPUT TYPE=text NAME=Roll SIZE=8></P> </TD>");
		out.println("</TR>");
		out.println("<TR>");
		out.println("<TD></TD><TD> <INPUT TYPE=\"submit\" VALUE=\"send\" > <INPUT TYPE=\"reset\" >");
		out.println("</TR>");
		out.println("</TABLE>");
		out.println("</FORM>");
		out.println("</BODY></HTML>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter		out;
		String			title = "Simple Servlet Example2 output";
		String 			name = request.getParameter("Name");
		String 			rollno = request.getParameter("Roll");

		// set content type and other response header fields first
		response.setContentType("text/html"); 
		
		// then write the response
		out = response.getWriter();

		out.println("<HTML><HEAD><TITLE>");
		out.println(title);
		out.println("</TITLE></HEAD><BODY>");
		out.println("<h3>Your name (as entered) is <font color=\"#ff0000\"><i>"+name+"</i></font></br></h3>");
		out.println("<h3>Your Roll No. (as entered) is <font color=\"#ff0000\"><i>"+rollno+"</i></font></br></h3>");
		out.println("</BODY></HTML>");
		out.println("</FORM>");
		out.close();
	
	}

}
