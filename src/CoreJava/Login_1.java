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
@Table(name = "LOGIN", catalog = "", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "Login_1.findAll", query = "SELECT l FROM Login_1 l"),
    @NamedQuery(name = "Login_1.findByUsers", query = "SELECT l FROM Login_1 l WHERE l.users = :users"),
    @NamedQuery(name = "Login_1.findByPassword", query = "SELECT l FROM Login_1 l WHERE l.password = :password"),
    @NamedQuery(name = "Login_1.findByAdmin", query = "SELECT l FROM Login_1 l WHERE l.admin = :admin")})
public class Login_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERS")
    private String users;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ADMIN")
    private String admin;

    public Login_1() {
    }

    public Login_1(String users) {
        this.users = users;
    }

    public Login_1(String users, String password) {
        this.users = users;
        this.password = password;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        String oldUsers = this.users;
        this.users = users;
        changeSupport.firePropertyChange("users", oldUsers, users);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        String oldAdmin = this.admin;
        this.admin = admin;
        changeSupport.firePropertyChange("admin", oldAdmin, admin);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (users != null ? users.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login_1)) {
            return false;
        }
        Login_1 other = (Login_1) object;
        if ((this.users == null && other.users != null) || (this.users != null && !this.users.equals(other.users))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CoreJava.Login_1[ users=" + users + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
