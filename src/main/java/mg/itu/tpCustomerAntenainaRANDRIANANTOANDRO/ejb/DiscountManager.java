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
import mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.entities.Discount;

/**
 *
 * @author Antenaina
 */
@Stateless //EJB sans etat

public class DiscountManager {

//Injection de l'entity manager pour envoyer des requetes en utilisant l'instance Customer
    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    //    CREATE / post  
    public void persist(Discount discount) {
        em.persist(discount);
    }

    //    READ / SELECT * / get
    public List<Discount> getAllDiscounts() {
        Query query = em.createNamedQuery("Discount.findAll");
        return query.getResultList();
    }

    //    UPDATE / put  
    public Discount update(Discount discount) {
        return em.merge(discount);
    }

    //    FIND BY CODE / GET BY CODE
    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }

}
