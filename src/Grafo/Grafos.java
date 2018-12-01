/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author BOG-A409-E-005
 */
public class Grafos {
 
 public static void main(String []args) throws IOException
 {
   int nodes=6;
   int [][] matrix = new int[nodes][nodes];
   matrix[0][1]= matrix[1][0]=1;
   matrix[0][2]= matrix[2][0]=1;
   matrix[1][2]= matrix[2][1]=1;
   matrix[1][3]= matrix[3][1]=1;
       
   matrix[2][3]= matrix[3][2]=1;
   matrix[3][4]= matrix[4][3]=1;
   matrix[3][5]= matrix[5][3]=1;
   matrix[4][5]= matrix[5][4]=1;
       
   BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
   BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        
   for (int i = 0; i < nodes; i++) 
   {
      for (int j = 0; j < nodes; j++) {
         bw.write(matrix[i][j]+" ");
               
      }
      bw.write("\n");
   }
   bw.flush();
        
        // eliminar coneccion
        matrix[1][3]= matrix[3][1]=1;
       
        int node_toSearch = 3;
        for(int i = 0; i < nodes; i++){
            if (matrix[node_toSearch][i] == 1){
		bw.write("Conexión con el nodo" + (i + 1) + "\n");
            }
            bw.flush();
        }
        
    }

		

        
}

