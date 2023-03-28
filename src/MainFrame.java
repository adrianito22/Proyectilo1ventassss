import Views.LoginPanelWhitFrameMain;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import utils.Common;

import javax.swing.*;
import java.net.URL;

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
                dhdh(panel);
                panel.setVisible(true);






                 }
        });

      //  setContentPane(panel);


    }



    private static void dhdh(JFrame f){
       // imageIcon= new ImageIcon("src/images/logo_qserconxx.png");
       // setIconImage(imageIcon.getImage());
       f. setTitle("Qsercon Admin");
       // Runnable r = new Runnable()

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String imageName = "images/logo_qserconxx.png";
        URL imageUrl = f.getClass().getResource(imageName);

        if (imageUrl == null)
        {
            System.out.println("imageUrl not found using default classloader!");
            imageUrl = Thread.currentThread().getContextClassLoader().getResource(imageName);
        }

        ImageIcon icon = new ImageIcon( imageUrl );
        f.setIconImage( icon.getImage() );
      //  f.setSize(400,300);
        f.setLocationRelativeTo( null );
        f.setVisible( true );
      //  SwingUtilities.invokeLater(r);

    }













}