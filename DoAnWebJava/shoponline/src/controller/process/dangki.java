package controller.process;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import service.KhachhangService;

import model.Khachhang;

/**
 * Servlet implementation class dangki
 */
public class dangki extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private KhachhangService khsv;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangki() {
        super();
        // TODO Auto-generated constructor stub
        khsv = new KhachhangService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String str_err = "";
		HttpSession session = request.getSession(true);	
		String url = "/WEB-INF/view/process/dangki.jsp";
		
		//get parameter
		String tenkh = request.getParameter("tenkh");
		String pass = request.getParameter("pass");
		
		String dchi = request.getParameter("dchi");
		if(dchi == null)dchi = " ";
		
		String phone = request.getParameter("phone");
		if(phone == null)phone = " ";
		
		String email = request.getParameter("email");
		if(email == null)email = " ";
		
		//tenkh and pass need value , other paramerter can null
		if(tenkh != null && pass != null ){
				
			if(!tenkh.equals("") && !pass.equals("") && khsv.findByName(tenkh) == null){
				if(khsv.createKhachhang(tenkh, dchi, phone, email, pass)){
					session.putValue("user", tenkh);
					url = "index.htm";
				}
				else{
					str_err += "Du lieu nhap sai hoac da co nguoi dang ki tai khoan nay";
				}
			}
			else{
				str_err += "Du lieu nhap sai hoac da co nguoi dang ki tai khoan nay";
			}
		}
		else{
			
		}
		
		request.setAttribute("err", str_err);
		//forward
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
