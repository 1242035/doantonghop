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
		String file=request.getParameter("file");
		System.out.println(file);
		String view="WEB-INF/view/";
		if(file!=null)
		{
			view=view+"upload_trang.jsp?file="+file;
			
			System.out.println("xac dinh duoc bien gui qua");
			
			
		}
		else
		{
			view=view+"trang.jsp";
			System.out.println("chua xac dinh dc");
			
			
			
			
		}
		RequestDispatcher dis=request.getRequestDispatcher(view);
		dis.forward(request, response);
	}

}
