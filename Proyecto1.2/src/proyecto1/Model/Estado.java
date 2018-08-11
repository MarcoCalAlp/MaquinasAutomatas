/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Model;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marcovinicio
 */
@XmlRootElement(name="estado")
@XmlType(propOrder={"estado","nombre","X","Y"})
public class Estado {
public final static int INICIAL=0;
 public final static int INTERMEDIO=1;
 public final static int FINAL=2;
 private int estado;
 private String nombre;
 private int X;
 private int Y;
 
 
 //---------------------------------------

    public Estado(int estado, String nombre,int x,int y) {
        this.estado = estado;
        this.nombre = nombre;
        this.X=x;
        this.Y=y;
    }

   

    
 //-----------------------------------------

    public Estado() {
        estado=INICIAL;
        nombre="";
        X=0;
        Y=0;
    }
//------------------------------------------

    public int getEstado() {
        return estado;
    }
//------------------------------------------

    public void setEstado(int estado) {
        this.estado = estado;
    }
//-------------------------------------------

    public String getNombre() {
        return nombre;
    }
//--------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//--------------------------------------------

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
//--------------------------------------------
    
}
