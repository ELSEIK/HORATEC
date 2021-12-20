
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventana extends JFrame{
    public ventana(){
        setSize(500,500);  //establecemos tamaño de ventana
    
        setTitle("HORATEC");//se establece el titulo de la ventana
        
        setLocationRelativeTo(null);//Establecemos ventana en el centro
        
        setMinimumSize (new Dimension(200,200));//se establece el tamaño minimo de la ventana
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
        
        
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        
        JLabel etiqueta = new JLabel("HORATEC");
        panel.add(etiqueta);
        etiqueta.setBounds(85, 10, 300, 80);
        etiqueta.setForeground(Color.cyan);
        etiqueta.setFont (new Font("Arial",Font.PLAIN,20));
    
    ImageIcon logo = new ImageIcon("logo ht.JPEG");
    JLabel etiqueta2 = new JLabel ();
    panel.add(etiqueta2);
       //etiqueta2.setBounds(10,80, 300, 300);
        etiqueta2.setIcon(new ImageIcon(logo.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
    }
}
