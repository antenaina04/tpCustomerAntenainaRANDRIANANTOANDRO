/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.ejb.CustomerManager;
import mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.ejb.DiscountManager;
import mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.entities.Customer;
import mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.entities.Discount;

/**
 *
 * @author Antenaina
 */
/**
 * Backing bean pour la page customerDetails.xhtml.
 */
@Named(value = "customerDetailsBean")
@ViewScoped
public class CustomerDetailsBean implements Serializable {

    private int idCustomer;
    private Customer customer;

    @EJB
    private CustomerManager customerManager;
    @EJB
    private DiscountManager discountManager;

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * Retourne les détails du client courant (dans l'attribut customer de cette
     * classe).
     *
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Action handler - met à jour dans la base de données les données du client
     *
     * @return Affichage de la liste des clients.
     */
    public String update() {
        // Mise a jour de la base de données.
        customer = customerManager.update(customer);
        return "customerList";
    }

    public void loadCustomer() {
        this.customer = customerManager.findById(idCustomer);
    }

    /**
     * Retourne la liste de tous les Discount.
     *
     * @return
     */
    public List<Discount> getDiscounts() {
        return discountManager.getAllDiscounts();
    }
}
