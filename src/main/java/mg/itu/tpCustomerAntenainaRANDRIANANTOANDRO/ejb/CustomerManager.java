/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.entities.Customer;

/**
 *
 * @author Antenaina
 */
@Stateless
public class CustomerManager {
//Injection de l'entity manager pour envoyer des requetes en utilisant l'instance Customer

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    //    CREATE / post  
    public void persist(Customer customer) {
        em.persist(customer);
    }

    //    READ / SELECT * / get
    public List<Customer> getAllCustomers() {
        System.out.println("test-2");
        Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }

    //    UPDATE / put  
    public Customer update(Customer customer) {
        return em.merge(customer);
    }

    //    FIND BY ID / GET BY ID
    public Customer findById(int idCustomer) {
        return em.find(Customer.class, idCustomer);
    }

}
