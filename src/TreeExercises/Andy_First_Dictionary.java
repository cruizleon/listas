/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TreeExercises;


import LinearDataStructures.ExampleNode;
import LinearDataStructures.List;
import LinearDataStructures.Node;
import Trees.BinaryTree;
import Trees.BinaryTreeNode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Andy_First_Dictionary {
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    
    public static void main(String[]args) throws IOException
    {
        BinaryTree palabras = new BinaryTree();
        List caracter= new List();
        String text;
        String []caracteres;
        text = br.readLine();
        
        //System.out.println(text.toLowerCase());
        
        caracter.insertAtBegin(new caracter(text.toLowerCase()));
        caracter.printList();
       // Node head=null;
        //Node node=null;
       // Node temp = head;
		
		//while(temp != null)
		//{
			//if(temp.isEqual(node))
			//{	
			//	caracter.insertAtEnd(temp.clone());
			//}
			
			//temp = temp.getNext();
                       // palabras.insert((BinaryTreeNode) temp);
		//}

    }
}
