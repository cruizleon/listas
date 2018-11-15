package Trees;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/*
# Binary Tree Data Structure.
#
# Created by Msc. Carlos Andres Sierra on April 2018.
# Copyright (c) 2018  Msc. Carlos Andres Sierra. Research Group on Artificial Life - ALIFE. All rights reserved.
#
# This file is part of DataStructuresTemplates.
#
# DataStructuresTemplates is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 3.
*/

/**
 * This class represents the behavior of Binary Trees
 * @author MSc. Carlos Andres Sierra, PhD. student
 */
public class BinaryTree {
	
	public static BinaryTreeNode root = null; //
	 
	/**
	 * 
	 */
	public BinaryTree() {}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return root == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param value
	 */
	public void insert(BinaryTreeNode node)
	{
		if(isEmpty())
		{
			root = node;
		}
		else
		{
			BinaryTreeNode temp = root;
			BinaryTreeNode parent = root;
			//Busqueda del hueco
			while(temp != null)
			{
				parent = temp;
				if(node.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}
			//Inserción en el hueco
			if(node.isLessThan(parent))
				parent.setLeft(node);
			else
				parent.setRight(node);
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public BinaryTreeNode search(BinaryTreeNode nodeToSearch)
	{
		BinaryTreeNode temp = root;
		
		while(temp != null)
		{
			if(temp.isEqual(nodeToSearch))
				break;
			else
				if(nodeToSearch.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
		}
		
		return temp;
	}

	/**
	 * 
	 * @param value
	 */
	public void delete(BinaryTreeNode nodeToDelete)
	{
            BinaryTreeNode temp = root;
            BinaryTreeNode parent = root;
            BinaryTreeNode r = root;
		
            while(temp != null)
            {
                    
                if(temp.isEqual(nodeToDelete))
                {
                    break;
                }
		else
                {
                    parent = temp;
                        
                    if(nodeToDelete.isLessThan(temp))
                        temp = temp.getLeft();
                    else
                        temp = temp.getRight();
		}
            }
            if (temp!= null)
            {
                if (isLeaf(temp))
                {
                    if(temp.isLessThan(parent))
                        parent.setLeft(null);
                    else
                        parent.setRight(null);
                }
                else
                {
                    if(oneChild(temp))
                    {
                        if(temp.getLeft() != null)
                        {
                            if(temp.isLessThan(parent))
                                parent.setLeft(temp.getLeft());
                            else
                                parent.setRight(temp.getRight());
                        }
                        else
                        {
                        if(temp.isLessThan(parent))
                            parent.setLeft(temp.getRight());
                        else
                            parent.setRight(temp.getRight());
                        }
                    }
                    else
                    {
                        BinaryTreeNode less = temp.getRight();
                            
                        while(less.getLeft() != null)
                            less.getLeft();
                            
                        delete(less);
                            
                        less.setLeft(temp.getLeft());
                        less.setRight(temp.getRight());
                            
                        if(temp.isLessThan(parent))
                            parent.setLeft(less);
                        else
                            parent.setRight(less);
                    }
                }
            }
        }

	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLeaf(BinaryTreeNode node)
	{
		return (node.getLeft() == null && node.getRight() == null) ? true : false;
	}
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean oneChild(BinaryTreeNode node)
	{
		return (node.getLeft() != null && node.getRight() != null) ? false : true;
	}
	
	/**
	 * 
	 * @param node
	 */
	public void preorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			System.out.print(node.toString() + " ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
        
	/**
	 * 
	 * @param node
	 */
	public void postorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.toString() + " ");
		}
		
	}
        
	/**
	 * 
	 * @param node
	 */
	public void inorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			inorder(node.getLeft());
			System.out.print (node.toString() + " ");
			inorder(node.getRight());
		}	
	}
        
        public static void main(String[]args)
        {
            BinaryTree bt = new BinaryTree();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                int op, num;
                //String n;
                Scanner leer =new Scanner (System.in); 
                do
                {
                    System.out.print("\n Escoja la accion que desea realizar\n");
                    System.out.println("Menu \n 1. agragar datos al arbol \n 2. imprimir arbol en preorden \n "
                                   + "3. imprimir arbol en postorden \n 4. imprimir arbol en inorden \n 5. buscar un nodo "
                                   + "\n 6. eliminar un nodo\n 7. salir \n");
                    op=leer.nextInt();
                    switch(op)
                    {
                        case 1: String[] numbers = br.readLine().split(",");
                                for(int i = 0; i < numbers.length; i++)
                                    bt.insert( new BinaryNodeExample(Integer.parseInt(numbers[i])));
                        break;
                        case 2: bt.preorder(bt.root);
                        break;
                        case 3: bt.postorder(bt.root);
                        break;
                        case 4: bt.inorder(bt.root);
                        break;
                        case 5: num=leer.nextInt();
                                bt.search(new BinaryNodeExample(num));
                        break;
                        case 6: num=leer.nextInt();
                                bt.delete(new BinaryNodeExample(num));
                        break;
                        case 7: System.out.print("...Salir...\n");

                        break;
                        default: System.out.print("opcion incorrecta\n");

                        break;
                    }
                }while(op!=7);
               
            }
            catch (Exception ex){}
        }
}
