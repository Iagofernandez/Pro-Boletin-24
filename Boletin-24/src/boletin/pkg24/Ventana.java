
package boletin.pkg24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
public class Ventana implements ActionListener {
    //creamos los componentes
       JFrame marco;
    JPanel panel, panel1, panel2;
    JLabel Nome, Password;
    JTextField NomeText;
    JPasswordField Passwordtext;
    JButton bPremer, bLimpar, boton;
    JTextArea atComentarios;
    JList Items;
    String[] items = {"DAM1", "DAM2", "ASIR1", "ASIR2"};

   
    public void instanciarComponentesVentana() {

        //inicializar
        marco = new JFrame("Ventana");
        panel = new JPanel();

        //caracteristicas
        marco.setSize(600, 800);
        panel.setSize(600, 800);
       
    }

    public void instanciarPanel1() {
        panel1 = new JPanel();
        bPremer = new JButton("PREMER");
        bLimpar = new JButton("LIMPAR");
        Nome = new JLabel("NOME ");
        NomeText = new JTextField();
        Password = new JLabel("PASSWORD ");
        Passwordtext = new JPasswordField(6);

        panel1.setSize(250, 300);
        panel1.setBackground(Color.red);

    }

    public void instanciarPanel2() {
        panel2 = new JPanel();
        boton = new JButton("boton");
        atComentarios = new JTextArea("", 20, 10);
        Items = new JList(items);

        panel2.setSize(250, 300);
        panel2.setBackground(Color.BLUE);
    }

    public void crearVentana() {
        instanciarComponentesVentana();
        ordenarPanel1();
        ordenarPanel2();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(panel1);
        panel.add(panel2);
        bLimpar.addActionListener(this);
        boton.addActionListener(this);
        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);

    }

    public void ordenarPanel1() {
        instanciarPanel1();
        panel1.add(Nome);
        panel1.add(NomeText);

        panel1.add(Password);
        panel1.add(Passwordtext);

        panel1.add(bPremer);
        panel1.add(bLimpar);

    }

    public void ordenarPanel2() {
        instanciarPanel2();
        panel2.add(Items);
        panel2.add(atComentarios);
        panel2.add(boton);

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bLimpar) {
            //poner en blanco todos los campos
            NomeText.setText("");
            Passwordtext.setText("");
            atComentarios.setText("");
            Items.clearSelection();
        } else if (e.getSource() == bPremer) {

        } else if (e.getSource() == boton) {
            if (Items.isSelectionEmpty() == true) {
                atComentarios.setText(NomeText.getText()
                        + "\nCurso sin seleccionar");
            } else {
                atComentarios.setText(NomeText.getText() + "\n"
                        + Items.getSelectedValue());

            }
        }
    }

    
       
    

}