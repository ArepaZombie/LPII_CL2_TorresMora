package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import model.TblUsuariocl2;

/**
 * Servlet implementation class UsuarioControler
 */
public class UsuarioControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblUsuariocl2 usuario = new TblUsuariocl2();
		UsuarioDao crud = new UsuarioDao();
		
		String user = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		//asignamos valores
		usuario.setUsuariocl2(user);
		usuario.setPasswordcl2(password);
		
		//validamos al usuario
		String mensaje = crud.ValidarUsuario(usuario);
		request.setAttribute("mensaje", mensaje);
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
