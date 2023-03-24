package Views;

import models.UsuarioQsercon;
import utils.ToggleSwitch;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelAllUsers extends JPanel {
GridBagConstraints gridBagC =  new GridBagConstraints();


PanelAllUsers(){

 //   this.setBackground(Color.CYAN);
    this.setLayout(new GridBagLayout());

    this.setAutoscrolls(true);


    //agregamos marhge o padding
    gridBagC.insets = new Insets(8,15,8,15);

   // gridBagC.anchor = GridBagConstraints.NORTHWEST;
    // this.add(gridBagC)



    /**creamos data example*/
    ArrayList<UsuarioQsercon>list= new ArrayList<>();


    for(int indice=0; indice<20; indice++){

        list.add(new UsuarioQsercon("OFICINA CALIFICADOR","544356656","adria@gmail.com","Adrincito Vicente"));


    }


    showAllUsersAndSetUOP(list);
}





    private void showAllUsersAndSetUOP(ArrayList<UsuarioQsercon>arrayList){
    Font font=new Font("Verdana", Font.BOLD, 14);

        Font font2=new Font("Verdana", Font.PLAIN, 13);

        ToggleSwitch ts = new ToggleSwitch();
       // ts.setLocation(5, 135);
       // frame.add(ts);

        JLabel jLtextName= new JLabel("Nombre",SwingConstants.CENTER);
        JLabel jLcorreo= new JLabel("Correo",SwingConstants.CENTER);
        JLabel jLuserTypetextName= new JLabel("Tipo de usuario",SwingConstants.CENTER);
        JLabel jlState= new JLabel("Estado ",SwingConstants.CENTER);


        /**add font to label*/
        jLtextName.setFont(font);
        jLcorreo.setFont(font);
        jLuserTypetextName.setFont(font);
        jlState.setFont(font);





        gridBagC.fill = GridBagConstraints.HORIZONTAL;

        gridBagC.gridx=0;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jLtextName,gridBagC);


        gridBagC.fill = GridBagConstraints.HORIZONTAL;
        gridBagC.gridx=1;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jLcorreo,gridBagC);

        gridBagC.fill = GridBagConstraints.HORIZONTAL;
        gridBagC.gridx=2;
        gridBagC.gridy=0;
        gridBagC.gridwidth = 1;
        add(jLuserTypetextName,gridBagC);


        gridBagC.gridx=3;
        gridBagC.gridy=0;
        gridBagC.fill = GridBagConstraints.HORIZONTAL;

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
            label=new JLabel(user.getNombreUsuario());

            add(label,gridBagC);
            label.setFont(font2);


            gridBagC.gridx=1;
            label=new JLabel(user.getMailGooglaUser());
            label.setFont(font2);
            add(label,gridBagC);

            gridBagC.gridx=2;
            label=new JLabel(user.getTiposUSUARI());
            label.setFont(font2);
            add(label,gridBagC);


            gridBagC.gridx=3;
            ts=new ToggleSwitch();
            ts.setActivated(true);
           // label.setFont(font2);
            add(ts,gridBagC);


            positionYGrid++;


        }


    }


}
