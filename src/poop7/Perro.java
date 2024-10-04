/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Perro
 * @author estudiante
 */
public class Perro extends AnimalTerrestre{
    //Atributos
    private String colorCollar;
    
    /**
     * Constructor vacio
     */
    public Perro() {
        this.colorCollar = null;
    }
    
    /**
     * Constructor lleno
     * @param colorCollar 
     */
    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Metodo que devuelve el color del collar
     * @return 
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * Metodo que establece el color del collar
     * @param colorCollar 
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Metodo que hace al perro hacer trucos
     */
    public void hacerTrucos(){
        System.out.println("El perro realiza varios trucos");
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
}
