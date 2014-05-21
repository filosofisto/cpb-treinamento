import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import curso.jpa.entity.Funcionario;
import curso.jpa.entity.Pessoa;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			
			Pessoa p = new Pessoa();
			p.setNome("Jose da Silva");
			
			entityManager.persist(p);
			
			Funcionario f = new Funcionario();
			f.setNome("Joao Trabalhador");
			f.setSalario(10000.0);
			
			entityManager.persist(f);
			
			Query query = entityManager
					.createQuery("select p from Pessoa p");
			List<Pessoa> pessoas = query.getResultList();
			
			System.out.println("Pessoas: " + pessoas.size());
			
			Query queryF = entityManager
					.createQuery("select f from Funcionario f");
			List<Funcionario> funcionarios = queryF.getResultList();
			
			System.out.println("Funcionarios: " + funcionarios.size());
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
