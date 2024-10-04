/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Ballena
 * @author estudiante
 */
public class Ballena extends AnimalAcuatico{
    //Atributos
    private int largo;
    
    /**
     * Constructor vacio
     */
    public Ballena() {
        largo = 0;
    }
    
    /**
     * Constructor lleno
     * @param largo 
     */
    public Ballena(int largo) {
        this.largo = largo;
    }

    /**
     * Metodo que devuelve el largo
     * @return largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Metodo que establece el largo
     * @param largo 
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Metodo que hace a la ballena pelear con pinocho
     */
    public void pelearConPinocho(){
        System.out.println("La ballena pelea contra pinocho");
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}' + ", ";
    }
    
}
