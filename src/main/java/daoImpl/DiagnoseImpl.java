/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import daoInter.Context;
import entities.Diagnoses;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
public class DiagnoseImpl extends Context{
    public void addDiagnose(Diagnoses d){
        EntityManager em=em();
        em.getTransaction().begin();
        em.createNativeQuery("INSERT INTO diagnoses (id, diagnose_name) VALUES (?,?)")
      .setParameter(1, d.getId())
      .setParameter(2, d.getDiagnoseName())
      
      .executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    public void deleteById(int id){
        EntityManager em=em();
        em.createNativeQuery("delete from diagnoses where id=?").setParameter(1, id).executeUpdate();
        em.close();
    }
    public List<Diagnoses> findAll(){
        EntityManager em=em();
        Query q=em.createNamedQuery("Diagnoses.findAll");
        List<Diagnoses>diagnoses=q.getResultList();
        for(Diagnoses d: diagnoses){
            System.out.println(d);
        }
        em.close();
        return diagnoses;
        
    }
    public Diagnoses findById(int id){
        EntityManager em=em();
        Query q= em.createQuery("select d from diagnoses d where d.id=:id", Diagnoses.class).setParameter("id", id);
        Diagnoses d=(Diagnoses)q.getResultList().get(0);
        em.close();
        return d;
    }
}
