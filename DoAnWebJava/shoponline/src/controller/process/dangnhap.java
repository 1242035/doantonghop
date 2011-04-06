package controller.process;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Khachhang;


import service.KhachhangService;

/**
 * Servlet implementation class dangnhap
 */
public class dangnhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private KhachhangService khsv;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhap() {
        super();
        // TODO Auto-generated constructor stub
        khsv = new KhachhangService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		String url = "/WEB-INF/view/process/dangnhap.jsp";
		String s_err = "";

		String tenkh = request.getParameter("tenkh");
		String pass = request.getParameter("pass");
	
		if(tenkh != null && pass != null){
			
			Khachhang kh_visiter = khsv.findByName(tenkh);
			
			if(kh_visiter != null){
				if(kh_visiter.getPass().equals(pass)){
					session.putValue("user", kh_visiter.getTenkh());
					url = "index.htm";
				}
				else{
					s_err += "Nhap sai ten hoac pass";
				}
			}
			else{
				s_err += "Nhap sai ten hoac pass";
			}
		}
		else{
			
		}
		
		request.setAttribute("s_err", s_err);
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
