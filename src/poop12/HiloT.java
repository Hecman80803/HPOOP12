/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Esta clase representa un hilo que realiza un bucle de 10 iteraciones,
 * imprimiendo información sobre la iteración actual y el nombre del hilo.
 * Extiende la clase Thread para modelar la ejecución como un hilo.
 * 
 * @author hecman
 */
public class HiloT extends Thread{
    
     /**
     * Constructor que asigna un nombre al hilo.
     * 
     * @param name El nombre del hilo.
     */
    public HiloT(String name) {
        super(name);
    }
   @Override
   public void run(){
        for(int i=0;i<10;i++){
            System.out.println("iteracion "+i+ " de " +getName());
        }
        System.out.println("Termina el "+getName());
   }
            
 }
