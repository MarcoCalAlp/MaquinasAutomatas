/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Model;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcovinicio
 */
public class Model extends Observable {
  public Maquina maquina; 
  public Estado es;
  public Transicion tr;
  
  
 //---------METODOS-------------------------------------

    public Model() {
        maquina=new Maquina();
    }


//---------------------------------------------

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers(null); 
    }
//---------------ESTADOS--------------------------------
    public Model addEstado(Estado e){
        maquina.addEstado(e);
        this.setChanged();
        this.notifyObservers(null);                     
        return this;
    }
//----------------------------------------------
    public Estado getEstado(int i){
     return maquina.getEstado(i);
  
    } 
//------------------------------------------------
public List<Estado> getEstados() {
     return  maquina.getEstados(); 
}
//-------------------------------------------------
 public Estado getEs() {
        return es;
    }
//-------------------------------------------------
public void setEs(Estado es) {
    this.es = es;
}
//------------------------------------------------
public void removerEst(){
    maquina.eliminarEstados();
}
//-----------TRANSICIONES-------------------------------
    public Model addTransicion(Transicion t){
        maquina.addTransicion(t);
        this.setChanged();
        this.notifyObservers(null);                      
        return this;
    }
//-----------------------------------------------
    public Transicion getTransicion(int i){
     return  maquina.getTransicion(i);
    } 

//-----------------------------------------------

    public Transicion getTr() {
        return tr;
    }
//-----------------------------------------------
    public void setTr(Transicion tr) {
        this.tr = tr;
    }
  
//------------------------------------------------
 public List<Transicion> getTransiciones() {
        return maquina.getTransiciones();
    }
//-------------------------------------------------
 public void removerTrans(){
    maquina.eliminarTransiciones();
}
//-------------------------------------------------
public void move(int estElegido, int x, int y){
    Estado e=this.getEstados().get(estElegido);
       e.setX(e.getX()+x);
       e.setY(e.getY()+y);
       setChanged();
       notifyObservers(null);        
    }
//-------------------------------------------------
public Transicion getTrans(Transicion t){
    for(int i=0;i<this.getTransiciones().size();i++){
        if(this.getTransicion(i).equals(t)){
            return this.getTransicion(i);
        }
    }
    return null;
}
//-------------------------------------------------
 public boolean MEF(String e){
       boolean flag=false;
       int estadoFinal=-1;
       int i=0;int j=0;int k=0;
       //---------------CODIGO DE RECORRIDO-----------------------------------------------
       while(j<getTransiciones().size())
       {
           
           if(i<e.length())
           {
                     if(k<getTransicion(j).getCadenaSim().length())
                    {//Compara los simbolos de la primera trancision con el caracter i de la hilera a verificar
                        flag=false;
                        estadoFinal=getTransicion(j).getDestino().getEstado();
                        if(e.charAt(i)==getTransicion(j).getCadenaSim().charAt(k)){
                            j++; // Si el caracter i esta correcto entonces pasamos a la siguiente trancision
                            i++;//Y prosigue a comparar el siguiente caracter de la hilera
                            k=0;
                            flag=true;//Hasta el momento es MEF
                        } 
                        else{
                        k++;//Se recorre otro caracater de los simbolos de la transicion
                        }
                    }
                    else
                     {
                        if(flag==false){
                            return flag;//Si un caracter de la hilera no es igual a uno de los simbolos
                        }
                     }
                   // return flag;
          }
          else{j++;}//Si la fila ya ha sido recorrida
       }
       //------------------CODIGO DE VERIFICACION DE ESTADO-------------------------------------
       //Me permite saber si la hilera termino en un estado final
       if(flag==true&&estadoFinal==2){
       flag=true;
       }
       else{
       flag =false;
       }
       //---------------------------------------------------------------------------------------
       return flag;      
 }
 //----------------------ARCHIVOS----------------------------------------------------------------------
    public void guardar(OutputStream xml) {
        try{
            JAXBContext ctx=  JAXBContext.newInstance(Maquina.class);
            Marshaller ma = ctx.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            ma.marshal(maquina, xml);
             setChanged();
             notifyObservers(null);  
        }
        catch(JAXBException e){
        System.out.println("Error");
        }
    }
    
    //-------------------------------------------
    public void recuperar(InputStream xml) {
        try {
         JAXBContext ctx=  JAXBContext.newInstance(Maquina.class);
         Unmarshaller um= ctx.createUnmarshaller();
         maquina=(Maquina) um.unmarshal(xml);
         setChanged();
         notifyObservers(null);  
        }
        catch(JAXBException e){}
        
    }
   //--------------------------------------------

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
    //---------------------------------------------
    public Maquina getMaquina() {
        return maquina;
    }
    
   

}
