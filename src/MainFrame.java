import Views.LoginPanelWhitFrameMain;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import utils.Common;

import javax.swing.*;

public class MainFrame{

    public static void main(String[] args) {

        FlatLightLaf.install();

        Common.initFirebase();


        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf()

            );
        }
        catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override

               public void run() {

                  LoginPanelWhitFrameMain panel=new LoginPanelWhitFrameMain();
                panel.setSize(700,450);

                panel.setVisible(true);


                 }
        });

      //  setContentPane(panel);


    }
}