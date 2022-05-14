package com;




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