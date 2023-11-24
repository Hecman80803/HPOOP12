/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Esta clase representa un hilo que imprime dos espacios en blanco ('  ') mil veces.
 * Implementa la interfaz Runnable para permitir la ejecución como un hilo.
 * 
 * @author hecman
 */
public class HilosSaltoDeLinea implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.print("  ");
        }
    }
    
}
