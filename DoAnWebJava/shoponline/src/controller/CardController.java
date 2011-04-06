package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.HoadonService;
import service.SanphamService;

import model.Card;
import model.Hoadon;
import model.Sanpham;

/**
 * Servlet implementation class CardController
 */
public class CardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private BookService bs;
//	private OrderService os;
	
	private SanphamService spsv;
	private HoadonService hdsv;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardController() {
        super();
        // TODO Auto-generated constructor stub    
        spsv = new SanphamService();
        hdsv = new HoadonService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String view = "index.htm";
		
		HttpSession ses = request.getSession();
		String tenkh = (String)ses.getAttribute("user");
		
		Card card = (Card) ses.getAttribute("card");
		if (card==null) {
			card = new Card();
			ses.setAttribute("card", card);
		}
		
		String cmd = request.getParameter("cmd");
		String id = "";
		String _id_ = request.getParameter("id");
		if (_id_!=null) {
			id = _id_;
		}
		
		if(cmd.equals("add")) {
			if (!card.checkSanpham(id)) { 
				Sanpham sp = spsv.findSanPhamByID(id);
				card.add(sp, 1);
			} else
				card.add(id,1);
		}else if(cmd.equals("remove")) {
			card.remove(id);
		}else if(cmd.equals("removeall")) {
			card.removeAll();
		}else if(cmd.equals("checkout")) {
			hdsv.create(card.getItems().values(),tenkh);
			card.removeAll();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

}
