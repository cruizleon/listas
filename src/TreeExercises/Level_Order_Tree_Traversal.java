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
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



/**
 *
 * @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Level_Order_Tree_Traversal 
{
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    public static String[]lateral=null;
    public static int cant=0;
    public static void main(String[]args) 
    {
        try
        {
            
            String[]numbers=null;
            BinaryTree n = new BinaryTree();
            int cas,k;
            
            cas = Integer.parseInt(br.readLine());
            
            for (int i =0; i<cas;i++)
            {             
                cant = Integer.parseInt(br.readLine());
                
                numbers = br.readLine().split(",");
                for(int j = 0; j < numbers.length; j++)
                    n.insert( new BinaryNodeExample(Integer.parseInt(numbers[j])));
                
                lateral=numbers;
                for(k=0;k<cant;k++){
                    n.nivel(new BinaryNodeExample(Integer.parseInt(lateral[k])),cant);
                    //lateral[k]=Integer.toBinaryString(4);
                }
            }
            
        }catch(Exception ex) {}
    }

}
