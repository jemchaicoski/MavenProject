/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.edu.br.trabalhomavenprog4.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class TestarPedido {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("João da Silva", "josilva@gmail.com", 70.5f);
        Pedido pedido = new Pedido("Chocolate", 1, p);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(p);        
        em.persist(pedido);
        tx.commit();

        Pedido a = em.createQuery("from Pedido", Pedido.class)
                .getSingleResult();
        System.out.println(a);
        
        em.close();
    }
}
