
package boletin.pkg24;

import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
public class Ventana {
    //creamos los componentes
    JFrame marco;
    JPanel panel, panel2;
    JButton boton, boton2;
    JLabel etiqueta, etiqueta2;
    JTextArea liText, liText2;
    
    public void crearVentana(){
        //instancia de los objetos creados
        marco = new JFrame("Ventanuco");
        panel = new JPanel();
        boton = new JButton("Premer");
        boton2 = new JButton("Limpar");
        etiqueta = new JLabel("");
        etiqueta2 = new JLabel("");
        liText = new JTextArea("hello", 20, 15);
        liText2 = new JTextArea("hello", 20, 15);

        
        marco.setSize(900, 500);
         panel.setSize(800, 400);
         
         liText.setBounds(100, 100, 300, 20);
         liText.setText("nombre");
         liText2.setBounds(100, 150, 300, 20);
         liText2.setText("password");
         
         etiqueta.setText("nome");
         etiqueta2.setText("password");
         etiqueta.setBounds(50, 100, 100, 50);
        etiqueta2.setBounds(50, 150, 100, 50);
        
        
         boton.setBounds(200, 300, 100, 50);
         boton2.setBounds(400, 300, 100,50);
         
         panel.setLayout(null);
         
          panel.add(etiqueta);
         panel.add(etiqueta2);
         panel.add(boton);
         panel.add(boton2);
         marco.add(panel);
        
         
         marco.setVisible(true);
         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
