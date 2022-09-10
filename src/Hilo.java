

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class Hilo extends Thread {
   


    private JProgressBar barra;
    private boolean si;
    private ArrayList<SerViv> ser = new ArrayList();
    private JDialog dialo;

    public Hilo() {
    }

    public Hilo(JProgressBar barra, boolean si, JDialog dialo) {
        this.barra = barra;
        this.si = si;
        this.dialo = dialo;
    }



    @Override
    public void run() {
        for (SerViv ser : ser) {
            try{
            barra.setValue(barra.getValue() + 1);
            
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
        dialo.setVisible(false);
    }

}
