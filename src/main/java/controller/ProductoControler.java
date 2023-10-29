package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductoDao;
import model.TblProductocl2;

/**
 * Servlet implementation class ProductoControler
 */
public class ProductoControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductoDao dao = new ProductoDao();
		
		List<TblProductocl2> lista = dao.ListarProductos();
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("/listarProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Instanciamos
		TblProductocl2 p = new TblProductocl2();
		ProductoDao dao = new ProductoDao();
		
		//Leyemos los datos
		String nombre = request.getParameter("nombre");
		String preventa = request.getParameter("precioventa");
		String precompra = request.getParameter("preciocompra");
		String estado = request.getParameter("estado");
		String descripcion = request.getParameter("descripcion");
		
		//Asigamos los valores al objeto
		p.setNombrecl2(nombre);
		p.setPrecioventacl2(Double.parseDouble(preventa));
		p.setPreciocompracl2(Double.parseDouble(precompra));
		p.setEstadocl2(estado);
		p.setDescripcion(descripcion);
		
		//Registramos
		dao.RegistrarProducto(p);
		
		//Listamos
		List<TblProductocl2> lista = dao.ListarProductos();
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("/listarProductos.jsp").forward(request, response);
		
		
	}

}
