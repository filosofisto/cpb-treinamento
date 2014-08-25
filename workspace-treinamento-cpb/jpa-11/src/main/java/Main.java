import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import curso.jpa.entity.Confederacao;
import curso.jpa.entity.Modalidade;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			
			Modalidade m1 = new Modalidade();
			m1.setNome("Atletismo");
			
			entityManager.persist(m1);
			
			Modalidade m2 = new Modalidade();
			m2.setNome("Natacao");
			
			entityManager.persist(m2);
			
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		try {
			transaction.begin();
			
			Confederacao c = new Confederacao();
			c.setNome("C1");
			
			Modalidade m1 = entityManager.find(Modalidade.class, 1L);
			m1.setConfederacao(c);
			
			c.getModalidades().add(m1);
			
			Modalidade m2 = entityManager.find(Modalidade.class, 2L);
			m2.setConfederacao(c);
			
			c.getModalidades().add(m2);

			entityManager.persist(c);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		try {
			transaction.begin();
			
			Confederacao c = entityManager.find(Confederacao.class, 1L);

			for (Modalidade m: c.getModalidades()) {
				m.setConfederacao(null);
			}

			c.getModalidades().clear();
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
