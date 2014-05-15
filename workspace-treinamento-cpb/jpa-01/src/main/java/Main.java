import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import curso.jpa.entity.Message;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();

			Message m1 = new Message();
			m1.setText("Texto Message 1");

			entityManager.persist(m1);

			Message m2 = new Message();
			m2.setText("Texto Message 2");
			m2.setNextMessage(m1);

			entityManager.persist(m2);

			// if (true) throw new RuntimeException("Simula Erro");

			Query query = entityManager
					.createQuery("from Message order by text");
			@SuppressWarnings("unchecked")
			List<Message> resultList = query.getResultList();

			System.out.println("Lista de Mensagens");
			System.out.println("------------------");
			for (Message m : resultList) {
				System.out.println(m);
			}

			Message m = entityManager.find(Message.class, new Long(1));
			System.out.println(m.getText());
			m.setText(m.getText() + "***");

			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
