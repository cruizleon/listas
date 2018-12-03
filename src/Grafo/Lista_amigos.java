/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import LinearDataStructures.Node;

/**
 *
 * @author LENOVO1
 */
public class Lista_amigos implements Node {
//estructura de datos
       public int usuario;
	public int amigo ;
        
        //apuntador
	public Lista_amigos next = null;
	
	
	/**
	 * 
	 * @param value
	 */
	public Lista_amigos(int user,int value) 
	{
                this.usuario = user;
		this.amigo = value;
	}

	
	@Override
	public void setNext(Node node) 
	{
		next = (Lista_amigos)node;
	}

	@Override
	public Node getNext() 
	{
		return next;
	}

	@Override
	public Node clone() 
	{
		return new Lista_amigos(this.usuario,this.amigo);
	}

	@Override
	public boolean isEqual(Node node) 
	{
		Lista_amigos temp = (Lista_amigos)node;
		return this.amigo == temp.amigo ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) 
	{
		Lista_amigos temp = (Lista_amigos)node;
		return this.amigo < temp.amigo ? true : false;
	}
	
	@Override
	public String toString()
	{
		return this.usuario + " es amigo de: "+ amigo+" \n";
	}
}
