package MAIN;

import Entity.Department;
import Entity.Employee;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        /*Department department = new Department();
        department.setName("IT");

        Employee employee1 = new Employee();
        employee1.setName("Sebastian");
        employee1.setDepartment(department);

        Employee employee2 = new Employee();
        employee2.setName("Meleu");
        employee2.setDepartment(department);

        Employee employee3 = new Employee();
        employee3.setName("Tobias");
        employee3.setDepartment(department);*/

        /*List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);*/

        //department.setEmployees(employees);

        //Employee employee = entityManager.find(Employee.class, 1);

        entityTransaction.begin();

        /*entityManager.persist(department);
        entityManager.persist(employee1);
        entityManager.persist(employee2);
        entityManager.persist(employee3);*/

        //entityManager.remove(employee);

        List<Employee> result = entityManager.createQuery( "from Employee", Employee.class ).getResultList();
        for (Employee employee : result) {
            System.out.println(employee.toString());

        }

        entityTransaction.commit();
        entityManager.close();

        System.exit(0);

    }
}
