/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeExercises;

import static TreeExercises.Screws_an_nuts.bw;
import Trees.BinaryTree;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author TATIANA
 */
public class Screws_an_nuts {
    
    
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    public static void main (String[]args) throws IOException
    {
        BinaryTree tuercas = new BinaryTree();
        int n,cant;
        bw.write("favor de ingresar el tamaño del tornillo  \n");
        bw.flush();
        String num;
        
        //do{
        n = Integer.parseInt(br.readLine());
        //num= n+"";
        for (int i =0; i<n;i++)
        {
            String[] numbers = br.readLine().split(",");
            for(int j = 0; i < numbers.length; i++)
                tuercas.insert( new Estante(Integer.parseInt(numbers[i])));   
        }
        cant = Integer.parseInt(br.readLine());
        //}while(num!=null);
        
    }
}
