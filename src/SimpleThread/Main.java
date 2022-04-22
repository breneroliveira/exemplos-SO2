
package SimpleThread;

/**
 *
 * @author 20201pf.cc0050
 */

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Primero Thread.");
            Thread.sleep(5000);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}