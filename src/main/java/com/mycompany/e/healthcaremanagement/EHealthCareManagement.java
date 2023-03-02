/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.e.healthcaremanagement;

import daoImpl.DiagnoseImpl;
import entities.Diagnoses;

/**
 *
 * @author HP
 */
public class EHealthCareManagement {

    public static void main(String[] args) {
        DiagnoseImpl d=new DiagnoseImpl();
        System.out.println(d.findById(1));
        
    }
}
