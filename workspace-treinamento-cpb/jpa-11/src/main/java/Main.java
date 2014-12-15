
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import curso.jpa.entity.Evento;
import curso.jpa.entity.Material;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			
			Evento evento = new Evento();
			evento.setNome("Evento 1");
			
			entityManager.persist(evento);
			
			Material m1 = new Material();
			m1.setDescricao("Material 01");
			m1.setQuantidade(10f);
			m1.setReferencia("Ref 01");
			m1.setValorUnitario(15.02f);
			m1.setEvento(evento);
			
			entityManager.persist(m1);
			
			Material m2 = new Material();
			m2.setDescricao("Material 01");
			m2.setQuantidade(10f);
			m2.setReferencia("Ref 01");
			m2.setValorUnitario(15.02f);
			m2.setEvento(evento);
			
			entityManager.persist(m2);
			
			evento.getMateriais().add(m1);
			evento.getMateriais().add(m2);
			
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
