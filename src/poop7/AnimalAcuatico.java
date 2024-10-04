/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Animal acuatico
 * @author estudiante
 */
public class AnimalAcuatico extends Animal{
    //Atributos
    private int numeroAletas;
    
    /**
     * Constructor vacio
     */
    public AnimalAcuatico() {
        numeroAletas = 0;
    }

    /**
     * Constructor lleno
     * @param numeroAletas 
     */
    public AnimalAcuatico(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    /**
     * Metodo que devuelve el numero de alas
     * @return numeroAletas
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }

    /**
     * Metodo que establece el numero de alas
     * @param numeroAletas 
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * Metodo que hace al animal nadar
     */
    public void nadar(){
        System.out.println("El animal nada");
    }
    
    /**
     * Metodo que hace al animal comer
     */
    @Override
    public void comer(){
        System.out.println("El animal acuatico come");
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}' + ", ";
    }
    
}
