package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import interfaces.IeUsuario;
import model.TblUsuariocl2;

public class UsuarioDao implements IeUsuario {

	@Override
	public String ValidarUsuario(TblUsuariocl2 usuario) {
		//conexión con unidad de persistencia
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_TorresMora");
		//gestionamos la entidad
		EntityManager em=conex.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		
		//aplicamos JPQL
		Query consulta = em.createQuery("select u from TblUsuariocl2 u "
				+ "where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
		//pasamos los parametros
		consulta.setParameter("x", usuario.getUsuariocl2());
		consulta.setParameter("y", usuario.getPasswordcl2());
		
		TblUsuariocl2 u;
		String mensaje;
		
		try{
			u=(TblUsuariocl2) consulta.getSingleResult();
			mensaje="Usuario existe! :D";
		}catch(Exception e){
			mensaje="Error! Ingrese de nuevo los datos";
		}
		
		return mensaje;
	}

}
