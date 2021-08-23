/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJava;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author akshay
 */
@Entity
@Table(name = "FEEPAYMENT", catalog = "", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "Feepayment.findAll", query = "SELECT f FROM Feepayment f"),
    @NamedQuery(name = "Feepayment.findByStudentId", query = "SELECT f FROM Feepayment f WHERE f.studentId = :studentId"),
    @NamedQuery(name = "Feepayment.findByStudentName", query = "SELECT f FROM Feepayment f WHERE f.studentName = :studentName"),
    @NamedQuery(name = "Feepayment.findByBatch", query = "SELECT f FROM Feepayment f WHERE f.batch = :batch"),
    @NamedQuery(name = "Feepayment.findByFeeFromDate", query = "SELECT f FROM Feepayment f WHERE f.feeFromDate = :feeFromDate"),
    @NamedQuery(name = "Feepayment.findByFeeToDate", query = "SELECT f FROM Feepayment f WHERE f.feeToDate = :feeToDate"),
    @NamedQuery(name = "Feepayment.findByFeeAmt", query = "SELECT f FROM Feepayment f WHERE f.feeAmt = :feeAmt"),
    @NamedQuery(name = "Feepayment.findByGrade", query = "SELECT f FROM Feepayment f WHERE f.grade = :grade")})
public class Feepayment implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STUDENT_ID")
    private String studentId;
    @Column(name = "STUDENT_NAME")
    private String studentName;
    @Column(name = "BATCH")
    private String batch;
    @Column(name = "FEE_FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date feeFromDate;
    @Column(name = "FEE_TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date feeToDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FEE_AMT")
    private Double feeAmt;
    @Column(name = "GRADE")
    private String grade;

    public Feepayment() {
    }

    public Feepayment(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        String oldStudentId = this.studentId;
        this.studentId = studentId;
        changeSupport.firePropertyChange("studentId", oldStudentId, studentId);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        String oldStudentName = this.studentName;
        this.studentName = studentName;
        changeSupport.firePropertyChange("studentName", oldStudentName, studentName);
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        String oldBatch = this.batch;
        this.batch = batch;
        changeSupport.firePropertyChange("batch", oldBatch, batch);
    }

    public Date getFeeFromDate() {
        return feeFromDate;
    }

    public void setFeeFromDate(Date feeFromDate) {
        Date oldFeeFromDate = this.feeFromDate;
        this.feeFromDate = feeFromDate;
        changeSupport.firePropertyChange("feeFromDate", oldFeeFromDate, feeFromDate);
    }

    public Date getFeeToDate() {
        return feeToDate;
    }

    public void setFeeToDate(Date feeToDate) {
        Date oldFeeToDate = this.feeToDate;
        this.feeToDate = feeToDate;
        changeSupport.firePropertyChange("feeToDate", oldFeeToDate, feeToDate);
    }

    public Double getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Double feeAmt) {
        Double oldFeeAmt = this.feeAmt;
        this.feeAmt = feeAmt;
        changeSupport.firePropertyChange("feeAmt", oldFeeAmt, feeAmt);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        String oldGrade = this.grade;
        this.grade = grade;
        changeSupport.firePropertyChange("grade", oldGrade, grade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feepayment)) {
            return false;
        }
        Feepayment other = (Feepayment) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CoreJava.Feepayment[ studentId=" + studentId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
