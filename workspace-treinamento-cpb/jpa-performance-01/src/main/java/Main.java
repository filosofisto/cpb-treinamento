
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

import curso.jpa.entity.Evento;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");

		//ATUALIZACAO DE 1 REGISTRO
		execQuery(factory);
		
		updateLine(factory, 1L);
		//insertLine(factory);
		
		execQuery(factory);
	
		//CONSULTA APENAS
		/*for (int i = 0; i < 10; i++) {
			execQuery(factory);
		}*/	
	}
	
	private static void insertLine(EntityManagerFactory factory) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			
			Evento evt = new Evento();
			evt.setNome("**NOVO**");
			
			entityManager.persist(evt);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	private static void updateLine(EntityManagerFactory factory, long id) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			
			Evento evt = entityManager.find(Evento.class, id);
			evt.setNome("**ALTERADO***");
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	private static void execQuery(EntityManagerFactory factory) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			
			long t1 = System.currentTimeMillis();
			
			Query query = entityManager.createNamedQuery("eventos");
			query.setHint("org.hibernate.cacheable", true);
			
			query.getResultList();
			
			long t2 = System.currentTimeMillis();
			System.out.printf("\nTempo de execucao: %d ms", (t2-t1));
			
			Session session = entityManager.unwrap(Session.class);
			Statistics statistics = session.getSessionFactory().getStatistics();
			System.out.printf("\n2 level cache: %d", statistics.getSecondLevelCacheHitCount());
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	private static void populate(EntityTransaction transaction, EntityManager entityManager) {
		transaction.begin();

		for (int i = 1; i < 1001; i++) {
			Evento evento = new Evento();
			evento.setNome("Evento " + i);
			
			entityManager.persist(evento);
		}
		
		transaction.commit();
	}
	
}
