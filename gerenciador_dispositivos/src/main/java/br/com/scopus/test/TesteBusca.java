package br.com.scopus.test;

import javax.persistence.EntityManager;

import br.com.scopus.model.Usuario;
import br.com.scopus.util.JPAUtil;
 
public class TesteBusca {
	
	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		Usuario user = em.find(Usuario.class, 2);
		
		System.out.println(""+user.getNome());
		
		user.setNome("Hélio Soares");
		
		em.getTransaction().commit();
		
	}

}
