
package ImplementsRunnable;

/**
 *
 * @author 20201pf.cc0050
 */
public class ImplementsRunnable implements Runnable {
    private String text;
    
    public ImplementsRunnable(String text) {
        this.text = text;
    }
    
    // Cada thead criada, tudo que estiver dentro deste método, vai ser executado pela thread.
    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println(i + " - " + this.getText());
                Thread.sleep((long)(Math.random() * 1000));
            }
            System.out.println("Finalizando " + this.getText());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }   
}