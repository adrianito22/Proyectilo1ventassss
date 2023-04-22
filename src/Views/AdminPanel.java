package Views;

import utils.Variables;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class AdminPanel  implements MouseListener {


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

       // adminPanel.setSize(1000,1200);

        jPnelMenuInicio.addMouseListener(this);
        jPnelMenuContenedores.addMouseListener(this);
        jPnelMenuContenedoresAcopio.addMouseListener(this);
        jPnelMenuCamionesyCarretas.addMouseListener(this);
        jPnelMenuPackingList.addMouseListener(this);
        jPnelMenuMuestreoRechazados.addMouseListener(this);
        jPnelMenuControlCalidad.addMouseListener(this);

      //  createPanelHere();


       // generapanelHere();

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

        scrollPanel.setBounds(10, 10, scrollPanel.getWidth(), scrollPanel.getHeight());

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

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == jPnelMenuInicio) {

          //  createPanelHere();
            System.out.println("SE PRESIONO INICIO");
            //  jPnelMenuInicio.setBackground(Color.decode("#554176"));

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



    void generapanelHere(){

      float sizePanelWidth= jpanelContent.getSize().width;
      double sizePanelHeigth= jpanelContent.getSize().getHeight();

       ScrollPane scrollPanel= new ScrollPane();
       scrollPanel.setSize((int)sizePanelWidth,(int)sizePanelHeigth);


       JPanel borderLayoutPanel=new JPanel(new BorderLayout());
       borderLayoutPanel.setBorder(new EmptyBorder(0, 10, 0, 10)); //le agregamos un border estaab a en top

       PanelAllUsers panelContieneComponentes = new PanelAllUsers();
//      // borderLayoutPanel.setSize((int)sizePanelWidth/2,(int)sizePanelHeigth);

       borderLayoutPanel.add(panelContieneComponentes, BorderLayout.NORTH);

       scrollPanel.add(borderLayoutPanel);

       scrollPanel.setBounds(10, 10, scrollPanel.getWidth(), scrollPanel.getHeight());

       jpanelContent.setLayout(null);
       jpanelContent.add(scrollPanel);
      // jpanelContent.add(panelContieneComponentes); //asi estaba



       jpanelContent.updateUI(); ///esto hacemos aca
       // jpanelContent.validate();

    //    return  jpanelContent;


   }


}
