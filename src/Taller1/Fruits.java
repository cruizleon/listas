/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import LinearDataStructures.Node;

/**
 *
* @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Fruits implements Node {

    String Nombre=null;
    double Precio=0;
    Fruits next = null;
    
    public Fruits(String nombre, double precio)
    {
        this.Nombre = nombre;
        this.Precio = precio;
    }
    
    @Override
    public void setNext(Node node) 
    {
        next =(Fruits)node;
    }
    
    @Override
    public Node getNext() {
        return next;
    }
   
    @Override
    public boolean isEqual(Node node) {
        Fruits temp = (Fruits)node;
        if(this.Nombre.equals(temp.Nombre))
            return true;
        
        return false;
    }

    @Override
    public boolean isLessThan(Node node) {
        return false;    
    }
    
    public String toString()
    {
        return this.Nombre +"= $" + Precio+"\n";
    }

    @Override
    public Node clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
