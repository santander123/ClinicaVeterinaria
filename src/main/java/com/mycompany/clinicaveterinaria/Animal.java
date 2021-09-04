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
    
    //Contructor
 
    public Animal(String animal, String nombre, String peso, String sexo, String estadoDeSalud, String sintomas) {
        this.animal = animal;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.estadoDeSalud = estadoDeSalud;
        this.sintomas = sintomas;
    }
    
    //Getters

    public String getAnimal() {
        return animal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public String getSintomas() {
        return sintomas;
    }
    
    
}
