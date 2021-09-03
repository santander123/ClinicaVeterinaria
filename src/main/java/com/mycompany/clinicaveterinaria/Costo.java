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
public class Costo {
    private double valorMedicamento;
    private int cantidadMedicamento;
    private double valorProcedimiento;
    private int tiempoClinica;

    public Costo(double valorMedicamento, int cantidadMedicamento, double valorProcedimiento, int tiempoClinica) {
        this.valorMedicamento = valorMedicamento;
        this.cantidadMedicamento = cantidadMedicamento;
        this.valorProcedimiento = valorProcedimiento;
        this.tiempoClinica = tiempoClinica;
    }
    
    //Getters
    public double getValorMedicamento() {
        return valorMedicamento;
    }

    public int getCantidadMedicamento() {
        return cantidadMedicamento;
    }

    public double getValorProcedimiento() {
        return valorProcedimiento;
    }

    public int getTiempoClinica() {
        return tiempoClinica;
    }
    
    
}
