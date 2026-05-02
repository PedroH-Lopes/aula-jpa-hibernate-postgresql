package br.com.pedrohlopes.aplicacao;

import br.com.pedrohlopes.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "carlos da silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "joaquim da silva", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null, "julia da silva", "julia@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
