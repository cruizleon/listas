/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaPerfumes;

import LinearDataStructures.Node;

/**
 *
 * @author BOG-A409-E-005
 */
public class HistorialCompras implements Node{

    String codigo=null;
    Perfumeria next = null;
    
    public HistorialCompras(String NumeroProducto)
    {
        
    }
    public HistorialCompras(String nombre, String numero, String marca,String para, int precio)
   {
    
       this.codigo = numero;
   }
    

    @Override
    public void setNext(Node node) 
    {
        next =(Perfumeria)node;    
    }
    
    @Override
    public Node getNext() {
        return next;
    }

    @Override
    public Node clone() {
        Perfumeria clone = new Perfumeria( codigo);
        return clone;    
    }

    @Override
    public boolean isEqual(Node node) {
        Perfumeria temp = (Perfumeria)node;
        if(this.codigo.equals(temp.NumeroProduc))
            return true;
        
        return false;
    }

    @Override
    public boolean isLessThan(Node node) 
    {

        return false;    
    }
    
    public String toString()
    {
        return this. codigo + "\n";
    }
}
