package Views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.database.*;
import com.google.firebase.internal.NonNull;
import models.User;
import utils.Variables;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class LoginPanelWhitFrameMain extends javax.swing.JFrame {
   ImageIcon imageIcon;
    Container contentPane;
    public JPanel jPanelCenter;

    public LoginPanelWhitFrameMain() {


        super("Changing JPanel inside a JFrame");
        contentPane=getContentPane();

       // imageIcon= new ImageIcon("src/images/logo_qserconxx.png");
         // setIconImage(imageIcon.getImage());
       //   setTitle("Qsercon Admin");

        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton1ActionPerformed(evt);

            }
        });

        add(jPanel1);


//setVisible(true);


        jbtnRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                createChangePanel();



            }
        });
    }




    @SuppressWarnings("unchecked")

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(email_field.getText().toString().trim().isEmpty()){
            JOptionPane.showMessageDialog(email_field, "Inserte un correo Electronico");

            return;
        }



        Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        Matcher matcher = pattern.matcher(email_field.getText().toString());

        if(!matcher.matches()){
            JOptionPane.showMessageDialog(password_field, "Inserte una correo valido");

            return;

        }

        if(password_field.getText().toString().trim().isEmpty()){
            JOptionPane.showMessageDialog(password_field, "Inserte una contrasena");

            return;
        }

        getDataByEmail();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void getDataByEmail() {
        try {
            UserRecord userRecord = FirebaseAuth.getInstance().getUserByEmail(email_field.getText());

            var email = userRecord.getEmail();
            var name = userRecord.getDisplayName();
            var phone = userRecord.getPhoneNumber();
            var photoUrl = userRecord.getPhotoUrl();
            var uid = userRecord.getUid();

            Variables.userRecordGlobal=userRecord;

            //var password = "pas aqui; //STORE PASSWORD IN DATABSE

            /*
            System.out.println(email);
            System.out.println(phone);
            System.out.println(photoUrl);
            System.out.println(uid);
            */



            if(recoverUserData(uid)){

                System.out.println("llamos aquidatass ");


                createChangePanelAdminPanel();

              //  System.out.println("se ejecuto este if ");

                /**chekeamos la contrasena y si es correcta vamos al panel de amdinistracion*/
               // checkIfUserExistAndGoPanel(String.valueOf(password_field.getPassword()),email_field.getText());


            }else{


                System.out.println("se ejecuto este else ");

            }





        } catch (FirebaseAuthException ex) {
            JOptionPane.showMessageDialog(null, "Credenciales no validas");
        }




    }



    private void checkIfUserExistAndGoPanel(String passwordUser,String email) {

                DatabaseReference database  =FirebaseDatabase.getInstance().getReference().child("UsersAdmins");

        Query query = database.orderByChild("email").equalTo(email);

        System.out.println("buscamos el mail "+email);


        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                System.out.println("se ejeuto on data change");

                for (DataSnapshot ds : snapshot.getChildren()) {

                    System.out.println("se llamo un for");


                    User user=ds.getValue(User.class);

                    if(user!=null){


                        System.out.println("es difrente de nulo user y pasword es "+user.getPasswordUser());

                        //chekeamos si el correo exuet

                     if(user.getPasswordUser().equals(passwordUser)){ //si la contrasena es correcta

                         System.out.println("bien vamos ");

                       //  JOptionPane.showMessageDialog(password_field, "Contrasena correcta");


                         ///vAMOS AL LOGIN PANEL...

                         createChangePanelAdminPanel();

                           //  JOptionPane.showMessageDialog(null, "Hello "+mail );


                     }else{
                         System.out.println("contrasena incorrecta");

                         JOptionPane.showMessageDialog(password_field, "Contrasena incorrecta");


                     }

                      //  break;




                    }else{

                        System.out.println("correo no registrado ");

                        JOptionPane.showMessageDialog(password_field, "Correo no REGISTRADO");

                    }


                }





            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                System.out.println("tenemos un error y es  "+error.getMessage());


            }
        } );






    }



    private boolean recoverUserData(String uid) {
        try {
            UserRecord userRecord = FirebaseAuth.getInstance().getUser(uid);
            System.out.println("Successfully fetched user data: " + userRecord.getUid());
            return true;

        } catch (FirebaseAuthException ex) {
            Logger.getLogger(LoginPanelWhitFrameMain.class.getName()).log(Level.SEVERE, null, ex);

            return false;

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password_field;
    private JButton jbtnRegistrarse;


    /*

    private void createUIComponents() {
        jlabelIcon=new JLabel(new ImageIcon((new ImageIcon(getClass().getClassLoader().getResource("images/hola.jpg")).getImage())));
        jlabelIcon.setBounds(280, 100, 50, 50);

      //  jlabelIcon.setSize(50,50);


        //  jlabelIcon.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/icon.png")).getImage());

        // TODO: place custom component creation code here
    }

    */

    // End of variables declaration//GEN-END:variables

    public void createChangePanel() {
        RegisterPanel newPanel=new RegisterPanel();

      // jPanel1.add(newPanel.jPanelCenter, BorderLayout.SOUTH);


        setSize(800,420);
      //   setBackground(new java.awt.Color(41, 7, 65));

        contentPane.removeAll();
     //   RegisterPanel newPanel=new RegisterPanel();
       // newPanel.jPanelCenter.setSize(100,100);

        contentPane.add(newPanel.jPanelCenter);
        System.out.println("new panel created");//for debugging purposes
        validate();
        setVisible(true);



    }


    public  void createPanelAndGoAdminPanel() {


        AdminPanel newPanel=new AdminPanel();

        //jPanel1.add(newPanel.jPanelCenter, BorderLayout.SOUTH);


        //newPanel
        //   setBackground(new java.awt.Color(41, 7, 65));

        contentPane.removeAll();
        //   RegisterPanel newPanel=new RegisterPanel();
        // newPanel.jPanelCenter.setSize(100,100);
        resizeFrame();


        contentPane.add(newPanel.adminPanel);
        System.out.println("new panel created");//for debugging purposes


        validate();

      //  setVisible(true);



    }



    public void createChangePanelAdminPanel() {

        AdminPanel newPanel=new AdminPanel();
        setBackground(new java.awt.Color(41, 7, 65));
        contentPane.removeAll();
        resizeFrame();
        //pack();
       // setLocationRelativeTo(null);
      //  setVisible(true);

        contentPane.add(newPanel.adminPanel);

        System.out.println("new panel created");//for debugging purposes

        validate();
        newPanel.generapanelHere();


    }



    public  void resizeFrame(){

     //   setExtendedState(JFrame.MAXIMIZED_BOTH);
       // setUndecorated(true);

       // contentPane.setSize(1200,1050);


        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();

        int screenWidth=0;
        int screenHeight=0;


        for (int i=0; i<gs.length; i++) {
            DisplayMode dm = gs[i].getDisplayMode();
             screenWidth = dm.getWidth();
             screenHeight = dm.getHeight();
        }


       setSize(screenWidth,screenHeight);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);




    }


}