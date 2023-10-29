package test;

import model.TblProductocl2;

import java.util.List;

import dao.ProductoDao;

public class ProductoTest {
	public static void main(String[] args){
		TblProductocl2 producto = new TblProductocl2();
		
		//Registro
		
		producto.setNombrecl2("Arepas");
		producto.setPrecioventacl2(15.0);
		producto.setPreciocompracl2(10.0);
		producto.setEstadocl2("vigente");
		producto.setDescripcion("Pan de harian de maiz molido");
		
		
		//Instanciamos el dao
		ProductoDao dao = new ProductoDao();
		//dao.RegistrarProducto(producto);
		List<TblProductocl2> lista=dao.ListarProductos();
		
		for(TblProductocl2 p:lista){
			System.out.println("- "+p.getNombrecl2());
		}
		
	}
}
