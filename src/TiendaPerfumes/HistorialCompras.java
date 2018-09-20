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
    String NombreProduc=null;
    String codigo=null;
    String Marca =null; 
    String PerfumesPara =null;
    int Precio =0;
    Perfumeria next = null;
    
    public HistorialCompras(String NumeroProducto)
    {
        this.codigo = NumeroProducto;
    }
    public HistorialCompras(String nombre, String numero, String marca,String para, int precio)
   {
       this.NombreProduc = nombre;
       this.codigo = numero;
       this.Marca = marca;
       this.PerfumesPara=para;
       this.Precio = precio;
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
        Perfumeria clone = new Perfumeria(NombreProduc, codigo, Marca,PerfumesPara,Precio);
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
    Perfumeria temp = (Perfumeria)node;
        if(this.Precio < temp.Precio)
            return true;
        
        return false;    
    }
    
    public String toString()
    {
        return this.NombreProduc +", Codigo:" + codigo + ", Marca: " + Marca +", para: "+PerfumesPara+", valor total $" + Precio +"\n ";
    }
}
