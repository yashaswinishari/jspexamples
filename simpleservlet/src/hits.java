

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hits
 */
//@WebServlet("/hits")
public class hits extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hits() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    int hits = 0;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter		out;
		String			title = "Simple Servlet Example1";
		hits++;

		// set content type and other response header fields first
		response.setContentType("text/html");

		// then write the response
		out = response.getWriter();

		out.println("<HTML><HEAD><TITLE>");
		out.println(title);
		out.println("</TITLE></HEAD><BODY>");
		out.println("<h1>Simple Servlet Example</h1><br>");
		out.println("<font color=\"#ff0000\">"+hits+"</font> number of times visited");
		out.println("</BODY></HTML>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
