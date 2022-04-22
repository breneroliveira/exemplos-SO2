
package ExtendsThread;

/**
 *
 * @author 20201pf.cc0050
 */

public class Main {
    public static void main(String[] args) {
        ExtendsThread thread1 = new ExtendsThread("Primeiro Thread.");
        thread1.start();
        
        ExtendsThread thread2 = new ExtendsThread("Segundo Thread.");
        thread2.start();
    }
}