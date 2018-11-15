/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TreeExercises;

import Trees.BinaryTree;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author BOG-A401-E-001
 */
public class Andy_First_Dictionary {
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    
    public static void main(String[]args) throws IOException
    {
        BinaryTree palabras = new BinaryTree();
        String text;
        char []caracteres;
        text = br.readLine();
        
        System.out.println(text.toUpperCase());
        caracteres = text.toCharArray();
        
        for (int i=0; i<caracteres.length;i++)
        {
            palabras.insert(caracteres[i]);
        }
        
        palabras.postorder(palabras.root);
        
        
    }
}
