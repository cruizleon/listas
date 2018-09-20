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
 * in this class is the structure of the list of perfumery products
 */
public class Perfumeria implements Node {
    String NombreProduc=null;
    String NumeroProduc=null;
    String Marca =null; 
    String PerfumesPara =null;
    int Precio =0;
    Perfumeria next = null;
    
    public Perfumeria(String NumeroProducto)
    {
        this.NumeroProduc = NumeroProducto;
    }
    public Perfumeria(String nombre, String numero, String marca,String para, int precio)
   {
       this.NombreProduc = nombre;
       this.NumeroProduc = numero;
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
        Perfumeria clone = new Perfumeria(NombreProduc, NumeroProduc, Marca,PerfumesPara,Precio);
        return clone;    
    }

    @Override
    public boolean isEqual(Node node) {
        Perfumeria temp = (Perfumeria)node;
        if(this.NumeroProduc.equals(temp.NumeroProduc))
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
        return this.NombreProduc +", Codigo:" + NumeroProduc + ", Marca: " + Marca +", para: "+PerfumesPara+", valor total $" + Precio +"\n ";
    }
}
