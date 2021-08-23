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
@Table(name = "STUDENT_MANAGEMENT", catalog = "", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "StudentManagement.findAll", query = "SELECT s FROM StudentManagement s"),
    @NamedQuery(name = "StudentManagement.findByStId", query = "SELECT s FROM StudentManagement s WHERE s.stId = :stId"),
    @NamedQuery(name = "StudentManagement.findByStName", query = "SELECT s FROM StudentManagement s WHERE s.stName = :stName"),
    @NamedQuery(name = "StudentManagement.findByGender", query = "SELECT s FROM StudentManagement s WHERE s.gender = :gender"),
    @NamedQuery(name = "StudentManagement.findByDob", query = "SELECT s FROM StudentManagement s WHERE s.dob = :dob"),
    @NamedQuery(name = "StudentManagement.findByStContact", query = "SELECT s FROM StudentManagement s WHERE s.stContact = :stContact"),
    @NamedQuery(name = "StudentManagement.findByParentName", query = "SELECT s FROM StudentManagement s WHERE s.parentName = :parentName"),
    @NamedQuery(name = "StudentManagement.findByParentContact", query = "SELECT s FROM StudentManagement s WHERE s.parentContact = :parentContact"),
    @NamedQuery(name = "StudentManagement.findByStartDate", query = "SELECT s FROM StudentManagement s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "StudentManagement.findByMotherTounge", query = "SELECT s FROM StudentManagement s WHERE s.motherTounge = :motherTounge"),
    @NamedQuery(name = "StudentManagement.findByGrade", query = "SELECT s FROM StudentManagement s WHERE s.grade = :grade"),
    @NamedQuery(name = "StudentManagement.findByBatch", query = "SELECT s FROM StudentManagement s WHERE s.batch = :batch"),
    @NamedQuery(name = "StudentManagement.findByOccupation", query = "SELECT s FROM StudentManagement s WHERE s.occupation = :occupation"),
    @NamedQuery(name = "StudentManagement.findByWorkPlace", query = "SELECT s FROM StudentManagement s WHERE s.workPlace = :workPlace"),
    @NamedQuery(name = "StudentManagement.findByResidenceAdd", query = "SELECT s FROM StudentManagement s WHERE s.residenceAdd = :residenceAdd"),
    @NamedQuery(name = "StudentManagement.findByExam", query = "SELECT s FROM StudentManagement s WHERE s.exam = :exam"),
    @NamedQuery(name = "StudentManagement.findByExamLevel", query = "SELECT s FROM StudentManagement s WHERE s.examLevel = :examLevel"),
    @NamedQuery(name = "StudentManagement.findByModuleDateFrom", query = "SELECT s FROM StudentManagement s WHERE s.moduleDateFrom = :moduleDateFrom"),
    @NamedQuery(name = "StudentManagement.findByModuleDateTo", query = "SELECT s FROM StudentManagement s WHERE s.moduleDateTo = :moduleDateTo"),
    @NamedQuery(name = "StudentManagement.findByModuleAssigned", query = "SELECT s FROM StudentManagement s WHERE s.moduleAssigned = :moduleAssigned"),
    @NamedQuery(name = "StudentManagement.findByStatus", query = "SELECT s FROM StudentManagement s WHERE s.status = :status"),
    @NamedQuery(name = "StudentManagement.findByComments", query = "SELECT s FROM StudentManagement s WHERE s.comments = :comments")})
public class StudentManagement implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ST_ID")
    private String stId;
    @Column(name = "ST_NAME")
    private String stName;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DOB")
    private String dob;
    @Column(name = "ST_CONTACT")
    private String stContact;
    @Column(name = "PARENT_NAME")
    private String parentName;
    @Column(name = "PARENT_CONTACT")
    private String parentContact;
    @Column(name = "START_DATE")
    private String startDate;
    @Column(name = "MOTHER_TOUNGE")
    private String motherTounge;
    @Column(name = "GRADE")
    private String grade;
    @Column(name = "BATCH")
    private String batch;
    @Column(name = "OCCUPATION")
    private String occupation;
    @Column(name = "WORK_PLACE")
    private String workPlace;
    @Column(name = "RESIDENCE_ADD")
    private String residenceAdd;
    @Column(name = "EXAM")
    private String exam;
    @Column(name = "EXAM_LEVEL")
    private String examLevel;
    @Column(name = "MODULE_DATE_FROM")
    private String moduleDateFrom;
    @Column(name = "MODULE_DATE_TO")
    private String moduleDateTo;
    @Column(name = "MODULE_ASSIGNED")
    private String moduleAssigned;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "COMMENTS")
    private String comments;

    public StudentManagement() {
    }

    public StudentManagement(String stId) {
        this.stId = stId;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        String oldStId = this.stId;
        this.stId = stId;
        changeSupport.firePropertyChange("stId", oldStId, stId);
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        String oldStName = this.stName;
        this.stName = stName;
        changeSupport.firePropertyChange("stName", oldStName, stName);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getStContact() {
        return stContact;
    }

    public void setStContact(String stContact) {
        String oldStContact = this.stContact;
        this.stContact = stContact;
        changeSupport.firePropertyChange("stContact", oldStContact, stContact);
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        String oldParentName = this.parentName;
        this.parentName = parentName;
        changeSupport.firePropertyChange("parentName", oldParentName, parentName);
    }

    public String getParentContact() {
        return parentContact;
    }

    public void setParentContact(String parentContact) {
        String oldParentContact = this.parentContact;
        this.parentContact = parentContact;
        changeSupport.firePropertyChange("parentContact", oldParentContact, parentContact);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        String oldStartDate = this.startDate;
        this.startDate = startDate;
        changeSupport.firePropertyChange("startDate", oldStartDate, startDate);
    }

    public String getMotherTounge() {
        return motherTounge;
    }

    public void setMotherTounge(String motherTounge) {
        String oldMotherTounge = this.motherTounge;
        this.motherTounge = motherTounge;
        changeSupport.firePropertyChange("motherTounge", oldMotherTounge, motherTounge);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        String oldGrade = this.grade;
        this.grade = grade;
        changeSupport.firePropertyChange("grade", oldGrade, grade);
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        String oldBatch = this.batch;
        this.batch = batch;
        changeSupport.firePropertyChange("batch", oldBatch, batch);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        String oldOccupation = this.occupation;
        this.occupation = occupation;
        changeSupport.firePropertyChange("occupation", oldOccupation, occupation);
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        String oldWorkPlace = this.workPlace;
        this.workPlace = workPlace;
        changeSupport.firePropertyChange("workPlace", oldWorkPlace, workPlace);
    }

    public String getResidenceAdd() {
        return residenceAdd;
    }

    public void setResidenceAdd(String residenceAdd) {
        String oldResidenceAdd = this.residenceAdd;
        this.residenceAdd = residenceAdd;
        changeSupport.firePropertyChange("residenceAdd", oldResidenceAdd, residenceAdd);
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        String oldExam = this.exam;
        this.exam = exam;
        changeSupport.firePropertyChange("exam", oldExam, exam);
    }

    public String getExamLevel() {
        return examLevel;
    }

    public void setExamLevel(String examLevel) {
        String oldExamLevel = this.examLevel;
        this.examLevel = examLevel;
        changeSupport.firePropertyChange("examLevel", oldExamLevel, examLevel);
    }

    public String getModuleDateFrom() {
        return moduleDateFrom;
    }

    public void setModuleDateFrom(String moduleDateFrom) {
        String oldModuleDateFrom = this.moduleDateFrom;
        this.moduleDateFrom = moduleDateFrom;
        changeSupport.firePropertyChange("moduleDateFrom", oldModuleDateFrom, moduleDateFrom);
    }

    public String getModuleDateTo() {
        return moduleDateTo;
    }

    public void setModuleDateTo(String moduleDateTo) {
        String oldModuleDateTo = this.moduleDateTo;
        this.moduleDateTo = moduleDateTo;
        changeSupport.firePropertyChange("moduleDateTo", oldModuleDateTo, moduleDateTo);
    }

    public String getModuleAssigned() {
        return moduleAssigned;
    }

    public void setModuleAssigned(String moduleAssigned) {
        String oldModuleAssigned = this.moduleAssigned;
        this.moduleAssigned = moduleAssigned;
        changeSupport.firePropertyChange("moduleAssigned", oldModuleAssigned, moduleAssigned);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        String oldComments = this.comments;
        this.comments = comments;
        changeSupport.firePropertyChange("comments", oldComments, comments);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stId != null ? stId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentManagement)) {
            return false;
        }
        StudentManagement other = (StudentManagement) object;
        if ((this.stId == null && other.stId != null) || (this.stId != null && !this.stId.equals(other.stId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CoreJava.StudentManagement[ stId=" + stId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
