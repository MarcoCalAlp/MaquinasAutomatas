/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marcovinicio
 */
@XmlRootElement(name="maquina")
@XmlType(propOrder={"estados","transiciones"})
public class Maquina implements Serializable{
    private List<Estado> estados;  
    private List<Transicion> transiciones; 

    

    public Maquina() {
     estados=new ArrayList<Estado>();   
     transiciones=new ArrayList<Transicion>();   
    }
    

//---------------------------------------------
@XmlElementWrapper(name="estados")
@XmlElement(name="estado")
public List<Estado> getEstados() {
    return estados;
}

//----------------------------------------------
@XmlElementWrapper(name="transiciones")
@XmlElement(name="transicion")
    public List<Transicion> getTransiciones() {
        return transiciones;
    }


//---------------ESTADOS--------------------------------
    public void addEstado(Estado e){
        estados.add(e);
                 
    }
//----------------------------------------------
    public Estado getEstado(int i){
     return estados.get(i);
     
    } 
//---------------------------------------------   
    public void eliminarEstados(){
        estados.removeAll(estados);
    }
//-----------TRANSICIONES-------------------------------
    public void addTransicion(Transicion t){
        transiciones.add(t);
        
    }
//-----------------------------------------------
    public Transicion getTransicion(int i){
     return transiciones.get(i);
    } 
//------------------------------------------------
    public void eliminarTransiciones(){
        transiciones.removeAll(transiciones);
    }
//------------------------------------------------
    @XmlElementWrapper(name="estados")
    @XmlElement(name="estado")
    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
//------------------------------------------------
    @XmlElementWrapper(name="transiciones")
    @XmlElement(name="transicion")
    public void setTransiciones(List<Transicion> transiciones) {
        this.transiciones = transiciones;
    }
    
}
