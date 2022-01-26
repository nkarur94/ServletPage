package com.serverlet;

public class LoginServlet {
	@WebServlet(
	        description = "Login Servlet Testing",
	        urlPatterns = {"/LoginServlet"},
	        initParams = {
	                @WebInitParam(name="user", value="Brijesh"),
	                @WebInitParam(name="password",value = "Brijesh@534")
	        }
	)
	public class LoginServlet extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String user = request.getParameter("user");
	        String pwd = request.getParameter("pwd");
	        String userID = getServletConfig().getInitParameter("user");
	        String password = getServletConfig().getInitParameter("password");
	        if (userID.equals(user) && password.equals(pwd)) {
	            request.setAttribute("user", user);
	            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
	        } else {
	            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
	            PrintWriter out = response.getWriter();
	            out.println("<font color=red>Either user name or password is wrong.</font>");
	            rd.include(request, response);
	        }
		}
}
