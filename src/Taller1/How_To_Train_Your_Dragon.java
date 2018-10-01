/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import LinearDataStructures.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author BOG-A406-E-018
 */
public class How_To_Train_Your_Dragon {
    
    public static List sleeping_dragons =new List();
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    public static void main (String []args) throws IOException
    {
        
        sleeping_dragons.insertAtBegin(new sleeping_dragons(4,4));
        String input = br.readLine();
        int dias=0;
        while(input==" ")
        {
            for(int i=0;i<=4;i++)
            {
                bw.write("...Por favor digite los dias que el dragon tarda en ser entrenado...\n");
                bw.flush();
                dias = Integer.parseInt(br.readLine());
                
            }
        }
              
    }
}
