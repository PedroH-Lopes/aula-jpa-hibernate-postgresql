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

        Pessoa p = em.find(Pessoa.class, 2);

        System.out.println(p);

        System.out.println("Pronto!");

        em.close();
        emf.close();

    }
}
