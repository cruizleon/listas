/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeExercises;

import LinearDataStructures.Node;

/**
 *
 * @author BOG-A409-E-005
 */
public class caracter implements Node {
//estructura de datos
	public String value ;
        
        //apuntador
	public caracter next = null;
	
	
	/**
	 * 
	 * @param value
	 */
	public caracter(String value) 
	{
		this.value = value;
	}

	
	@Override
	public void setNext(Node node) 
	{
		next = (caracter)node;
	}

	@Override
	public Node getNext() 
	{
		return next;
	}

	@Override
	public Node clone() 
	{
		return new caracter(this.value);
	}

	@Override
	public boolean isEqual(Node node) 
	{
		caracter temp = (caracter)node;
		return this.value == temp.value ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) 
	{
		return false; 
	}
	
	@Override
	public String toString()
	{
		return this.value + " ";
	}
}