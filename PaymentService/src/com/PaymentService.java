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
  
}