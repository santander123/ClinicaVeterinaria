/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;

/**
 *
 * @author santa
 */
public class Animal {
    private String animal;
    private String nombre;
    private String peso;
    private String sexo;
    private String estadoDeSalud;
    private String sintomas;
    
    //Contructores
    public Animal() {
        
    }

    public Animal(String animal, String nombre, String peso, String sexo, String estadoDeSalud, String sintomas) {
        this.animal = animal;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.estadoDeSalud = estadoDeSalud;
        this.sintomas = sintomas;
    }
    
    //Getters and Settes

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public void setEstadoDeSalud(String estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    
}
