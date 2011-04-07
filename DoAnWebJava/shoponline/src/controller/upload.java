package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import model.Loaisp;
import model.Sanpham;


/**
 * Servlet implementation class upload
 */
public class upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String file=request.getParameter("file");
		//System.out.println(file);
			String view="WEB-INF/view/";
			String masp=request.getParameter("masp");
		 	String tensp=request.getParameter("tensp");
		 	String maloai=request.getParameter("maloai");
		 	System.out.print(masp);
		 	System.out.println(tensp);
		 	//Long gia=Long.parseLong(request.getParameter("gia"));
		 	long gia=10000;
		 	String file=request.getParameter("file");
		 	String mota=request.getParameter("mota");
			
		 	view=view+"upload.jsp?masp="+masp+"&tensp="+tensp+"&maloai="+maloai+"&gia="+gia+"&hinh="+file+"&mota="+mota;
			
		
			
			
			
			
		
		RequestDispatcher dis=request.getRequestDispatcher(view);
		dis.forward(request, response);
	}

}
