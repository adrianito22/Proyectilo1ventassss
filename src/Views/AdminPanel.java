package Views;

import utils.Variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AdminPanel implements MouseListener {


    public JPanel adminPanel;
    private JPanel panelheader;
    private JPanel jPnelMenuTodos;
    private JPanel jPnelMenuContenedores;
    private JPanel jPnelMenuContenedoresAcopio;
    private JPanel jPnelMenuCamionesyCarretas;
    private JPanel jPnelMenuPackingList;
    private JPanel jPnelMenuMuestreoRechazados;
    private JPanel jPnelMenuControlCalidad;
    private JPanel panelMenu;
    private JPanel jpanelContent;
    private JPanel panelToShowData;

    private JPanel copiaPanel;


    private void addImageAndName(){



    }



    public  AdminPanel(){

        adminPanel.setSize(1000,1200);

        jPnelMenuTodos.addMouseListener(this);
        jPnelMenuContenedores.addMouseListener(this);
        jPnelMenuContenedoresAcopio.addMouseListener(this);
        jPnelMenuCamionesyCarretas.addMouseListener(this);
        jPnelMenuPackingList.addMouseListener(this);
        jPnelMenuMuestreoRechazados.addMouseListener(this);
        jPnelMenuControlCalidad.addMouseListener(this);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == jPnelMenuTodos) {

            System.out.println("SE PRESIONO TODOS HERE");

          //  jPnelMenuTodos.setBackground(Color.decode("#79147b"));


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

            case Variables.CONTENEDORES : //401441 //ESTE NORMAL

                jPnelMenuTodos.setBackground(Color.decode("#401441"));
                jPnelMenuContenedores.setBackground(Color.decode("#79147b"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#401441"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#401441"));
                jPnelMenuPackingList.setBackground(Color.decode("#401441"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#401441"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#401441"));



                createPanelHere();



              //  JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);


                break;


            case Variables.CAMIONESYCARRETAS:
                jPnelMenuTodos.setBackground(Color.decode("#401441"));
                jPnelMenuContenedores.setBackground(Color.decode("#401441"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#401441"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#79147b"));
                jPnelMenuPackingList.setBackground(Color.decode("#401441"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#401441"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#401441"));
                break;



            case Variables.CONTENEDORES_ACOPIO:
                jPnelMenuTodos.setBackground(Color.decode("#401441"));
                jPnelMenuContenedores.setBackground(Color.decode("#401441"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#79147b"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#401441"));
                jPnelMenuPackingList.setBackground(Color.decode("#401441"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#401441"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#401441"));

                break;

            case Variables.TODOS :
                jPnelMenuTodos.setBackground(Color.decode("#79147b"));
                jPnelMenuContenedores.setBackground(Color.decode("#401441"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#401441"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#401441"));
                jPnelMenuPackingList.setBackground(Color.decode("#401441"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#401441"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#401441"));
                break;

            case Variables.PACKINGLIST :
                jPnelMenuTodos.setBackground(Color.decode("#401441"));
                jPnelMenuContenedores.setBackground(Color.decode("#401441"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#401441"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#401441"));
                jPnelMenuPackingList.setBackground(Color.decode("#79147b"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#401441"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#401441"));
                break;

            case Variables.MUESTREO_RECHZADOS :
                jPnelMenuTodos.setBackground(Color.decode("#401441"));
                jPnelMenuContenedores.setBackground(Color.decode("#401441"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#401441"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#401441"));
                jPnelMenuPackingList.setBackground(Color.decode("#401441"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#79147b"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#401441"));
                break;

            case Variables.CONTROL_CALIDAD :
                jPnelMenuTodos.setBackground(Color.decode("#401441"));
                jPnelMenuContenedores.setBackground(Color.decode("#401441"));
                jPnelMenuContenedoresAcopio.setBackground(Color.decode("#401441"));
                jPnelMenuCamionesyCarretas.setBackground(Color.decode("#401441"));
                jPnelMenuPackingList.setBackground(Color.decode("#401441"));
                jPnelMenuMuestreoRechazados.setBackground(Color.decode("#401441"));
                jPnelMenuControlCalidad.setBackground(Color.decode("#79147b"));
                break;




        }


   }

   private void createPanelHere(){

      float sizePanelWidth= jpanelContent.getSize().width;
      double sizePanelHeigth= jpanelContent.getSize().getHeight();


       JPanel seeReportsJpanel = new JPanel();
       seeReportsJpanel.setBackground(Color.BLUE);
       seeReportsJpanel.setSize((int)sizePanelWidth/2,(int)sizePanelHeigth);

       jpanelContent.setLayout(null);
       jpanelContent.add(seeReportsJpanel);






       JPanel previewJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
       previewJpanel.setBackground(Color.CYAN);

       previewJpanel.setSize((int)sizePanelWidth/2,(int)sizePanelHeigth);
       jpanelContent.setOpaque(true);
       jpanelContent.add(previewJpanel);

       jpanelContent.updateUI();


       ///  validate();

       jpanelContent.updateUI();

   }


}
