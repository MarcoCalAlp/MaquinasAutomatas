/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Control;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import proyecto1.Model.Estado;
import proyecto1.Model.Model;
import proyecto1.Model.Transicion;
import proyecto1.View.View;

/**
 *
 * @author marcovinicio
 */
public class Control extends MouseAdapter implements MouseListener, ActionListener{
    Model model;
    View view;      
    int elegida=-1;
    Point origen=null;
    Point destino=null;
    int start=-1;
    int end=-1;

    public Control(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setControl(this);
    }

    //-----------------------------------------------
    @Override
    public void mouseClicked(MouseEvent e) {
    try{
         if (elegida!=-1)//-----------Dirigida a las transiciones
         {
            if(start==-1){ 
                start = elegida;
            }
            else{
                end = elegida;
                model.getEstado(end);
                model.getEstado(start);
                Transicion t=new Transicion(model.getEstado(start),model.getEstado(end));
                model.setTr(t);
                view.getSimboloView().setVisible(true);
                start=-1;
            }
        }
   //-----------------------------------------------------------------------------
        else{//Diriga solamente a los eventos que sucedan en los Menus
               JMenu digit =(JMenu)e.getSource();
               if(digit==view.getVerificar()){
               view.getVerificarPanel().setVisible(true);   
               } 
            }
        view.repaint();
    }
    
    catch(Exception b){}
    } 
   
//-------------------------------------------------------------------
    @Override
    public void mousePressed(MouseEvent e) {
           origen = e.getPoint();
           elegida = Encuentra(e.getPoint());
    }
//-------------------------------------------------------------------    

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
//-------------------------------------------------------------------
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
//-------------------------------------------------------------------
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
//-------------------------------------------------------------------
  
    @Override
    public  void mouseDragged(MouseEvent e){
        destino = e.getPoint();
        if(elegida !=-1){
            model.move(elegida,destino.x - origen.x, destino.y-origen.y);
            origen=destino;
        }
        view.repaint();
    }
 //----------------------------------------------------------------   
    public int Encuentra(Point p){
         Estado e;
         for(int i=0; i<model.getEstados().size();i++){
             e=model.getEstado(i);
             Rectangle r = new Rectangle(e.getX(),e.getY(),50,50);
             if (r.contains(p)){
                 return i;
             }
        }
         return -1;
    }

//----------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        
       switch(e.getActionCommand()){
            case "Inicial":
                Estado p=new Estado(0,view.getValorEstado(),50,50);
                model.setEs(p);
                view.getEstadoView().setTitle("Estado Inicial");
                view.getEstadoView().setVisible(true);
                view.repaint();
                break;
            case "Intermedio":
                Estado i=new Estado(1,view.getValorEstado(),50,50);
                model.setEs(i);
                view.getEstadoView().setTitle("Estado Intermedio");
                view.getEstadoView().setVisible(true);
                view.repaint();
                break;
            case "Final":
                Estado f=new Estado(2,view.getValorEstado(),50,50);
                model.setEs(f);
                view.getEstadoView().setTitle("Estado Final");
                view.getEstadoView().setVisible(true);
                view.repaint();
                break;
            case "Guardar":
                view.getArchivoFrame().setVisible(true);
                view.getArchivoFrame().setTitle("Guardar");
                view.getjFileChooser1().setApproveButtonText("Guardar");  
                break;
            case "Recuperar":
                view.getArchivoFrame().setVisible(true);
                view.getArchivoFrame().setTitle("Recuperar");
                view.getjFileChooser1().setApproveButtonText("Recuperar");
                break;
            case "Limpiar":
                model.removerEst();
                model.removerTrans();
                view.repaint();
                break;
            case "Aceptar":
                model.getEs().setNombre(view.getValorEstado());
                model.addEstado(model.getEs());
                view.getEstadoView().setVisible(false);  
                break;
            case "Cancelar":
                view.getEstadoView().setVisible(false);  
                
                break; 
            case "AceptarV":
                if(model.MEF(view.getVerficarField().getText())){
                 JOptionPane.showMessageDialog(view, "Aceptada :"+view.getVerficarField().getText(),"correcto" , 1);   
                }
                else{
                 JOptionPane.showMessageDialog(view, "Rechazada :"+view.getVerficarField().getText(),"Incorrecto" , 2);
                }
               
                break;
            case "CancelarV":
                view.getVerificarPanel().setVisible(false); 
                break; 
            case "AceptarS":
                model.getTr().setCadenaSim(view.getSimbolosField().getText());
                model.addTransicion(model.getTr());
                view.getSimboloView().setVisible(false);
                break; 
            case "CancelarS":
                 view.getSimboloView().setVisible(false);
                break; 
            case JFileChooser.APPROVE_SELECTION: 
                archivos();
                break;
            case JFileChooser.CANCEL_SELECTION:
               view.getArchivoFrame().setVisible(false);  
                break;
            
        }
    }
    //----------------------------------------------------------------------
    public void archivos(){
      File archivoSeleccionado= view.getjFileChooser1().getSelectedFile();
                String path=archivoSeleccionado.getAbsolutePath();
                try{
                    if(view.getjFileChooser1().getApproveButtonText().equals("Guardar")){
                    OutputStream es=new FileOutputStream(path);
                    model.guardar(es);
                    es.close();  
                    JOptionPane.showMessageDialog(view, "Guardado en :"+archivoSeleccionado.getAbsolutePath(),"Salvado" , 1);
                    }
                    else{
                    InputStream in=new FileInputStream(path);
                    model.recuperar(in);
                    in.close();
                    JOptionPane.showMessageDialog(view, "Recuperado de :"+archivoSeleccionado.getAbsolutePath(),"Recuperado" , 1);
                    view.repaint();
                    }
                    view.getArchivoFrame().setVisible(false);
                } 
                catch (Exception ex) {}   
    }
    //-----------------------------------------------------------------------
    
}
