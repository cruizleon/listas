package LinearDataStructures;

import java.io.*;

/*
# Stack Functions.
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
 * This class represents the behavior of Stacks
 * @author MSc. Carlos Andres Sierra, PhD. student
 */
public class Stack {
	
	public Node top = null; //top
	
	public Stack() {}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return top == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param newNode
	 */
	public void push(Node newNode)
	{
            newNode.setNext(top);
            top = newNode;
            
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Node pop()
	{
                Node temp = top;
		top = temp.getNext();
		temp = null;
                
		return temp;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String peek()
	{
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
            Node temp = top;
            try
            {
                if (temp==top)
                {
                    bw.write(temp.toString());
                }
		
            }
            catch(Exception ex) { ex.printStackTrace(); }
            return peek();
	}
	
	
	/**
	 * 
	 */
	public void printStack()
	{
		BufferedWriter bw = new BufferedWriter(	new OutputStreamWriter( System.out ));
		
		try
		{
			while(!isEmpty())
				bw.write(pop().toString());
			
			bw.flush();
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}
}