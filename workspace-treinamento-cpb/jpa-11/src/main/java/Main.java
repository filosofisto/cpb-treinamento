import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import curso.jpa.entity.Consultor;
import curso.jpa.entity.Consultoria;
import curso.jpa.entity.ConsultoriaPK;
import curso.jpa.entity.Empresa;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa-01");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		/*try {
			transaction.begin();
			
			Consultor jose = new Consultor();
			jose.setNome("Jose");
			
			entityManager.persist(jose);
			
			Consultor joao = new Consultor();
			joao.setNome("Joao");
			
			entityManager.persist(joao);
			
			Empresa cpb = new Empresa();
			cpb.setNome("Comite Paraolimpico Brasileiro");
			
			entityManager.persist(cpb);
			
			Empresa indra = new Empresa();
			indra.setNome("Indra Company");
			
			entityManager.persist(indra);
			
			Consultoria joseCPB = new Consultoria();
			joseCPB.setId(new ConsultoriaPK(cpb.getId(), jose.getId()));
			joseCPB.setValorHora(100f);
			
			entityManager.persist(joseCPB);
			
			Consultoria joseIndra = new Consultoria();
			joseIndra.setId(new ConsultoriaPK(indra.getId(), jose.getId()));
			joseIndra.setValorHora(250f);
			
			entityManager.persist(joseIndra);
			
			Consultoria joaoCPB = new Consultoria();
			joaoCPB.setId(new ConsultoriaPK(cpb.getId(), joao.getId()));
			joaoCPB.setValorHora(90f);
			
			entityManager.persist(joaoCPB);
			
			Consultoria joaoIndra = new Consultoria();
			joaoIndra.setId(new ConsultoriaPK(indra.getId(), joao.getId()));
			joaoIndra.setValorHora(140f);
			
			entityManager.persist(joaoIndra);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}*/
		
		try {
			Query query = entityManager.createQuery("select c from Consultor c");
			List<Consultor> consultores = query.getResultList();
			
			if (!consultores.isEmpty()) {
				Consultor consultor = consultores.get(0);

				List<Consultoria> consultorias = consultor.getConsultorias();
				
				System.out.printf("Consultorias do %s\n", consultor.getNome());
				
				for (Consultoria consultoria: consultorias) {
					System.out.printf("%s - %f\n", consultoria.getEmpresa().getNome(), consultoria.getValorHora());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
