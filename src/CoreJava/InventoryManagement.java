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
@Table(name = "INVENTORY_MANAGEMENT", catalog = "", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "InventoryManagement.findAll", query = "SELECT i FROM InventoryManagement i"),
    @NamedQuery(name = "InventoryManagement.findById", query = "SELECT i FROM InventoryManagement i WHERE i.id = :id"),
    @NamedQuery(name = "InventoryManagement.findByType", query = "SELECT i FROM InventoryManagement i WHERE i.type = :type"),
    @NamedQuery(name = "InventoryManagement.findBySerialnbr", query = "SELECT i FROM InventoryManagement i WHERE i.serialnbr = :serialnbr"),
    @NamedQuery(name = "InventoryManagement.findByPurchaseform", query = "SELECT i FROM InventoryManagement i WHERE i.purchaseform = :purchaseform"),
    @NamedQuery(name = "InventoryManagement.findByPurchasedate", query = "SELECT i FROM InventoryManagement i WHERE i.purchasedate = :purchasedate"),
    @NamedQuery(name = "InventoryManagement.findByPurchaseamt", query = "SELECT i FROM InventoryManagement i WHERE i.purchaseamt = :purchaseamt"),
    @NamedQuery(name = "InventoryManagement.findByServicefrm", query = "SELECT i FROM InventoryManagement i WHERE i.servicefrm = :servicefrm"),
    @NamedQuery(name = "InventoryManagement.findByServiceto", query = "SELECT i FROM InventoryManagement i WHERE i.serviceto = :serviceto"),
    @NamedQuery(name = "InventoryManagement.findByServiceby", query = "SELECT i FROM InventoryManagement i WHERE i.serviceby = :serviceby"),
    @NamedQuery(name = "InventoryManagement.findByServiceamt", query = "SELECT i FROM InventoryManagement i WHERE i.serviceamt = :serviceamt"),
    @NamedQuery(name = "InventoryManagement.findByAccessoriesamt", query = "SELECT i FROM InventoryManagement i WHERE i.accessoriesamt = :accessoriesamt"),
    @NamedQuery(name = "InventoryManagement.findByMake", query = "SELECT i FROM InventoryManagement i WHERE i.make = :make"),
    @NamedQuery(name = "InventoryManagement.findByModel", query = "SELECT i FROM InventoryManagement i WHERE i.model = :model"),
    @NamedQuery(name = "InventoryManagement.findByPurchasetax", query = "SELECT i FROM InventoryManagement i WHERE i.purchasetax = :purchasetax"),
    @NamedQuery(name = "InventoryManagement.findByServicetax", query = "SELECT i FROM InventoryManagement i WHERE i.servicetax = :servicetax")})
public class InventoryManagement implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "SERIALNBR")
    private String serialnbr;
    @Column(name = "PURCHASEFORM")
    private String purchaseform;
    @Column(name = "PURCHASEDATE")
    private String purchasedate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PURCHASEAMT")
    private Double purchaseamt;
    @Column(name = "SERVICEFRM")
    private String servicefrm;
    @Column(name = "SERVICETO")
    private String serviceto;
    @Column(name = "SERVICEBY")
    private String serviceby;
    @Column(name = "SERVICEAMT")
    private Double serviceamt;
    @Column(name = "ACCESSORIESAMT")
    private Double accessoriesamt;
    @Column(name = "MAKE")
    private String make;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "PURCHASETAX")
    private Double purchasetax;
    @Column(name = "SERVICETAX")
    private Double servicetax;

    public InventoryManagement() {
    }

    public InventoryManagement(String id) {
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

    public String getSerialnbr() {
        return serialnbr;
    }

    public void setSerialnbr(String serialnbr) {
        String oldSerialnbr = this.serialnbr;
        this.serialnbr = serialnbr;
        changeSupport.firePropertyChange("serialnbr", oldSerialnbr, serialnbr);
    }

    public String getPurchaseform() {
        return purchaseform;
    }

    public void setPurchaseform(String purchaseform) {
        String oldPurchaseform = this.purchaseform;
        this.purchaseform = purchaseform;
        changeSupport.firePropertyChange("purchaseform", oldPurchaseform, purchaseform);
    }

    public String getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(String purchasedate) {
        String oldPurchasedate = this.purchasedate;
        this.purchasedate = purchasedate;
        changeSupport.firePropertyChange("purchasedate", oldPurchasedate, purchasedate);
    }

    public Double getPurchaseamt() {
        return purchaseamt;
    }

    public void setPurchaseamt(Double purchaseamt) {
        Double oldPurchaseamt = this.purchaseamt;
        this.purchaseamt = purchaseamt;
        changeSupport.firePropertyChange("purchaseamt", oldPurchaseamt, purchaseamt);
    }

    public String getServicefrm() {
        return servicefrm;
    }

    public void setServicefrm(String servicefrm) {
        String oldServicefrm = this.servicefrm;
        this.servicefrm = servicefrm;
        changeSupport.firePropertyChange("servicefrm", oldServicefrm, servicefrm);
    }

    public String getServiceto() {
        return serviceto;
    }

    public void setServiceto(String serviceto) {
        String oldServiceto = this.serviceto;
        this.serviceto = serviceto;
        changeSupport.firePropertyChange("serviceto", oldServiceto, serviceto);
    }

    public String getServiceby() {
        return serviceby;
    }

    public void setServiceby(String serviceby) {
        String oldServiceby = this.serviceby;
        this.serviceby = serviceby;
        changeSupport.firePropertyChange("serviceby", oldServiceby, serviceby);
    }

    public Double getServiceamt() {
        return serviceamt;
    }

    public void setServiceamt(Double serviceamt) {
        Double oldServiceamt = this.serviceamt;
        this.serviceamt = serviceamt;
        changeSupport.firePropertyChange("serviceamt", oldServiceamt, serviceamt);
    }

    public Double getAccessoriesamt() {
        return accessoriesamt;
    }

    public void setAccessoriesamt(Double accessoriesamt) {
        Double oldAccessoriesamt = this.accessoriesamt;
        this.accessoriesamt = accessoriesamt;
        changeSupport.firePropertyChange("accessoriesamt", oldAccessoriesamt, accessoriesamt);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        String oldMake = this.make;
        this.make = make;
        changeSupport.firePropertyChange("make", oldMake, make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String oldModel = this.model;
        this.model = model;
        changeSupport.firePropertyChange("model", oldModel, model);
    }

    public Double getPurchasetax() {
        return purchasetax;
    }

    public void setPurchasetax(Double purchasetax) {
        Double oldPurchasetax = this.purchasetax;
        this.purchasetax = purchasetax;
        changeSupport.firePropertyChange("purchasetax", oldPurchasetax, purchasetax);
    }

    public Double getServicetax() {
        return servicetax;
    }

    public void setServicetax(Double servicetax) {
        Double oldServicetax = this.servicetax;
        this.servicetax = servicetax;
        changeSupport.firePropertyChange("servicetax", oldServicetax, servicetax);
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
        if (!(object instanceof InventoryManagement)) {
            return false;
        }
        InventoryManagement other = (InventoryManagement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CoreJava.InventoryManagement[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
