/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author estudiante
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instaurando ballena1
        Ballena ballena1 = new Ballena(1500);
        //Asignandole atributos a ballena1
        ballena1.setNombre("Monstruo");
        ballena1.setLugarOrigen("Italia");
        ballena1.setColor("Blanco");
        ballena1.setNumeroAletas(4);
        
        //Instaurando perro1
        Perro perro1 = new Perro("Rojo");
        //Asignandole atributos a perro1
        perro1.setNombre("Rufus");
        perro1.setLugarOrigen("Canada");
        perro1.setColor("Cafe");
        perro1.setNumeroPatas(4);
        
        //Instaurando pajaro1
        Pajaro pajaro1 = new Pajaro("Ancho");
        //Asignandole atributos a pajaro1
        pajaro1.setNombre("Pichi");
        pajaro1.setLugarOrigen("Sudamerica");
        pajaro1.setColor("Amarillo");
        pajaro1.setNumeroAlas(2);
        
        System.out.println("###Ballena###");
        //Imprimir ballena1
        System.out.println(ballena1);
        //metodos de animal
        ballena1.sonido("Wrar");
        //metodos de Animal acuatico
        ballena1.comer();
        ballena1.nadar();
        //metodos de Ballena
        ballena1.pelearConPinocho();
        
        
        System.out.println("###Perro###");
        //Imprimir perro1
        System.out.println(perro1);
        //metodos de animal
        perro1.sonido("Guau");
        //metodos de Animal Terrestre
        perro1.comer();
        perro1.correr();
        //metodos de Perro
        perro1.hacerTrucos();
        
        System.out.println("###Pajaro###");
        //Imprimir pajaro1
        System.out.println(pajaro1);
        //metodos de animal
        pajaro1.sonido("Fiup");
        //metodos de Animal Aereo
        pajaro1.comer();
        pajaro1.volar();
        //metodos de Pajaro
        pajaro1.recolectarRamas();
        
    }
    
}
