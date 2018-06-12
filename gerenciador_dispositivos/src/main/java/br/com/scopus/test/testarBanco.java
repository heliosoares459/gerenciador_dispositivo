package br.com.scopus.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.scopus.model.Dispositivo;
import br.com.scopus.model.Reserva;
import br.com.scopus.model.Usuario;
import br.com.scopus.util.JPAUtil;

public class testarBanco {

	public static void main(String[] args) {

		Usuario user = new Usuario();

		user.setArea("mobile");
		user.setEmail("hsoares@scopus.com.br");
		user.setId_nivel(1);
		user.setNome("Helena");
		user.setRamal("546546554");
		user.setSenha("123mudar");
		user.setUsuarioRede("hsoares");

		/*
		 * EntityManager em = new JPAUtil().getEntityManager();
		 * 
		 * em.getTransaction().begin(); em.persist(user); em.getTransaction().commit();
		 * 
		 * em.close();
		 * 
		 * Dispositivo disp = new Dispositivo(); disp.setModelo("A5");
		 * disp.setAcessorios("fone e carregador"); disp.setCodigo_modelo("123");
		 * disp.setFabricante(("samsung").toUpperCase());
		 * disp.setObservacoes("modelo com alguns arranhoes");
		 * disp.setResponsavel_id(user);
		 * 
		 * Reserva res = new Reserva(); res.setDispositivo(disp); res.setUsuario(user);
		 * res.setStatus("equipe de mobile deverá usar durante uma semana");
		 * 
		 * 
		 * EntityManager em = new JPAUtil().getEntityManager();
		 * em.getTransaction().begin(); em.persist(user); em.persist(disp);
		 * em.persist(res); em.getTransaction().commit();
		 * 
		 * em.close();
		 */

		///////////////////////////////////////////////////////////////////////////////////////////////////

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Usuario usuario = new Usuario();
		usuario.setUsuario_id(4);

		String jpql = "select r from Reserva r where r.usuario = :pUsuario";
		Query query = em.createQuery(jpql);
		query.setParameter("pUsuario", usuario);

		List<Reserva> resultados = query.getResultList();

		for (Reserva res : resultados) {
			System.out.println("Descricao: " + res.getStatus());
			System.out.println("Usuario.id: " + res.getUsuario().getUsuario_id());
		}

		em.getTransaction().commit();
		em.close();

		///////////////////////////////////////////////////////////////////////////////////////////////////

		EntityManager em1 = new JPAUtil().getEntityManager();
		em1.getTransaction().begin();

		Usuario usuario1 = new Usuario();
		usuario1.setUsuario_id(4);

		String jpql1 = "select d from Dispositivo d join d.responsavel_id u where u = :pUsuario";
		Query query1 = em1.createQuery(jpql1);
		query1.setParameter("pUsuario", usuario1);

		List<Dispositivo> result = query1.getResultList();

		for (Dispositivo disp : result) {
			System.out.println("Descricao: " + disp.getObservacoes());
			System.out.println("Usuario.id: " + disp.getResponsavel_id().getNome());
		}

		em1.getTransaction().commit();
		em1.close();

		///////////////////////////////////////////////////////////////////////////////////////////////////

		EntityManager em2 = new JPAUtil().getEntityManager();
		em2.getTransaction().begin();

		Dispositivo dispos = em2.find(Dispositivo.class, 2);

		Usuario usu = dispos.getResponsavel_id();

		System.out.println("Usuario : " + usu.getNome());

		em2.getTransaction().commit();
		em2.close();

		
		//@OneToMany(mappedBy="conta") - SERVE PARA CASOS EM QUE TEMOS CLASSES COM RELAÇÃO 1 - N, EXEMPLO
		// 1 CONTA TEM N TRANSAÇÕES, N TRANSAÇOES TEM 1 CONTA, LOGO SE EU PUXAR DAS TRANSAÇÕES QUAL A CONTA EU CONSIGO INSTANCIAR MAS SE 
		// EU BUSCAR AS TRANSAÇÕES A PARTIR DESSA INSTANCIA DARÁ ERRO. 
		
	}

}
