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
public class Names_chalice implements Node {

    String Nombre=null;
    String Escuela=null;
    int Rollo=0;
    Names_chalice next = null;
    
    public Names_chalice(String nombre, String escuela, int rollo)
    {
        this.Nombre = nombre;
        this.Escuela = escuela;
        this.Rollo = rollo;
    }
    
    @Override
    public void setNext(Node node) 
    {
        next =(Names_chalice)node;
    }
    
    @Override
    public Node getNext() {
        return next;
    }
   
    @Override
    public boolean isEqual(Node node) {
        Names_chalice temp = (Names_chalice)node;
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
        Names_chalice clone = new Names_chalice(Nombre, Escuela, Rollo);
        return clone;
    }
}

