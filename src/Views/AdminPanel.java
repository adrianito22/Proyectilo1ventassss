package Views;

import utils.Variables;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class AdminPanel implements MouseListener {


    public JPanel adminPanel;
    private JPanel panelheader;
    private JPanel jPnelMenuInicio;
    private JPanel jPnelMenuContenedores;
    private JPanel jPnelMenuContenedoresAcopio;
    private JPanel jPnelMenuCamionesyCarretas;
    private JPanel jPnelMenuPackingList;
    private JPanel jPnelMenuMuestreoRechazados;
    private JPanel jPnelMenuControlCalidad;
    private JPanel panelMenu;
    private JPanel jpanelContent;
    private JLabel cerrarSesion;
    private JPanel panelToShowData;

    private JPanel copiaPanel;


    private void addImageAndName(){



    }



    public  AdminPanel(){

        adminPanel.setSize(1000,1200);

        jPnelMenuInicio.addMouseListener(this);
        jPnelMenuContenedores.addMouseListener(this);
        jPnelMenuContenedoresAcopio.addMouseListener(this);
        jPnelMenuCamionesyCarretas.addMouseListener(this);
        jPnelMenuPackingList.addMouseListener(this);
        jPnelMenuMuestreoRechazados.addMouseListener(this);
        jPnelMenuControlCalidad.addMouseListener(this);


        createPanelHere();



        cerrarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Yay you clicked me");

                //vamos a loging...



            }

        });

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == jPnelMenuInicio) {

            System.out.println("SE PRESIONO INICIO");

            //  jPnelMenuInicio.setBackground(Color.decode("#554176"));


            updateBackground(Variables.INICIO);

        }


        if (e.getSource() == jPnelMenuInicio) {

            System.out.println("SE PRESIONO TODOS HERE");

          //  jPnelMenuInicio.setBackground(Color.decode("#554176"));


            updateBackground(Variables.TODOS);

        }

        else if (e.getSource() == jPnelMenuContenedores) {
                   System.out.println("SE PRESIONO CONTENEDORES");
            updateBackground(Variables.CONTENEDORES);

        }

        else if (e.getSource() == jPnelMenuContenedoresAcopio) {

            System.out.println("SE PRESIONO CONTENEDORES en acopio");
            updateBackground(Variables.CONTENEDORES_ACOPIO);

        }

        else if (e.getSource() == jPnelMenuCamionesyCarretas) {
            System.out.println("SE PRESIONO camiones y carretas");
            updateBackground(Variables.CAMIONESYCARRETAS);

        }

        else if (e.getSource() == jPnelMenuPackingList) {
            System.out.println("SE PRESIONO packing list");
            updateBackground(Variables.PACKINGLIST);

        }


        else if (e.getSource() == jPnelMenuMuestreoRechazados) {
            System.out.println("SE PRESIONO muestreo recahzados");
            updateBackground(Variables.MUESTREO_RECHZADOS);

        }

        else if (e.getSource() == jPnelMenuControlCalidad) {
            System.out.println("SE PRESIONO CONTrol de calidad");
            updateBackground(Variables.CONTROL_CALIDAD);

        }



    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


   private void updateBackground(int ItemSelecioando){
        switch(ItemSelecioando){


            case Variables.INICIO:  //240E41 //ESTE NORMAL

                jPnelMenuInicio.setBackground(Color.decode("#554176"));
                jPnelMenuContenedores.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#240E41"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#240E41"));
                jPnelMenuPackingList.setBackground(Color.decode("#240E41"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#240E41"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#240E41"));


                createPanelHere();



                //  JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);


                break;


            case Variables.CONTENEDORES : //240E41 //ESTE NORMAL

                jPnelMenuInicio.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedores.setBackground(Color.decode("#554176"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#240E41"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#240E41"));
                jPnelMenuPackingList.setBackground(Color.decode("#240E41"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#240E41"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#240E41"));



                createPanelHere();



              //  JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);


                break;


            case Variables.CAMIONESYCARRETAS:
                jPnelMenuInicio.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedores.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#240E41"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#554176"));
                jPnelMenuPackingList.setBackground(Color.decode("#240E41"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#240E41"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#240E41"));
                break;



            case Variables.CONTENEDORES_ACOPIO:
                jPnelMenuInicio.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedores.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#554176"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#240E41"));
                jPnelMenuPackingList.setBackground(Color.decode("#240E41"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#240E41"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#240E41"));

                break;

            case Variables.TODOS :
                jPnelMenuInicio.setBackground(Color.decode("#554176"));
                jPnelMenuContenedores.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#240E41"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#240E41"));
                jPnelMenuPackingList.setBackground(Color.decode("#240E41"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#240E41"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#240E41"));
                break;

            case Variables.PACKINGLIST :
                jPnelMenuInicio.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedores.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#240E41"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#240E41"));
                jPnelMenuPackingList.setBackground(Color.decode("#554176"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#240E41"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#240E41"));
                break;

            case Variables.MUESTREO_RECHZADOS :
                jPnelMenuInicio.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedores.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#240E41"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#240E41"));
                jPnelMenuPackingList.setBackground(Color.decode("#240E41"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#554176"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#240E41"));
                break;

            case Variables.CONTROL_CALIDAD :
                jPnelMenuInicio.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedores.setBackground(Color.decode("#240E41"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#240E41"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#240E41"));
                jPnelMenuPackingList.setBackground(Color.decode("#240E41"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#240E41"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#554176"));
                break;




        }


   }

   private void createPanelHere(){

      float sizePanelWidth= jpanelContent.getSize().width;
      double sizePanelHeigth= jpanelContent.getSize().getHeight();


       ScrollPane scrollPanel= new ScrollPane();
       scrollPanel.setSize((int)sizePanelWidth,(int)sizePanelHeigth);


       JPanel borderLayoutPanel=new JPanel(new BorderLayout());
       borderLayoutPanel.setBorder(new EmptyBorder(20, 10, 10, 10)); //le agregamos un border



       PanelAllUsers panel = new PanelAllUsers();
      // panel.setBackground(Color.BLUE);
      // borderLayoutPanel.setSize((int)sizePanelWidth/2,(int)sizePanelHeigth);

       borderLayoutPanel.add(panel, BorderLayout.NORTH);

       scrollPanel.add(borderLayoutPanel);

       scrollPanel.setBounds(10, 10, scrollPanel.getHeight(), scrollPanel.getHeight());

       jpanelContent.setLayout(null);
       jpanelContent.add(scrollPanel);
      // jpanelContent.add(panel); /asi estaba




/*

       JPanel previewJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
       previewJpanel.setBackground(Color.);

       previewJpanel.setSize((int)sizePanelWidth/2,(int)sizePanelHeigth);
       jpanelContent.setOpaque(true);
       jpanelContent.add(previewJpanel);
*/
       jpanelContent.updateUI();


       ///  validate();


   }


}
