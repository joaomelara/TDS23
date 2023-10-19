

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BebidaServlet
 */
@WebServlet("/BebidaServlet")
public class BebidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BebidaDao bebida;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BebidaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		bebida = new BebidaDao();
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String Tipo = request.getParameter("Tipo");
		String Marca = request.getParameter("Marca");
		String Data_Val = request.getParameter("Data de validade");
		Double Preco = Double.parseDouble(request.getParameter("preço"));
		Bebida newBebida = new Bebida (Tipo, Marca, Data_Val, Preco);
		try {
			bebida.insertChocolate(newBebida);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("list");
	}
	
	private void insertBebida(HttpServletRequest request, HttpServletResponse response)
			throws IOException,SQLException{
		String Tipo = request.getParameter("Tipo");
		String Marca = request.getParameter("Marca");
		String Data_Val = request.getParameter("Data de validade");
		Double Preco = Double.parseDouble(request.getParameter("preço"));
		Bebida newBebida = new Bebida (Tipo, Marca, Data_Val, Preco);
		bebida.insertChocolate(newBebida);
		response.sendRedirect("list");
	}
	
	private void updateBebida(HttpServletRequest request, HttpServletResponse response)
			throws IOException,SQLException{
		Integer Id = Integer.parseInt(request.getParameter("id"));
		String Tipo = request.getParameter("Tipo");
		String Marca = request.getParameter("Marca");
		String Data_Val = request.getParameter("Data de validade");
		Double Preco = Double.parseDouble(request.getParameter("preço"));
		Bebida newBebida = new Bebida (Tipo, Marca, Data_Val, Preco);
		Bebida book = new Bebida ( Tipo, Marca, Data_Val, Preco);
		bebida.updateChocolate(book);
		response.sendRedirect("list");
				
		
	}
	
	private void deleteBebida(HttpServletRequest request, HttpServletResponse response)
			throws IOException,SQLException{
		int Id = Integer.parseInt(request.getParameter("id"));
		bebida.deleteChocolate(id);
		response.sendRedirect("list");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
