
package ExtendsThread;

/**
 *
 * @author 20201pf.cc0050
 */

public class ExtendsThread extends Thread {
    
    public ExtendsThread(String text) {
        super(text);
    }
    
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println(i + " - " + this.getName());
                Thread.sleep((long)(Math.random() * 1000));
            }
            System.out.println("Finalizando " + this.getName());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}