package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Loaisp;
import model.Sanpham;


import service.LoaispService;
import service.SanphamService;

/**
 * Servlet implementation class timkiem
 */
public class timkiem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private SanphamService sp;
	private LoaispService lsp;
    public timkiem() {
        super();
        sp=new SanphamService();
        lsp=new LoaispService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tensp=request.getParameter("tensp");
		String view="WEB-INF/view/";
		if(tensp!=null)
		{
			view=view+"showsearch.jsp";
			
			
			
			List<Loaisp> dslsp=lsp.findalllaptop();
			request.setAttribute("dslsp", dslsp);
			
			List<Loaisp> dslspdt=lsp.findalldienthoai();
			request.setAttribute("dslspdt",dslspdt);
			
			List<Sanpham> sptc=sp.findgd(tensp);
			request.setAttribute("sptc", sptc);
		}
		else
		{
			view=view+"timkiem.jsp";
			
			
			
			List<Loaisp> dslsp=lsp.findalllaptop();
			request.setAttribute("dslsp", dslsp);
			
			List<Loaisp> dslspdt=lsp.findalldienthoai();
			request.setAttribute("dslspdt",dslspdt);
			
			List<Sanpham> sptc=sp.findall();
			request.setAttribute("sptc", sptc);
			
		}
		RequestDispatcher dis=request.getRequestDispatcher(view);
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
