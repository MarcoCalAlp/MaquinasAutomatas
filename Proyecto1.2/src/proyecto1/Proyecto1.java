/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import proyecto1.Control.Control;
import proyecto1.Model.Model;
import proyecto1.View.View;

/**
 *
 * @author marcovinicio
 * Proyecto creado por Marco Vinicio Calderon Alpizar
 * Cedula 116400285
 * Grupo: PrograIII , 8:00am
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model=new Model() ;
        View view = new View();
        Control controller = new Control(model,view);
        view.setVisible(true);
    }
    
}
