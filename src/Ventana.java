import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JPanel jpanel;
    private JButton button1;
public Ventana() {
     setContentPane(jpanel);
    jpanel.setSize(500,500);
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(button1, "Eggs are not supposed to be green.");

        }
    });
}
/*
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ventana ventana= new Ventana();
        ventana.setSize(500,500);
        ventana.setContentPane(ventana.jpanel);
        ventana.setVisible(true);


    }

    */

}
