import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import curso.jpa.entity.Estado;
import curso.jpa.entity.Regional;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			
			Estado poa = new Estado();
			poa.setNome("Porto Alegre");
			
			entityManager.persist(poa);
			
			Estado sc = new Estado();
			sc.setNome("Santa Catarina");
			
			entityManager.persist(sc);
			
			Regional r = new Regional();
			r.setNome("Regiao 01");
			r.getEstados().add(poa);
			r.getEstados().add(sc);
			
			poa.setRegional(r);
			sc.setRegional(r);

			entityManager.persist(r);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		try {
			transaction.begin();
			
			Query query = entityManager.createQuery("select r from Regional r");
			Regional regional = (Regional) query.getResultList().iterator().next();
			
			for (Estado est: regional.getEstados()) {
				System.out.println(est.getNome());
			}
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
