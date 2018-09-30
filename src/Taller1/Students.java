/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import LinearDataStructures.Node;

/**
 *
 * @author TATIANA
 */
public class Students implements Node {

    String Nombre=null;
    String Escuela=null;
    int Rollo=0;
    Students next = null;
    
    public Students(String nombre, String escuela, int rollo)
    {
        this.Nombre = nombre;
        this.Escuela = escuela;
        this.Rollo = rollo;
    }
    
    @Override
    public void setNext(Node node) 
    {
        next =(Students)node;
    }
    
    @Override
    public Node getNext() {
        return next;
    }
   
    @Override
    public boolean isEqual(Node node) {
        Students temp = (Students)node;
        if(this.Escuela.equals(temp.Escuela))
            return true;
        
        return false;
    }

    @Override
    public boolean isLessThan(Node node) {
        return false;    
    }
    
    public String toString()
    {
        return this.Nombre +", " +Escuela+", "+Rollo+"\n";
    }

    @Override
    public Node clone() {
       Students clone = new Students(Nombre, Escuela, Rollo);
       return clone;
    }
}
