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
public class Medicamento {
    private String medicamento;
    private String propiedad;
    private String viaDeAdministracion;
    private String naturaleza;

    //Constuctores
    public Medicamento() {
    }
    
    public Medicamento(String medicamento, String propiedad, String viaDeAdministracion, String naturaleza) {
        this.medicamento = medicamento;
        this.propiedad = propiedad;
        this.viaDeAdministracion = viaDeAdministracion;
        this.naturaleza = naturaleza;
    }
    
    //Getters and Setters

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getViaDeAdministracion() {
        return viaDeAdministracion;
    }

    public void setViaDeAdministracion(String viaDeAdministracion) {
        this.viaDeAdministracion = viaDeAdministracion;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }
    
    
    
}
