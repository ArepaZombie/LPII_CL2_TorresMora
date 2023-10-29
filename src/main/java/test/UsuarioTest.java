package test;

import dao.UsuarioDao;
import model.TblUsuariocl2;

public class UsuarioTest {
	public static void main(String[] args){
		TblUsuariocl2 usuario = new TblUsuariocl2();
		UsuarioDao crud = new UsuarioDao();
		
		//asignamos valores
		usuario.setUsuariocl2("admin");
		usuario.setPasswordcl2("123");
		
		//validamos al usuario
		String mensaje = crud.ValidarUsuario(usuario);
		
		System.out.println(mensaje);
		
	}
}
