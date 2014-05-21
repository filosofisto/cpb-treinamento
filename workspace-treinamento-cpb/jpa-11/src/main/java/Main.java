import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import curso.jpa.entity.Pessoa;
import curso.jpa.entity.Telefone;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			
			Pessoa joao = new Pessoa();
			joao.setNome("Jose da Silva");
			
			Telefone tel = new Telefone();
			tel.setPais(55);
			tel.setArea(61);
			tel.setTelefone(30273045L);
			
			joao.getTelefones().add(tel);
			
			Telefone cel = new Telefone();
			tel.setPais(55);
			cel.setArea(61);
			cel.setTelefone(99801234L);
			
			joao.getTelefones().add(cel);

			entityManager.persist(joao);
			
			Pessoa esposaJoao = new Pessoa();
			esposaJoao.setNome("Maria da Silva");
			
			esposaJoao.getTelefones().add(tel);
			
			entityManager.persist(esposaJoao);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		/*try {
			transaction.begin();
			
			//Endereco orfao
			Pessoa p = entityManager.find(Pessoa.class, new Long(1));
			p.setEndereco(null);
			p.getTelefones().clear();
			//entityManager.persist(p);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}*/
	}
}
