import java.awt.Color;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.*;


public class Kominy extends HraciaPlocha 
{
    JLabel kominDole;
    JLabel kominHore;
    public Kominy()
    {
        //this.davajKominy();
        vytvorKomin();
    }
    
    public void vytvorKomin(){
        int x = 700;
        int y = 275;
        kominDole = new JLabel();
        kominDole.setBounds(40,200,40,200);
        kominDole.setLocation(x,y);
        kominDole.setBackground(Color.GREEN);
        kominDole.setOpaque(true);
        this.add(kominDole);
        
        kominHore = new JLabel();
        kominHore.setBounds(40,200,40,200);
        kominHore.setLocation(x,0);
        kominHore.setBackground(Color.GREEN);
        kominHore.setOpaque(true);
        this.add(kominHore);
        
        for(;;){
            kominDole.setLocation(x--, y);
            kominHore.setLocation(x--, 0);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        } 
    }
    
    //public void davajKominy(){
    //    for(;;){
    //        this.vytvorKomin();
    //    } 
    //}
    
    
}
