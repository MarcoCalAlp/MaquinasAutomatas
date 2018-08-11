/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marcovinicio
 */
@XmlRootElement(name="transicion")
@XmlType(propOrder={"origen","destino"})
public class Transicion {
 private Estado origen;
 private Estado destino;
 private String cadenaSim="";

 
 //----------------------------------------
public Transicion() {
    origen=null;
    destino=null;
}
//-----------------------------------------

    public Transicion(Estado origen, Estado destino) {
        this.origen = origen;
        this.destino = destino;
    }
//-----------------------------------------

    public Estado getOrigen() {
        return origen;
    }
//-----------------------------------------

    public void setOrigen(Estado origen) {
        this.origen = origen;
    }
//------------------------------------------

    public Estado getDestino() {
        return destino;
    }
//-----------------------------------------

    public void setDestino(Estado destino) {
        this.destino = destino;
    }
//-----------------------------------------
    public String getCadenaSim() {
        return cadenaSim;
    }
//-----------------------------------------
    public void setCadenaSim(String cadenaSim) {
        this.cadenaSim = cadenaSim;
    }
//-----------------------------------------
    

}
