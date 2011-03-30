package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.ls.LSParser;

import service.LoaispService;
import service.SanphamService;

import java.util.List;
import model.Loaisp;
import model.Sanpham;
/**
 * Servlet implementation class trangchu
 */
public class trangchu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private LoaispService lsp;
	private SanphamService sp;
    public trangchu() {
        super();
        lsp=new LoaispService();
        sp=new SanphamService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view="WEB-INF/view/";
		String id=request.getParameter("id");
		String id2=request.getParameter("id2");
		if(id!=null)
		{
			view=view+"chitietsp.jsp";
			List<Loaisp> dslsp=lsp.findalllaptop();
			request.setAttribute("dslsp",dslsp);
			
			List<Loaisp> dslspdt=lsp.findalldienthoai();
			request.setAttribute("dslspdt",dslspdt);
			
			
			
			List<Sanpham> dssp=lsp.findListSPByID(id); 
			request.setAttribute("dssp", dssp);
		}
		else
		{
			if(id2!=null)
			{
				view=view+"showchitiet.jsp";
				List<Sanpham> dssp=sp.showsp(id2);
				request.setAttribute("dssp", dssp);
				
				List<Loaisp> dslsp=lsp.findalllaptop();
				request.setAttribute("dslsp",dslsp);
				
				List<Loaisp> dslspdt=lsp.findalldienthoai();
				request.setAttribute("dslspdt",dslspdt);
				
				
			}
			else
			{
			view=view+"dslsp.jsp";
			List<Loaisp> dslsp=lsp.findalllaptop();
			request.setAttribute("dslsp", dslsp);
			
			List<Loaisp> dslspdt=lsp.findalldienthoai();
			request.setAttribute("dslspdt",dslspdt);
			
			List<Sanpham> sptc=sp.findall();
			request.setAttribute("sptc", sptc);
			}
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
