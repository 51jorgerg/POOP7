/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Animal terrestre
 * @author estudiante
 */
public class AnimalTerrestre extends Animal{
    //Atributos
    private int numeroPatas;
    
    /**
     * Constructor vacio
     */
    public AnimalTerrestre() {
        numeroPatas = 0;
    }

    /**
     * Constructor lleno
     * @param numeroPatas 
     */
    public AnimalTerrestre(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    /**
     * Metodo que devuelve el numero de patas
     * @return numeroPatas 
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * Metodo que establece el numero de patas
     * @param numeroPatas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    /**
     * Metodo que hace al animal correr
     */
    public void correr(){
        System.out.println("El animal corre");
    }
    
    /**
     * Metodo que hace al animal comer
     */
    @Override
    public void comer(){
        System.out.println("El animal terrestre come");
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}' + ", ";
    }
    
}
