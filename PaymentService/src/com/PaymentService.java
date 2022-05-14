package com;

import com.Payment;
import java.io.IOException; 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* Servlet implementation class PaymentService
*/
@WebServlet("/PaymentService")
public class PaymentService extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	Payment payObj = new Payment();
   /**
    * @see HttpServlet#HttpServlet()
    */
   public PaymentService() {
       super();
       // TODO Auto-generated constructor stub
   }
   
   /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String output = payObj.insertPayment(request.getParameter("CustomerName"),      
				request.getParameter("BillAmount"),
				request.getParameter("AccountNo")); 
	 
				response.getWriter().write(output);
	}
	
	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method

		Map paras = getParasMap(request); 
		 
		 String output = payObj.updatePayment(paras.get("hidPaymentIDSave").toString(),     
		    		paras.get("CustomerName").toString(),     
		    		paras.get("BillAmount").toString(),
		    		paras.get("AccountNo").toString()); 
		 
		 			response.getWriter().write(output);
	}
  
}