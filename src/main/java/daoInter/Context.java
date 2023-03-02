/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoInter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
public abstract class Context {
    EntityManagerFactory emf;
    public EntityManager em(){
        EntityManagerFactory emf=emf();
        EntityManager em=emf.createEntityManager();
        return em;
    }
    public EntityManagerFactory emf(){
        if (emf==null){
        emf=Persistence.createEntityManagerFactory("eHealthCareManagement");
        }
        return emf;
        
    }
    public void closeEmf(){
        emf.close();
    }
    
}
