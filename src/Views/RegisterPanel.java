package Views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.auth.UserRecord.CreateRequest;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import models.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import static utils.Common.generateUUID;

/**
 *
 * @author kingaspx
 */
public class RegisterPanel  {
JPanel panel;
    /**
     * Creates new form LoginPanel
     */
    public RegisterPanel() {

     // this panel=RegisterPanel.this;
      //  setLayout(new GridLayout());

       // jPanelCenter. setBackground(new java.awt.Color(229, 10, 10));

           System.out.println("hey se llamo metodo");
        //jPanelCenter.setBackground();

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

        //  phone_field.setText("Phone");
        phone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_fieldActionPerformed(evt);
            }
        });

        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });

        //  image_field.setText("Image URL");
        image_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image_fieldActionPerformed(evt);
            }
        });


        //setContentPane(jPanelCenter);

       // jPanelCenter.add()
             // getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        //setContentPane(jPanelCenter);

        // initComponents();
      //  createUIComponents();




    }

     JPanel devulvePanel(JPanel MIpanel){
return  MIpanel;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents





    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.out.println("SE PULSO REGISTRARSE ");


        if(!checkIfEspaciosIsLLenos()){
            System.out.println("es return  ");

            return;
        }



        try {
            CreateRequest request = new CreateRequest()
                    .setEmail(email_field.getText())
                    .setEmailVerified(false)
                    .setPassword(password_field.getText())
                    .setPhoneNumber("+593"+phone_field.getText())
                    .setDisplayName(name_field.getText())
                    .setPhotoUrl("https://www.adslzone.net/app/uploads-adslzone.net/2019/04/borrar-fondo-imagen.jpg")
                    .setDisabled(false);

            UserRecord userRecord = FirebaseAuth.getInstance().createUser(request);
            System.out.println("Successfully created new user: " + userRecord.getUid());


             /**agregamos este user a la base de datos...*/
            addNewUserFirebaseAdmin(email_field.getText(),String.valueOf(password_field.getPassword()));


            ///mostramos venta registrado correctamente y vamos al panel de administracion...




        } catch (FirebaseAuthException ex) {

            JOptionPane.showMessageDialog(null, "Error "+ex.getMessage() );



            Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);




        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_fieldActionPerformed





    private boolean checkIfEspaciosIsLLenos(){
        if(name_field.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(name_field, "Nombre es requerido" );

            return false;
        }

        if(email_field.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(email_field, "Correo es requerido" );

            return false;
        }
        if(password_field.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(password_field, "Contrasena  es requerida" );

            return false;
        }
        if(phone_field.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(phone_field, "Telefono es requerido" );

            return false;
        }


        //checkeamos que numero telefonico este correcto
        if(phone_field.getText().trim().contains("+593")  ||  phone_field.getText().trim().contains("+")){
            JOptionPane.showMessageDialog(phone_field, "No es necesario codigo de pais" );

            return false;
        }



        if(image_field.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(image_field, "Url es requerida" );

            return false;
        }



        return true;
    }



    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void image_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_image_fieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField image_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name_field;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JTextField phone_field;
    public JPanel jPanelCenter;
    public JLabel namex;
    private JLabel xorreox;
    private JLabel contrasenax;
    private JLabel telefonox;
    private JLabel urlimagex;




    private void addNewUserFirebaseAdmin(String mail,String passWord){


       DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child("UsersAdmins");
        String id = generateUUID();

        User user = new User();
        user.setId_user(id);
        user.setEmail(mail);
        user.setPasswordUser(passWord);


        mDatabase.push().setValue(user, new DatabaseReference.CompletionListener() {
           @Override
           public void onComplete(DatabaseError de, DatabaseReference dr) {

               JOptionPane.showMessageDialog(email_field, "Se registro exitosamente");

               //vamos al panel
               LoginPanelWhitFrameMain login= new LoginPanelWhitFrameMain();
               login.createChangePanelAdminPanel();

                System.out.println("holquehay");


            //   JOptionPane.showMessageDialog(frame, "Welcome to Swing!");


               // status_request_lbl.setText("Finish");
           }
        });

    }


    private static void createUI(final JFrame frame){
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        JButton button = new JButton("Click Me!");
        final JLabel label = new JLabel();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] options = {"Yes! Please."};
                int result = JOptionPane.showOptionDialog(
                        frame,
                        "Sure? You want to exit?",
                        "Swing Tester",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,     //no custom icon
                        options,  //button titles
                        options[0] //default button
                );
                if(result == JOptionPane.YES_OPTION){
                    label.setText("You selected: Yes! Please");
                }else if (result == JOptionPane.NO_OPTION){
                    label.setText("You selected: No! Not now.");
                }else {
                    label.setText("None selected");
                }
            }
        });

        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

}