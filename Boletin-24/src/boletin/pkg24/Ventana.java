
package boletin.pkg24;

import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
public class Ventana {
    //creamos los componentes
    JFrame marco;
    JPanel panel, panel2, panel3;
    JButton boton, boton2, boton3;
    JLabel etiqueta, etiqueta2;
    JTextField textoNome;
    JPasswordField contraseña;
    JTextArea areaTexto;
    JList lista;
    
    
    public void crearVentana(){
        //instancia de los objetos creados
        marco = new JFrame("Ventanuco");
        panel = new JPanel();
        panel2= new JPanel();
        panel3 = new JPanel();
        boton = new JButton("Premer");
        boton2 = new JButton("Limpar");
        boton3 = new JButton("boton");
        etiqueta = new JLabel("");
        etiqueta2 = new JLabel("");
        textoNome = new JTextField("");
        contraseña = new JPasswordField("contraseña");
        areaTexto = new JTextArea("");
        lista = new JList();
        
         marco.setSize(900, 600);
         marco.setVisible(true);
         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         panel.setLayout(null);
         panel.setSize(30, 20);
         
         panel2.setSize(30,200);
         
         panel3.setSize(400,200);
         
         
         textoNome.setBounds(120, 120, 300, 20);
         textoNome.setText("");
         contraseña.setBounds(120, 170, 300, 20);
         contraseña.setText("");
         
         etiqueta.setText("nome");
         etiqueta2.setText("password");
         etiqueta.setBounds(50, 100, 100, 50);
         etiqueta2.setBounds(50, 150, 100, 50);
        
        
         boton.setBounds(100, 200, 100, 50);
         boton2.setBounds(250, 200, 100,50);
         
        
         
         panel3.add(textoNome);
         panel3.add(contraseña);
         panel3.add(etiqueta);
         panel3.add(etiqueta2);
         panel3.add(boton);
         panel3.add(boton2);
         marco.add(panel);
         marco.add(panel2);
        
         
        
    }
    
    
}
