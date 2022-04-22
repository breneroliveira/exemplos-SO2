
package ImplementsRunnable;

/**
 *
 * @author 20201pf.cc0050
 */
public class Main {
    public static void main(String[] args) {
        // PRIMEIRA THREAD.
        ImplementsRunnable thread1 = new ImplementsRunnable("Primeiro Thread."); // Instanciando o objeto.
        Thread i_thread1 = new Thread(thread1); // Instanciando uma thread.
        i_thread1.start(); // Iniciando a thread.
        
        // SEGUNDA THREAD.
        ImplementsRunnable thread2 = new ImplementsRunnable("Segundo Thread.");
        Thread i_thread2 = new Thread(thread2);
        i_thread2.start();
    }
}