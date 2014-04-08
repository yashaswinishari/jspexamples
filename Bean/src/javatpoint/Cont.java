package javatpoint;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cont
 */
@WebServlet("/Cont")
public class Cont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	      //  PrintWriter out=response.getWriter();  
	          
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	          
	        LoginBean bean=new LoginBean();  
	        bean.setName(name);  
	        bean.setPassword(password);  
	        request.setAttribute("bean",bean);  
	          
	        boolean status = bean.validate();  
	          
	        if(status){  
	            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
	            rd.forward(request, response);  
	        }  
	        else{  
	            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
	            rd.forward(request, response);  
	        }  
	}

}
