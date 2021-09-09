/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clinicaveterinaria;

/**
 *
 * @author santa
 */
public class Procedimiento {
    private String procedimiento;
    
    //Constructores

    public Procedimiento() {
    }
    
    
    public Procedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    //Getter and Setters

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }
    
    
    
}
