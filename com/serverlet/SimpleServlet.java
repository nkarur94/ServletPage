package com.serverlet;


public class SimpleServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello world My first Servlet </h1>");
        out.close();
	}
}
