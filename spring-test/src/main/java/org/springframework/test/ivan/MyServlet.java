package org.springframework.test.ivan;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class MyServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {

	}
}
