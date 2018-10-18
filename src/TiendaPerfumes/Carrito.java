/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaPerfumes;

import LinearDataStructures.Node;
/**
 *
* @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Carrito implements Node {

    String codigo=null;

    Carrito next = null;
    String NombreProduc;
    
    public Carrito(String NumeroProducto)
    {
        this.codigo = NumeroProducto;
    }
    public Carrito(String numero, String codigo)
   {
       this.codigo = numero;

   }
    

    @Override
    public void setNext(Node node) 
    {
        
    }
    
    @Override
    public Node getNext() {
        return next;
    }

    @Override
    public Node clone() {
        Perfumeria clone = new Perfumeria(codigo);
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
    public boolean isLessThan(Node node) {
        return false;    
    }
    
    public String toString()
    {
        return this.NombreProduc +",El codigo del producto es: " + codigo;
    }
}
