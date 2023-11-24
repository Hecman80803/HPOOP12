/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

import poop12.Cuenta;

/**
 *
 * @author hecman
 */
public class POOP12 {

    /**
     * Método principal que inicia varios hilos y realiza operaciones.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
      // TODO code application logic here
     
        /*
        HiloT hilo1=new HiloT("Primer hilo");
        hilo1.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(),"Tercer Hilo").start();
        for(int i=0;i<10;i++){
            System.out.println("iteracion "+i+ " del Main ");
        }
         System.out.println("Temrina el Main");
        */
        //new Thread(new HiloCeros(),"Hilo Ceros").start();
        //new Thread(new HiloUnos(),"Hilo Unos").start();
        //new Thread(new HilosSaltoDeLinea(),"Hilo salto de llinea").start();
     new Cuenta ("Acceso 1").start ();
    new Cuenta ("Acceso 2").start ();
    new Cuenta ("Deposito 1").start ();
    new Cuenta ("Deposito 2").start ();
    System.out.println ("Termina el hilo principal");
            
            
    }
    
}
