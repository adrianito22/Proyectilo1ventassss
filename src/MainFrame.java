import Views.LoginPanel;
import Views.RegisterPanel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import utils.Common;

import javax.swing.*;

public class MainFrame{

    public static void main(String[] args) {
        System.out.println("Hello world!");

        FlatLightLaf.install();

        Common.initFirebase();


        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf()

            );
        }
        catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

     //   new LoginPanel().setVisible(true);


    //   RegisterPanel login= new RegisterPanel();
       // login.setSize(700,450);
      //  login.setVisible(true);

       //  setContentPane(login);



      //  LoginPanel login= new LoginPanel();
      // login.setSize(700,450);
        //login.setVisible(true);


        //RegisterPanel panel= new RegisterPanel();

       // add(panel);


     //   JFrame frame = new JFrame("CelsiusConverterGUI");
     //   frame.setSize(500,500);

      //  frame.setContentPane(panel);
     //   frame.add(panel);
      //   panel.setSize(500,500);

      //   frame.setVisible(true);

       // frame.setSize(500,500);
      //  panel.setSize(500,500);
        //panel.pack();
        //frame.pack(); //INVESTIGAR ESTEB METODO

     //   panel.setVisible(true);
       // frame.setVisible(true);

      //  frame.setContentPane(panel);


        /*
        Ventana vent ana= new Ventana();
        ventana.setSize(500,500);
        ventana.setVisible(true);
*/




      //  LoginPanel panel=new LoginPanel();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override

               public void run() {

                  LoginPanel panel=new LoginPanel();
                panel.setSize(700,450);

                panel.setVisible(true);

                //new LoginPanel().setVisible(true);

                 }
        });

      //  setContentPane(panel);


    }
}