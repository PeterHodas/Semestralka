import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.*;

public class FlappyBird extends HraciaPlocha implements KeyListener
{
    int x = 1;
    int y = 1; 
    JLabel label;
    
    public FlappyBird()
    {
        this.addKeyListener(this);
        
        label = new JLabel();
        label.setBounds(5,5,20,20);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        this.add(label);
        this.pad();
        
    }
    
    public void pad(){
        for(;;){
            label.setLocation(x, y++);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public void skok(){
        for(int i = 0; i < 50; i++){
            label.setLocation(x, y-=1);
        }
    }
    
    public void keyTyped(KeyEvent e){
        
    }
    
    public void keyPressed(KeyEvent e){
        this.skok();
    }
    
    public void keyReleased(KeyEvent e){
        
    }
}
