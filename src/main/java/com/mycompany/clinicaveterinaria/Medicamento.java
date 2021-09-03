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

    public Medicamento(String medicamento, String propiedad, String viaDeAdministracion, String naturaleza) {
        this.medicamento = medicamento;
        this.propiedad = propiedad;
        this.viaDeAdministracion = viaDeAdministracion;
        this.naturaleza = naturaleza;
    }
    
    //Getters
    public String getMedicamento() {
        return medicamento;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public String getViaDeAdministracion() {
        return viaDeAdministracion;
    }

    public String getNaturaleza() {
        return naturaleza;
    }
    
    
}
