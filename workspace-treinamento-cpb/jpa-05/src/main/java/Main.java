import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import curso.jpa.entity.Endereco;
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
			
			Telefone tel = new Telefone();
			tel.setArea(61);
			tel.setTelefone(30273045L);
			
			entityManager.persist(tel);
			
			Telefone cel = new Telefone();
			cel.setArea(61);
			cel.setTelefone(99801234L);
			
			entityManager.persist(cel);
			
			Pessoa p = new Pessoa();
			p.setNome("Jose da Silva");
			
			Endereco e = new Endereco();
			e.setRua("Araucaria");
			e.setCidade("Brasilia");
			e.setEstado("DF");
			e.setCep("88000000");
			
			entityManager.persist(e);
			
			p.setEndereco(e);
			
			List<Telefone> listTels = new ArrayList<Telefone>();
			listTels.add(tel);
			listTels.add(cel);
			p.setTelefones(listTels);
			
			entityManager.persist(p);
			
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
			entityManager.persist(p);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}*/
	}
}
