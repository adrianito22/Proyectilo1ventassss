package Views;

import com.google.firebase.database.*;
import com.google.firebase.internal.NonNull;
import models.SetInformEmbarque1;
import models.User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static utils.Common.generateUUID;
import static utils.Common.initFirebase;

public class Menu extends javax.swing.JFrame {

        private DatabaseReference mDatabase;
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField first_text_lbl;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JLabel status_request_lbl;
        // End of variables declaration//GEN-END:variables
        JTextField ediExportadoraProcesada ;
        JTextField ediExportadoraSolicitante;
        JTextField ediMarca ;

        JTextField ediCjasProcesDespacha;







        public Menu() {
            initComponents();

            status_request_lbl.setVisible(false);
            initFirebase();
            //more details: https://firebase.google.com/docs/admin/setup?hl=en-us
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            status_request_lbl = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            first_text_lbl = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jTextField1 = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jTextField2 = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            jButton4 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new java.awt.BorderLayout());

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            //  jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel1.setText("Firebase Integration - Demo");
            //  jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

            status_request_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            status_request_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            status_request_lbl.setText("Please, one moment...");
            // jPanel1.add(status_request_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 390, 20));

            jLabel3.setText("Email");
            //  jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
            //   jPanel1.add(first_text_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

            jButton1.setText("Set Value");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            //  jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

            jButton2.setText("Get Value");
            jButton2.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dowloadImagesDataReport("163349");

                    jButton2ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton2, new GridBagLayout());
            //  jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, -1));

            jLabel2.setText("New Username");
            //  jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
            //  jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, -1));

            jLabel4.setText("Username");
            //jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

            jButton4.setText("jButton4");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });
            //jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

            getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

            setSize(new java.awt.Dimension(426, 458));
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            status_request_lbl.setVisible(true);
            status_request_lbl.setText("Please, one moment...");
            registerNewUser(first_text_lbl.getText());
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            status_request_lbl.setVisible(true);
            status_request_lbl.setText("Please, one moment...");
            //  readData();

            dowloadImagesDataReport("163349");
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_jButton4ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //  dowloadImagesDataReport("163349");
            RegisterPanel panel= new RegisterPanel();
            panel.jPanelCenter.setSize(500,500);
            panel.jPanelCenter.setVisible(true);
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Menu().setVisible(true);
                }
            });
        }



        private void registerNewUser(String email) {
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Table...");
            String id = generateUUID();

            User user = new User();
            user.setId_user(id);
            user.setEmail(email);

//        mDatabase.setValue(user, new DatabaseReference.CompletionListener() {
//            @Override
//            public void onComplete(DatabaseError de, DatabaseReference dr) {
//                status_request_lbl.setText("Finish");
//            }
//        });
        }

        private void readData() {
            mDatabase = FirebaseDatabase.getInstance().getReference().child(
                    "Informes");
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        for (DataSnapshot data : ds.getChildren()) {
                            User user = data.getValue(User.class);
                            System.out.println(user.getEmail());
                        }
                    }
                }

                @Override
                public void onCancelled(DatabaseError de) {
                    System.out.println(de.getDetails());
                }
            });
        }




        void dowloadImagesDataReport(String reportUNIQUEidtoSEARCH){

            mDatabase = FirebaseDatabase.getInstance().getReference();
            Query query = mDatabase.child("Informes").child("listInformes").orderByChild("uniqueIDinforme").equalTo(reportUNIQUEidtoSEARCH);
            query.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    SetInformEmbarque1 informEmbarque1 = null;
                    for(DataSnapshot ds : dataSnapshot.getChildren()) {
                        informEmbarque1 =ds.getValue(SetInformEmbarque1.class);

                        System.out.println("el exportadora procesada es  "+informEmbarque1.getExportadoraProcesada());

                    }


                    if(informEmbarque1!=null){
                        // JOptionPane.showMessageDialog(new JFrame(), "no esnulo y es "+informEmbarque1.getExportadoraProcesada());
                        showAndSetDatosInformeContendores(informEmbarque1);
                    }





                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    System.out.println("el error es "+error.getMessage());

                    JOptionPane.showMessageDialog(new JFrame(), "es un error ");


                }
            });


        }







        private void removeValue(DatabaseReference mDatabase, String id) {
            //Remove Value
            mDatabase.child(id).removeValueAsync();
        }

        private void updateValue(DatabaseReference mDatabase, String id, String newUsername, String newEmail) {
            Map<String, Object> update = new HashMap<String, Object>();
            update.put("username", newUsername);
            update.put("email", newEmail);

            //Update Value
            mDatabase.child(id).updateChildren(update, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {
                    status_request_lbl.setText("Finish");
                }
            });
        }


        private void showAndSetDatosInformeContendores(SetInformEmbarque1 info1Object){
            // jFrameVentana = new JFrame("Java Swing Examples");
            // jFrameVentana.setSize(1000,500);
            // jFrameVentana.setLayout(new GridLayout(0, 1)); ///filas ,columnas
            // private FirebaseAuth mAuth;
            // GoogleSignInClient mGoogleSignInClient;
            //  FirebaseAuth mAuth;

            // Authentication.

            jPanel1 = new JPanel(new BorderLayout(4,4));
            jPanel1.setBorder(new EmptyBorder(4,4,4,4));

            JPanel jpanel2 = new JPanel(new GridBagLayout());
            jPanel1.add(new JScrollPane(jpanel2,
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));

            GridBagConstraints gbcConfig1 = new GridBagConstraints();
            gbcConfig1.insets = new Insets(4,4,4,10);


            GridBagConstraints gbcConfig2 = new GridBagConstraints();
            gbcConfig2.insets = new Insets(4,4,4,10);

            gbcConfig2.gridx = 3;  ///EL GRID X ES CLAVE PARA CREAR MAS COLUMNAS...TERCER COLUMNA

            gbcConfig1.gridx = 1;



            for (int iNDICE=0; iNDICE<50; iNDICE++) {

                ediMarca=new JTextField(info1Object.getMarrca());
                gbcConfig1.gridy = iNDICE;
                //  gbcConfig1.gridx = 0;
                jpanel2.add(new JLabel("MARCA"), 0);
                jpanel2.add(ediMarca, 1);

                jpanel2.add(new JLabel("Label " + (iNDICE+1)), gbcConfig1);




                jpanel2.add(new JTextField(info1Object.getMarrca(), 20), gbcConfig1);




                //  gbcConfig1.gridx = 2;  ///EL GRID X ES CLAVE PARA CREAR MAS COLUMNAS...ETA VA ELL;A SEGUNDA COLUMNA
                //p.add(new JTextField("Text Field " + (iNDICE+1), 20), gbc);
                //  jpanel2.add(new JLabel("Label " + (iNDICE+1)), gbcConfig1);



                // gbcConfig1.gridx = 3;  ///EL GRID X ES CLAVE PARA CREAR MAS COLUMNAS...TERCER COLUMNA
                jpanel2.add(new JTextField("Text Field " + (iNDICE+1), 20), gbcConfig2);


                getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);


            }



            /**ediExportadoraSolicitante= new Exportadora solictante()
             //jpanel = new JPanel();
             //  jpanel.setLayout(new GridLayout(0, 1 ));
             //  jpanel.setLayout(new FlowLayout());
             //  jpanel.setPreferredSize(new Dimension(400,400));
             //  jpanel.add(jlabel1);
             //for(int indice=0; indice<200; indice++) {
             //  jlabel1.setText("LA colum n es "+indice);
             //   jpanel.add(jlabel1);
             //  }
             //
             //  JScrollPane scrollPane = new JScrollPane(jpanel);
             jFrameVentana.add(jpanel);
             // jFrameVentana.add(statusLabel);
             jFrameVentana.setVisible(true);
             }
             private JTextArea outputTextArea;
             private void showScrollPaneDemo(){
             statusLabel.setText("Control in action: ScrollPane");
             /*
             // outputTextArea = new JTextArea("",5,20);
             // JScrollPane scrollPane = new JScrollPane(mainFrame);
             // JScrollPane scrollPane = new JScrollPane(jpanel);
             //   JScrollBar s=new JScrollBar();
             ///  s.setBounds(100,100, 50,100);
             //  jFrameVentana.add(s);
             //  scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
             //  jpanel.add(scrollPane);
             // jFrameVentana.setVisible(true);
             /*
             JPanel p = new JPanel(new GridBagLayout());
             ui.add(new JScrollPane(p,
             JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
             JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
             GridBagConstraints gbc = new GridBagConstraints();
             gbc.insets = new Insets(4,4,4,4);
             for (int ii=0; ii<50; ii++) {
             gbc.gridy = ii;
             gbc.gridx = 0;
             p.add(new JLabel("Label " + (ii+1)), gbc);
             gbc.gridx = 1;
             p.add(new JTextField("Text Field " + (ii+1), 20), gbc);
             }
             */




        }


    }
