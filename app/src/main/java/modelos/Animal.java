/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fl1pc17
 */
public abstract class Animal {
    protected String nombre, sexo, raza;
    protected LocalDate fechaVacuna, fechaProximaVacuna;
    protected double peso;
    protected int edad;

    public Animal(String nombre, String sexo, String raza, LocalDate fechaVacuna, LocalDate fechaProximaVacuna, double peso, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.raza = raza;
        this.fechaVacuna = fechaVacuna;
        this.fechaProximaVacuna = fechaProximaVacuna;
        this.peso = peso;
        this.edad = edad;
    }
  
    public abstract LocalDate getProximaFechaDeVacuna();
    public void mostrarInformacionVacuna(){
    DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println("nombre: "+nombre);
    System.out.println("sexo: "+sexo);
    System.out.println("raza: "+raza);
    System.out.println("primera vacuna: "+fechaVacuna.format (formato));
    System.out.println("Fecha proxima vacuna: "+fechaProximaVacuna.format (formato));
    System.out.println("peso: "+peso);
    System.out.println("edad: "+edad);
    

    }
}
