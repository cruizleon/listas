/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TreeExercises;

import Trees.BinaryTreeNode;

/**
 *
 * @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Texto implements BinaryTreeNode {
    
	public String value;
	public Texto left;
	public Texto right;
	
	public  Texto(String value)
	{
		this.value = value;
	}
	@Override
	public void setLeft(BinaryTreeNode node) 
	{
		left = (Texto)node;
	}

	
	@Override
	public BinaryTreeNode getLeft() 
	{
		return left;
	}

	
	@Override
	public void setRight(BinaryTreeNode node)
	{
		right = (Texto)node;
	}

	
	@Override
	public BinaryTreeNode getRight() 
	{
		return right;
	}

	
	@Override
	public BinaryTreeNode clone()
	{
		return new Texto(this.value);
	}

	
	@Override
	public boolean isEqual(BinaryTreeNode node) 
	{
            Texto temp = (Texto)node;
            return this.value == temp.value ? true : false;
	}

	@Override
	public boolean isLessThan(BinaryTreeNode node)
	{
            Texto temp = (Texto)node;
            int comparison = value.compareTo(temp.value);
            return comparison < 0 ? true : false;
	}
        public String toString()
	{
		return this.value + ",";
	}
}