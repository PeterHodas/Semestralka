import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class HraciaPlocha extends JFrame 
{
    Kominy kmn = new Kominy();
    FlappyBird bird = new FlappyBird();    
    
    public HraciaPlocha()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setBounds(800, 500, 800, 500);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        kmn.vytvorKomin();
        //bird = new FlappyBird();
    }
    
}
