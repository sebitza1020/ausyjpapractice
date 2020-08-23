package MAIN;

import Entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Product product1 = new Product();

        product1.setName("Chips");
        product1.setPrice(3.99);
        product1.setDate(LocalDateTime.now());

        entityTransaction.begin();
        entityManager.persist(product1);
        entityTransaction.commit();

        entityManager.close();

    }


}
