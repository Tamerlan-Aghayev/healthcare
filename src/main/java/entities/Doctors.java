/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "doctors")
@NamedQueries({
    @NamedQuery(name = "Doctors.findAll", query = "SELECT d FROM Doctors d"),
    @NamedQuery(name = "Doctors.findById", query = "SELECT d FROM Doctors d WHERE d.id = :id"),
    @NamedQuery(name = "Doctors.findByDoctorName", query = "SELECT d FROM Doctors d WHERE d.doctorName = :doctorName"),
    @NamedQuery(name = "Doctors.findByDoctorSurname", query = "SELECT d FROM Doctors d WHERE d.doctorSurname = :doctorSurname"),
    @NamedQuery(name = "Doctors.findByField", query = "SELECT d FROM Doctors d WHERE d.field = :field")})
public class Doctors implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctorId")
    private Collection<Patients> patientsCollection;

    @Column(name = "doctorscol")
    private String doctorscol;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "doctor_name")
    private String doctorName;
    @Basic(optional = false)
    @Column(name = "doctor_surname")
    private String doctorSurname;
    @Basic(optional = false)
    @Column(name = "field")
    private String field;

    public Doctors() {
    }

    public Doctors(Integer id) {
        this.id = id;
    }

    public Doctors(Integer id, String doctorName, String doctorSurname, String field) {
        this.id = id;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.field = field;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
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
        if (!(object instanceof Doctors)) {
            return false;
        }
        Doctors other = (Doctors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Doctors[ id=" + id + " ]";
    }

    public String getDoctorscol() {
        return doctorscol;
    }

    public void setDoctorscol(String doctorscol) {
        this.doctorscol = doctorscol;
    }

    public Collection<Patients> getPatientsCollection() {
        return patientsCollection;
    }

    public void setPatientsCollection(Collection<Patients> patientsCollection) {
        this.patientsCollection = patientsCollection;
    }
    
}
