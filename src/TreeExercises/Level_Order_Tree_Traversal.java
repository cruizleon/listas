/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TreeExercises;

import Trees.BinaryNodeExample;
import Trees.BinaryTree;
import static Trees.BinaryTree.root;
import Trees.BinaryTreeNode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author BOG-A401-E-001
 */
public class Level_Order_Tree_Traversal 
{
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    public static void nivel(BinaryTreeNode node)
	{
            BinaryTreeNode cola=root;
		while(cola != null)
		{
                    System.out.print(node.toString() + " ");
                    node=cola;
                    if(node.getLeft()!=null)
                        nivel(node.getLeft());
                    if(node.getRight()!=null)
                        nivel(node.getRight());
			
			
		}
	}
    public static void main(String[]args) throws IOException
    {
        BinaryTree bt = new BinaryTree();
        
        String[] numbers = br.readLine().split(",");
        for(int i = 0; i < numbers.length; i++)
            bt.insert( new BinaryNodeExample(Integer.parseInt(numbers[i])));
        
    }

}
