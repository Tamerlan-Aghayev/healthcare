/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "patients")
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findById", query = "SELECT p FROM Patients p WHERE p.id = :id"),
    @NamedQuery(name = "Patients.findByPatientName", query = "SELECT p FROM Patients p WHERE p.patientName = :patientName"),
    @NamedQuery(name = "Patients.findByPatientSurname", query = "SELECT p FROM Patients p WHERE p.patientSurname = :patientSurname"),
    @NamedQuery(name = "Patients.findByPatientAge", query = "SELECT p FROM Patients p WHERE p.patientAge = :patientAge"),
    @NamedQuery(name = "Patients.findByPatientDiagnose", query = "SELECT p FROM Patients p WHERE p.patientDiagnose = :patientDiagnose"),
    @NamedQuery(name = "Patients.findByDoctorId", query = "SELECT p FROM Patients p WHERE p.doctorId = :doctorId")})
public class Patients implements Serializable {

   

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "patient_name")
    private String patientName;
    @Basic(optional = false)
    @Column(name = "patient_surname")
    private String patientSurname;
    @Basic(optional = false)
    @Column(name = "patient_age")
    private int patientAge;
     @JoinColumn(name = "patient_diagnose", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Diagnoses patientDiagnose;
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Doctors doctorId;
   

    public Patients() {
    }

    public Patients(Integer id) {
        this.id = id;
    }

    public Patients(Integer id, String patientName, String patientSurname, int patientAge, Diagnoses patientDiagnose, Doctors doctorId) {
        this.id = id;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientAge = patientAge;
        this.patientDiagnose = patientDiagnose;
        this.doctorId = doctorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public Diagnoses getPatientDiagnose() {
        return patientDiagnose;
    }

    public void setPatientDiagnose(Diagnoses patientDiagnose) {
        this.patientDiagnose = patientDiagnose;
    }

    public Doctors getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctors doctorId) {
        this.doctorId = doctorId;
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
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Patients[ id=" + id + " ]";
    }

    
    
}
