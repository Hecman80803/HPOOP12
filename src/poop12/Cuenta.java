/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author hecman
 */
public class Cuenta extends Thread
{
  // Variable estática compartida que representa el saldo de la cuenta
  private static long saldo = 0;
  
  /**
   * Constructor para inicializar un objeto Cuenta con un nombre dado.
   * 
   * @param nombre El nombre de la cuenta.
   */
  public Cuenta (String nombre)
  {
    super (nombre);
  }
  
   /**
   * El método run que se ejecuta cuando un hilo comienza.
   * Realiza un depósito o retiro según el nombre del hilo.
   */
  public void run ()
  {
    if (getName ().equals ("Deposito 1") || getName ().equals ("Deposito 2"))
      {
	this.depositarDinero (100);
      }
    else
      {
	this.extraerDinero (50);
      }
    System.out.println ("Termina el " + getName ());
  }
  
   /**
   * Método sincronizado para depositar dinero en la cuenta.
   * 
   * @param cantidad La cantidad de dinero a depositar.
   */
  public synchronized void depositarDinero (int cantidad)
  {
    saldo += cantidad;
    System.out.println ("Se depositaron " + cantidad + " pesos");
    notifyAll ();
  }
  
  /**
   * Método sincronizado para retirar dinero de la cuenta.
   * Si la cuenta tiene fondos insuficientes, el hilo espera un depósito.
   * 
   * @param cantidad La cantidad de dinero a retirar.
   */
  public synchronized void extraerDinero (int cantidad)
  {
    try
    {
      if (saldo <= 0)
	{
	  System.out.println (getName () + "espera Deposito" + "\nSaldo=" +
			      saldo);
	  sleep (5000);
	}
    }
    catch (InterruptedException e)
    {
      System.out.println (e);
    }
    saldo -= cantidad;
    System.out.println (getName () + " extrajo " + cantidad +
			"pesos. InSaldo restante=" + saldo);
    notifyAll ();
  }
 
}