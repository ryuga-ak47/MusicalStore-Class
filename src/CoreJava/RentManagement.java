/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJava;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author akshay
 */
@Entity
@Table(name = "RENT_MANAGEMENT", catalog = "", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "RentManagement.findAll", query = "SELECT r FROM RentManagement r"),
    @NamedQuery(name = "RentManagement.findById", query = "SELECT r FROM RentManagement r WHERE r.id = :id"),
    @NamedQuery(name = "RentManagement.findByType", query = "SELECT r FROM RentManagement r WHERE r.type = :type"),
    @NamedQuery(name = "RentManagement.findByRentText", query = "SELECT r FROM RentManagement r WHERE r.rentText = :rentText"),
    @NamedQuery(name = "RentManagement.findByRentTo", query = "SELECT r FROM RentManagement r WHERE r.rentTo = :rentTo"),
    @NamedQuery(name = "RentManagement.findByRentBy", query = "SELECT r FROM RentManagement r WHERE r.rentBy = :rentBy"),
    @NamedQuery(name = "RentManagement.findByRentByAddress", query = "SELECT r FROM RentManagement r WHERE r.rentByAddress = :rentByAddress"),
    @NamedQuery(name = "RentManagement.findByChargePerDay", query = "SELECT r FROM RentManagement r WHERE r.chargePerDay = :chargePerDay"),
    @NamedQuery(name = "RentManagement.findByTotalCharges", query = "SELECT r FROM RentManagement r WHERE r.totalCharges = :totalCharges"),
    @NamedQuery(name = "RentManagement.findByReturned", query = "SELECT r FROM RentManagement r WHERE r.returned = :returned"),
    @NamedQuery(name = "RentManagement.findByDamageCharges", query = "SELECT r FROM RentManagement r WHERE r.damageCharges = :damageCharges"),
    @NamedQuery(name = "RentManagement.findByLateFeeReturn", query = "SELECT r FROM RentManagement r WHERE r.lateFeeReturn = :lateFeeReturn"),
    @NamedQuery(name = "RentManagement.findByTax", query = "SELECT r FROM RentManagement r WHERE r.tax = :tax")})
public class RentManagement implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "RENT_TEXT")
    private String rentText;
    @Column(name = "RENT_TO")
    private String rentTo;
    @Column(name = "RENT_BY")
    private String rentBy;
    @Column(name = "RENT_BY_ADDRESS")
    private String rentByAddress;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CHARGE_PER_DAY")
    private Double chargePerDay;
    @Column(name = "TOTAL_CHARGES")
    private Double totalCharges;
    @Column(name = "RETURNED")
    private String returned;
    @Column(name = "DAMAGE_CHARGES")
    private Double damageCharges;
    @Column(name = "LATE_FEE_RETURN")
    private Double lateFeeReturn;
    @Column(name = "TAX")
    private Double tax;

    public RentManagement() {
    }

    public RentManagement(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public String getRentText() {
        return rentText;
    }

    public void setRentText(String rentText) {
        String oldRentText = this.rentText;
        this.rentText = rentText;
        changeSupport.firePropertyChange("rentText", oldRentText, rentText);
    }

    public String getRentTo() {
        return rentTo;
    }

    public void setRentTo(String rentTo) {
        String oldRentTo = this.rentTo;
        this.rentTo = rentTo;
        changeSupport.firePropertyChange("rentTo", oldRentTo, rentTo);
    }

    public String getRentBy() {
        return rentBy;
    }

    public void setRentBy(String rentBy) {
        String oldRentBy = this.rentBy;
        this.rentBy = rentBy;
        changeSupport.firePropertyChange("rentBy", oldRentBy, rentBy);
    }

    public String getRentByAddress() {
        return rentByAddress;
    }

    public void setRentByAddress(String rentByAddress) {
        String oldRentByAddress = this.rentByAddress;
        this.rentByAddress = rentByAddress;
        changeSupport.firePropertyChange("rentByAddress", oldRentByAddress, rentByAddress);
    }

    public Double getChargePerDay() {
        return chargePerDay;
    }

    public void setChargePerDay(Double chargePerDay) {
        Double oldChargePerDay = this.chargePerDay;
        this.chargePerDay = chargePerDay;
        changeSupport.firePropertyChange("chargePerDay", oldChargePerDay, chargePerDay);
    }

    public Double getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(Double totalCharges) {
        Double oldTotalCharges = this.totalCharges;
        this.totalCharges = totalCharges;
        changeSupport.firePropertyChange("totalCharges", oldTotalCharges, totalCharges);
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        String oldReturned = this.returned;
        this.returned = returned;
        changeSupport.firePropertyChange("returned", oldReturned, returned);
    }

    public Double getDamageCharges() {
        return damageCharges;
    }

    public void setDamageCharges(Double damageCharges) {
        Double oldDamageCharges = this.damageCharges;
        this.damageCharges = damageCharges;
        changeSupport.firePropertyChange("damageCharges", oldDamageCharges, damageCharges);
    }

    public Double getLateFeeReturn() {
        return lateFeeReturn;
    }

    public void setLateFeeReturn(Double lateFeeReturn) {
        Double oldLateFeeReturn = this.lateFeeReturn;
        this.lateFeeReturn = lateFeeReturn;
        changeSupport.firePropertyChange("lateFeeReturn", oldLateFeeReturn, lateFeeReturn);
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        Double oldTax = this.tax;
        this.tax = tax;
        changeSupport.firePropertyChange("tax", oldTax, tax);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RentManagement)) {
            return false;
        }
        RentManagement other = (RentManagement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CoreJava.RentManagement[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
