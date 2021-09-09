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

    //Constructor

    public Costo() {
    }
    
        
    public Costo(double valorMedicamento, int cantidadMedicamento, double valorProcedimiento, int tiempoClinica) {
        this.valorMedicamento = valorMedicamento;
        this.cantidadMedicamento = cantidadMedicamento;
        this.valorProcedimiento = valorProcedimiento;
        this.tiempoClinica = tiempoClinica;
    }
    
    //Getters and Setters

    public double getValorMedicamento() {
        return valorMedicamento;
    }

    public void setValorMedicamento(double valorMedicamento) {
        this.valorMedicamento = valorMedicamento;
    }

    public int getCantidadMedicamento() {
        return cantidadMedicamento;
    }

    public void setCantidadMedicamento(int cantidadMedicamento) {
        this.cantidadMedicamento = cantidadMedicamento;
    }

    public double getValorProcedimiento() {
        return valorProcedimiento;
    }

    public void setValorProcedimiento(double valorProcedimiento) {
        this.valorProcedimiento = valorProcedimiento;
    }

    public int getTiempoClinica() {
        return tiempoClinica;
    }

    public void setTiempoClinica(int tiempoClinica) {
        this.tiempoClinica = tiempoClinica;
    }
    
    
    
}
