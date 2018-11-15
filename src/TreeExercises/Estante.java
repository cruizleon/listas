/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeExercises;

import Trees.BinaryTreeNode;

/**
 *
 * @author TATIANA
 */
public class Estante implements BinaryTreeNode {

	public int value;
	public Estante left;
	public Estante right;
	
	public  Estante(int value)
	{
		this.value = value;
	}
	
	
	@Override
	public void setLeft(BinaryTreeNode node) 
	{
		left = (Estante)node;
	}

	
	@Override
	public BinaryTreeNode getLeft() 
	{
		return left;
	}

	
	@Override
	public void setRight(BinaryTreeNode node)
	{
		right = (Estante)node;
	}

	
	@Override
	public BinaryTreeNode getRight() 
	{
		return right;
	}

	
	@Override
	public BinaryTreeNode clone()
	{
		return new Estante(this.value);
	}

	
	@Override
	public boolean isEqual(BinaryTreeNode node) 
	{
            Estante temp = (Estante)node;
            return this.value == temp.value ? true : false;
	}

	@Override
	public boolean isLessThan(BinaryTreeNode node)
	{
            Estante temp = (Estante)node;
            return this.value < temp.value ? true : false;
	}
        public String toString()
	{
		return this.value + ",";
	}
}