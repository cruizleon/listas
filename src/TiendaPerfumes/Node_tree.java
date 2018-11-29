/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaPerfumes;


import Trees.BinaryTreeNode;

/**
 *
 * @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Node_tree implements BinaryTreeNode {

	String NombreProdu=null;
        String NumeroProdu=null;
        String Marc =null; 
        String PerfumesPar =null;
        int Preci =0;
	public Node_tree left;
	public Node_tree right;
	
	public  Node_tree(String nombre, String numero, String marca,String para, int precio)
   {
       this.NombreProdu = nombre;
       this.NumeroProdu = numero;
       this.Marc = marca;
       this.PerfumesPar=para;
       this.Preci = precio;
   }
	
	@Override
	public void setLeft(BinaryTreeNode node) 
	{
		left = (Node_tree)node;
	}

	
	@Override
	public BinaryTreeNode getLeft() 
	{
		return left;
	}

	
	@Override
	public void setRight(BinaryTreeNode node)
	{
		right = (Node_tree)node;
	}

	
	@Override
	public BinaryTreeNode getRight() 
	{
		return right;
	}

	
	@Override
	public BinaryTreeNode clone()
	{
		return new Node_tree(NombreProdu, NumeroProdu, Marc,PerfumesPar,Preci);
	}

	
	@Override
	public boolean isEqual(BinaryTreeNode node) 
	{
            Node_tree temp = (Node_tree)node;
            return this.NumeroProdu == temp.NumeroProdu ? true : false;
	}

	@Override
	public boolean isLessThan(BinaryTreeNode node)
	{
            Node_tree temp = (Node_tree)node;
            return this.Preci < temp.Preci ? true : false;
	}
        public String toString()
	{
		return this.NombreProdu +", Codigo:" + NumeroProdu + ", Marca: " + Marc +", para: "+PerfumesPar+", valor total $" + Preci +"\n ";
	}
}