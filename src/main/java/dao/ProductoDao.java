package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IeProducto;
import model.TblProductocl2;

public class ProductoDao implements IeProducto {

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		//conexión con unidad de persistencia
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TorresMora");
		//gestionamos la entidad
		EntityManager em=conex.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//enviamos el producto
		em.persist(producto);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	}

	@Override
	public List<TblProductocl2> ListarProductos() {
		//conexión con unidad de persistencia
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TorresMora");
		//gestionamos la entidad
		EntityManager em=conex.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//sacamos el listado
		List<TblProductocl2> lista = em.createQuery("select p from TblProductocl2 p",TblProductocl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos la lista
		return lista;
	}

}
