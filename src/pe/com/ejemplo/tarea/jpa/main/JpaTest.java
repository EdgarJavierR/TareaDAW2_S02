package pe.com.ejemplo.tarea.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pe.com.ejemplo.tarea.jpa.domain.Usuarios;

public class JpaTest {
	
	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TareaDAW2-Sem02");
		EntityManager em = factory.createEntityManager();
		JpaTest test = new JpaTest(em);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			test.crearUsuario();
		tx.commit();
		System.out.println("...Hecho");
	}
	
	private void crearUsuario() {
		Usuarios usu1 = new Usuarios(1,"Lola","Soto","5/9/17",2);
		manager.persist(usu1);
	}

}
