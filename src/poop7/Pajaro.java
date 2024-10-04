/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Pajaro
 * @author estudiante
 */
public class Pajaro extends AnimalAereo{
    //Atributos
    private String tipoPico;
    
    /**
     * Constructor vacio
     */
    public Pajaro() {
        this.tipoPico = null;
    }
    
    /**
     * Constructor lleno
     * @param tipoPico 
     */
    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Metodo que devuelve el tipo de pico
     * @return tipoPico
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Metodo que establece el tipo de pico
     * @param tipoPico 
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Metodo que hace al pajaro recolectar ramas
     */
    public void recolectarRamas(){
        System.out.println("El pajaro recolecta ramas del piso");
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
}
