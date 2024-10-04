/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Animal aereo
 * @author estudiante
 */
public class AnimalAereo extends Animal{
    //Atributos
    private int numeroAlas;
    
    /**
     * Constructor vacio
     */
    public AnimalAereo() {
        numeroAlas = 0;
    }

    /**
     * Constructor lleno
     * @param numeroAlas 
     */
    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    /**
     * Metodo que devuelve el numero de alas
     * @return numeroAlas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    /**
     * Metodo que establece el numero de alas
     * @param numeroAlas 
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Metodo que hace al animal volar
     */
    public void volar(){
        System.out.println("El animal vuela");
    }
    
    /**
     * metodo que hace al animal comer
     */
    @Override
    public void comer(){
        System.out.println("El animal aereo come");
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}' + ", ";
    }
    
}
