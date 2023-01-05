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

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.Border;

public class LoginPanel extends javax.swing.JFrame {

    Container contentPane;

    public LoginPanel() {


        super("Changing JPanel inside a JFrame");
        contentPane=getContentPane();
      //  createUIComponents();
        //estabkcemos el size de login panel
       //0 setSize(700,800);

        //pack(); //INVESTIGAR ESTEB METODO



      //  btnRegistrarse.setText("register");
      //  setBackground(new java.awt.Color(255, 255, 255));
       // setLayout(new java.awt.BorderLayout());
      //  jPanel1.setBackground(new java.awt.Color(255, 255, 255));
       // jPanel1.setLayout(null);


//       jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N

       // jLabel1.setForeground(new java.awt.Color(0, 0, 0));
       // jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       // jLabel1.setText("Loginzz");
      ///  jPanel1.add(jLabel1);
    //    jLabel1.setBounds(200, 30, 230, 60);

       // email_field.setBackground(new java.awt.Color(255, 255, 255));
       // email_field.setForeground(new java.awt.Color(0, 0, 0));
       // email_field.setText("Email");
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });
       // jPanel1.add(email_field);
       // email_field.setBounds(130, 160, 370, 40);

       // password_field.setBackground(new java.awt.Color(255, 255, 255));
      //  password_field.setForeground(new java.awt.Color(0, 0, 0));
      //  password_field.setText("jPasswordField1");
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
      //  jPanel1.add(password_field);
       // password_field.setBounds(130, 210, 370, 40);

       // jButton1.setBackground(new java.awt.Color(65, 80, 148));
       // jButton1.setForeground(new java.awt.Color(255, 255, 255));
       // jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton1ActionPerformed(evt);

            }
        });
       // jPanel1.add(jButton1);
       // jButton1.setBounds(220, 270, 180, 30);

        add(jPanel1);


//setVisible(true);


        jbtnRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  JOptionPane.showMessageDialog(password_field, "sepulso register");


             //   jPanel1.removeAll();
              //  getContentPane().removeAll(); //emovemos el panel que tiene esta frameactualemnte
               // setSize(500,500);
              //  getContentPane().invalidate();


             //   jPanel1.removeAll();
              //  jPanel1.setSize(500,500);

                createChangePanel();


               // RegisterPanel mipanel= new RegisterPanel();
                 //jPanel1.add(mipanel, BorderLayout.CENTER);



                 // setContentPane(mipanel);
              //  jPanel1.add(new RegisterPanel());
               // jPanel1.updateUI();
/*
                mipanel.setSize(500,500);
                mipanel.setVisible(true);
                getContentPane().remove(jPanel1);
                getContentPane().add(mipanel, BorderLayout.SOUTH);
                setContentPane(mipanel);

                getContentPane().revalidate();
                getContentPane().repaint();
*/
               //  jPanel1.updateUI();


              //  getContentPane().remove(jPanel1);
               // getContentPane().add(confidenceButtons,BorderLayout.SOUTH);
               // getContentPane().revalidate();
              //  getContentPane().repaint();



              //  RegisterPanel mipanel= new RegisterPanel();
               // getContentPane().add(mipanel);
               // getContentPane().revalidate();

               //mipanel.setSize(500,500);
              //  mipanel.setVisible(true);
              //  setContentPane(mipanel);
              //  revalidate(); // frame.pack() if you want to resize.
              // setVisible(true);

               // setContentPane().add(mipanel);

               // add(mipanel);
              //  getContentPane().add(new RegisterPanel()); //ler gramos otro panel la frame


            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void configureViews() {

    //    jPanel1 = new javax.swing.JPanel();
      //  jLabel1 = new javax.swing.JLabel();
      //  email_field = new javax.swing.JTextField();
       // password_field = new javax.swing.JPasswordField();
        //jButton1 = new javax.swing.JButton();

      //  setBackground(new java.awt.Color(255, 255, 255));
       // setLayout(new java.awt.BorderLayout());

      //  jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      //  jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
     //   jLabel1.setForeground(new java.awt.Color(0, 0, 0));
       // jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       // jLabel1.setText("Login");
     //   jPanel1.add(jLabel1);
       // jLabel1.setBounds(200, 30, 230, 60);

      //  email_field.setBackground(new java.awt.Color(255, 255, 255));
      //  email_field.setForeground(new java.awt.Color(0, 0, 0));
       // email_field.setText("Email");
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });
      //  jPanel1.add(email_field);
      //  email_field.setBounds(130, 160, 370, 40);

       // password_field.setBackground(new java.awt.Color(255, 255, 255));
     //   password_field.setForeground(new java.awt.Color(0, 0, 0));
     //   password_field.setText("jPasswordField1");
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
      //  jPanel1.add(password_field);
      //  password_field.setBounds(130, 210, 370, 40);

      //  jButton1.setBackground(new java.awt.Color(65, 80, 148));
      //  jButton1.setForeground(new java.awt.Color(255, 255, 255));
      //  jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
       // jPanel1.add(jButton1);
       // jButton1.setBounds(220, 270, 180, 30);

       // add(jPanel1, java.awt.BorderLayout.CENTER);


      //  setContentPane(jPanel1);

    }// </editor-fold>//GEN-END:initComponents

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

            //var password = "pas aqui; //STORE PASSWORD IN DATABSE

            /*
            System.out.println(email);
            System.out.println(phone);
            System.out.println(photoUrl);
            System.out.println(uid);
            */



            if(recoverUserData(uid)){


                System.out.println("se ejecuto este if ");

                /**chekeamos la contrasena y si es correcta vamos al panel de amdinistracion*/
                checkIfUserExistAndGoPanel(String.valueOf(password_field.getPassword()),email_field.getText());


            }else{


                System.out.println("se ejecuto este else ");

            }





        } catch (FirebaseAuthException ex) {
            JOptionPane.showMessageDialog(null, "Credenciales no validas");
        }




    }



    private void checkIfUserExistAndGoPanel(String passwordUser,String email) {


      //  Private lateinit var database:DatabaseReference
//??.
                DatabaseReference database  =FirebaseDatabase.getInstance().getReference().child("UsersAdmins");
       // myRef=database.getReference("message")


            //  Database midata=FirebaseDatabase.getInstance().getReference().child("")


     //   DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child("UsersAdmins");
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


                        System.out.println("es difrente de nulo user");

                        //chekeamos si el correo exuet

                     if(user.getPasswordUser().equals(passwordUser)){ //si la contrasena es correcta

                         System.out.println("bien vamos ");



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
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);

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



    public void createChangePanelAdminPanel() {
        AdminPanel newPanel=new AdminPanel();

        // jPanel1.add(newPanel.jPanelCenter, BorderLayout.SOUTH);


       // setSize(800,420);
        //   setBackground(new java.awt.Color(41, 7, 65));

        contentPane.removeAll();
        //   RegisterPanel newPanel=new RegisterPanel();
        // newPanel.jPanelCenter.setSize(100,100);

        contentPane.add(newPanel.adminPanel);
        System.out.println("new panel created");//for debugging purposes
        validate();
        setVisible(true);



    }



}