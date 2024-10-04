/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Animal
 * @author estudiante
 */
public class Animal {
    //Atributos
    private String nombre;
    private String lugarOrigen;
    private String color;

    /**
     * Constructor vacio
     */
    public Animal() {
        nombre = null;
        lugarOrigen = null;
        color = null;
    }
    
    /**
     * Constructor lleno
     * @param nombre
     * @param lugarOrigen
     * @param color 
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * Metodo que devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el lugar de origen
     * @return lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Metodo que establece el lugar de origen
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Metodo que devuelve el color
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Metodo que establece el color
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }   
    
    /**
     * Metodo que imprime el sonido indicado
     * @param sonido 
     */
    public void sonido(String sonido){
        System.out.println("El animal hace: " + sonido);
    }
    
    /**
     * Metodo que hace al animal comer
     */
    public void comer(){
        System.out.println("El animal come");
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}' + ", ";
    }
    
}
