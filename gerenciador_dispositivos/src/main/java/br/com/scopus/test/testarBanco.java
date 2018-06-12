package br.com.scopus.test;

import javax.persistence.EntityManager;

import br.com.scopus.model.Dispositivo;
import br.com.scopus.model.Reserva;
import br.com.scopus.model.Usuario;
import br.com.scopus.util.JPAUtil;

public class testarBanco {

	public static void main(String[] args) {

		Usuario user = new Usuario();
		
		Dispositivo disp = new Dispositivo();
		
		Reserva res = new Reserva();
		
		user.setArea("mobile");
		user.setEmail("hsoares@scopus.com.br");
		user.setId_nivel(1);
		user.setNome("Hélio");
		user.setRamal("546546554");
		user.setSenha("123mudar");
		user.setUsuarioRede("hsoares");
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();

		em.close();
		
		/*EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("gerenciador");
		EntityManager em1 = emf1.createEntityManager();
		
		em1.getTransaction().begin();
		em1.persist(disp);
		em1.getTransaction().commit();
		
		em1.close();
		emf1.close();
		
		
		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("gerenciador");
		EntityManager em2 = emf2.createEntityManager();
		
		em2.getTransaction().begin();
		em2.persist(res);
		em2.getTransaction().commit();
		
		em2.close();
		emf2.close();*/
		
	}

}
