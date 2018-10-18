/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListEstudiantes;

import LinearDataStructures.Node;

/**
 *
* @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Estudiantes implements Node{
    String Name = null;
    String ID = null;
    int Edad = 0;
    String Correo = null;
    String Telefono =null;
    Estudiantes next = null;
   
   public Estudiantes(String name, String id, int edad, String correo, String telefono)
   {
       this.Name = name;
       this.ID = id;
       this.Edad = edad;
       this.Correo = correo;
       this.Telefono = telefono;
   }

    @Override
    public void setNext(Node node) {
       next =(Estudiantes)node;
    }

    @Override
    public Node getNext() {
        return next;
    }

    @Override
    public Node clone() {
        Estudiantes clone = new Estudiantes(Name, ID, Edad,Correo,Telefono);
            return clone;
    }

    @Override
    public boolean isEqual(Node node) {
        
        Estudiantes temp = (Estudiantes)node;
        if(this.ID.equals(temp.ID))
            return true;
        
        return false;
    }

    @Override
    public boolean isLessThan(Node node) {
        
        Estudiantes temp = (Estudiantes)node;
        if(this.Edad < temp.Edad)
            return true;
        
        return false;
    }
    
    public String toString()
    {
        return this.Name +", " + ID + ", " + Edad +", " + Correo +", " + Telefono;
    }
    
    
}
