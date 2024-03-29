package Views;

import com.google.firebase.database.*;
import models.UsuarioQsercon;
import utils.ToggleSwitch;
import utils.Utils;
import utils.Variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PanelAllUsers extends JPanel implements ActionListener, MouseListener {
GridBagConstraints gridBagC =  new GridBagConstraints();
boolean esPrimeraVezIngresa=true;
ArrayList<ToggleSwitch>lisAllTogles= new ArrayList<>();
ArrayList<JComboBox>lisAllComboBox= new ArrayList<>();

    JComboBox jComboBoxCurrentSelected;
    ToggleSwitch mySwutch;

    ArrayList<UsuarioQsercon>lisAllUsers= new ArrayList<>();

 Container contentPane;

PanelAllUsers(){


 //   this.setBackground(Color.CYAN);
    this.setLayout(new GridBagLayout());

    this.setAutoscrolls(true);


    //agregamos marhge o padding
    gridBagC.insets = new Insets(8,15,8,15);

   // gridBagC.anchor = GridBagConstraints.NORTHWEST;
    // this.add(gridBagC)


/*
    ArrayList<UsuarioQsercon>list= new ArrayList<>();

    ///dowload all users...

    for(int indice=0; indice<20; indice++){

        list.add(new UsuarioQsercon(100,"544356656","adria@gmail.com","Adrincito Vicente"));


    }
*/


    dowloadAllUsers();
}





    private void showAllUsersAndSetUOP(ArrayList<UsuarioQsercon>arrayList){
        Component[] components = getComponents();

        for (Component component : components) {
            remove(component);
        }

        revalidate();
        repaint();


     lisAllTogles= new ArrayList<>();
     lisAllComboBox= new ArrayList<>();



    Font font=new Font("Verdana", Font.BOLD, 14);

        Font font2=new Font("Verdana", Font.PLAIN, 13);

        ToggleSwitch toggleSwitch ;

       // ts.setLocation(5, 135);
       // frame.add(ts);
        JLabel jLtextNumUser= new JLabel("Num user",SwingConstants.CENTER);
        JLabel jLtextName= new JLabel("Nombre",SwingConstants.CENTER);
        JLabel jLcorreo= new JLabel("Correo",SwingConstants.CENTER);
        JLabel jLuserTypetextName= new JLabel("Tipo de usuario",SwingConstants.CENTER);
        JLabel jlState= new JLabel("Estado ",SwingConstants.CENTER);


        /**add font to label*/
        jLtextNumUser.setFont(font);
        jLtextName.setFont(font);
        jLcorreo.setFont(font);
        jLuserTypetextName.setFont(font);
        jlState.setFont(font);





        gridBagC.fill = GridBagConstraints.HORIZONTAL;

        gridBagC.gridx=0;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jLtextNumUser,gridBagC);


        gridBagC.gridx=1;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jLtextName,gridBagC);


        gridBagC.gridx=2;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jLcorreo,gridBagC);

        gridBagC.gridx=3;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jLuserTypetextName,gridBagC);


        gridBagC.gridx=4;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jlState,gridBagC);


          int positionYGrid=1;

          JLabel label;

        for(int indice=0; indice< arrayList.size();indice++){

            UsuarioQsercon user=arrayList.get(indice);

            gridBagC.fill = GridBagConstraints.HORIZONTAL;
            gridBagC.gridy=positionYGrid;
            gridBagC.gridx=0;
            gridBagC.gridwidth = 1;
            label=new JLabel(String.valueOf(indice+1),SwingConstants.CENTER);

            add(label,gridBagC);
            label.setFont(font2);

            gridBagC.fill = GridBagConstraints.HORIZONTAL;
            gridBagC.gridy=positionYGrid;
            gridBagC.gridx=1;
            gridBagC.gridwidth = 1;
            label=new JLabel(user.getNombreUsuario());

            add(label,gridBagC);
            label.setFont(font2);


            gridBagC.gridx=2;
            label=new JLabel(user.getMailGooglaUser());
            label.setFont(font2);
            add(label,gridBagC);


            JComboBox  combo1;
            combo1=new JComboBox<String>();
            combo1.setBounds(10,10,80,20);
            add(combo1);

            combo1.addItem("Evaluador de Campo");
            combo1.addItem("Evaluador de Oficina");

            if(user.getTiposUSUARI()== Variables.INSPECTOR_CAMPO){

              Utils.setSelectedValue(combo1,"Evaluador de Campo");

            }
            else if(user.getTiposUSUARI()== Variables.INSPECTOR_OFICINA){

                Utils.setSelectedValue(combo1,"Evaluador de Oficina");

            }


            else{
                combo1.addItem("No definido");

                Utils.setSelectedValue(combo1,"No definido");

            }


            combo1.addActionListener(this);
            combo1.setName(String.valueOf(indice));

            lisAllComboBox.add(combo1);

            gridBagC.gridx=3;
           // label=new JLabel(user.getTiposUSUARI());
           // label.setFont(font2);
            add(combo1,gridBagC);


            gridBagC.gridx=4;
            toggleSwitch=new ToggleSwitch();
            toggleSwitch.setName(String.valueOf(indice));

            if(user.isUserISaprobadp()){
                toggleSwitch.setActivated(true);


            }else{

                toggleSwitch.setActivated(false);

            }

           // label.setFont(font2);

            toggleSwitch.addMouseListener(this);
            lisAllTogles.add(toggleSwitch);

            add(toggleSwitch,gridBagC);


            positionYGrid++;


        }

        updateUI();
       validate();


    }




    private void dowloadAllUsers() {

        DatabaseReference database  = FirebaseDatabase.getInstance().getReference().child("Usuarios").child("Colaboradores");

        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI\\\

                lisAllUsers= new ArrayList<>();

                for (DataSnapshot ds : dataSnapshot.getChildren()) {


                    UsuarioQsercon currentObect= ds.getValue(UsuarioQsercon.class);

                    if(currentObect!=null){
                        lisAllUsers.add(currentObect);

                    }



                }


                if(esPrimeraVezIngresa){
                    esPrimeraVezIngresa=false;

                    showAllUsersAndSetUOP(lisAllUsers);

                }




                // ..
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                // Getting Post failed, log a message
            }
        };
        database.addValueEventListener(postListener);
        ///si el usuario esta navegando
        //si cambio el nodo actual.....verifica si esta baneado...

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

         mySwutch = (ToggleSwitch)e.getSource();


        try{
            if(lisAllUsers.size()>0){

                updateUser(lisAllUsers.get(Integer.parseInt(mySwutch.getName())));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }



        System.out.println("el id de combox name  ES "+mySwutch.getName());



    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

         jComboBoxCurrentSelected = (JComboBox)e.getSource();


         try{
             if(lisAllUsers.size()>0){

                 updateUser(lisAllUsers.get(Integer.parseInt(jComboBoxCurrentSelected.getName())));
             }
         } catch (Exception ex) {
             throw new RuntimeException(ex);
         }




        System.out.println("el id de combox name  ES "+ jComboBoxCurrentSelected.getName());



    }





    public  void updateUser( UsuarioQsercon user) {

      if(user!=null){

          if(mySwutch!=null){
              user.setUserISaprobadp(mySwutch.isActivated());

          }


          if(jComboBoxCurrentSelected!=null){
              int tipoUser=Variables.NO_DEFINIDO;

              System.out.println("el texto evluador tipo es "+jComboBoxCurrentSelected.getSelectedItem().toString());

              if(jComboBoxCurrentSelected.getSelectedItem().toString().equalsIgnoreCase("Evaluador de Campo")){

                  tipoUser=Variables.INSPECTOR_CAMPO;

              }



              else if(jComboBoxCurrentSelected.getSelectedItem().toString().equalsIgnoreCase("Evaluador de Oficina")){

                  tipoUser=Variables.INSPECTOR_OFICINA;

              }

              user.setTiposUSUARI(tipoUser);

          }




          DatabaseReference database  = FirebaseDatabase.getInstance().getReference().child("Usuarios").child("Colaboradores");

          database.child(user.getKeyLocaliceUser()).setValue(user, new DatabaseReference.CompletionListener() {
              @Override
              public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {

                  System.out.println("SE CAMBIO AQUI hurra");

              }
          });

      }



    }






}
