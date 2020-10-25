package com.samplecrmproject.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samplecrmproject.models.Accounts;
import com.samplecrmproject.services.AccountsServices;

/**
 * Servlet implementation class AddAccounts
 */
@WebServlet("/AddAccounts")
public class AddAccounts extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB
    AccountsServices as;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAccounts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher views = request.getRequestDispatcher("WEB-INF/views/accounts.jsp");
		views.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String productname = request.getParameter("productname");
		String amount = request.getParameter("amount");
		
		Accounts a = new Accounts();
		a.setName(name);
		a.setProductname(productname);
		a.setAmount(amount);
		as.addAccounts(a);
	}

}
