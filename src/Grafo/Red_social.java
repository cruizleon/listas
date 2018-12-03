/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import LinearDataStructures.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author LENOVO1
 */
public class Red_social 
{
 
 public static void main(String []args) throws IOException
 {
   List Lista_amigos = new List();
   int nodes=8;
   int [][] matrix = new int[nodes][nodes];
   matrix[0][1]= matrix[1][0]=1;
   matrix[1][3]= matrix[3][1]=1;
   matrix[1][4]= matrix[4][1]=1;
   matrix[1][7]= matrix[7][1]=1;
       
   matrix[2][3]= matrix[3][2]=1;
   matrix[3][4]= matrix[4][3]=1;
   matrix[3][6]= matrix[6][3]=1;
   matrix[3][7]= matrix[7][3]=1;
   matrix[4][5]= matrix[5][4]=1;
   matrix[6][7]= matrix[7][6]=1;
       
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
   
   bw.write("\n");
   bw.flush();
   
   for (int i =0;i<nodes;i++)
   {
      for(int j=0; j < nodes;j++)
      {
        if(matrix[i][j]==1)
        {
         Lista_amigos.insertAtBegin(new Lista_amigos(i,j));
        }
      }
   }
   
   Lista_amigos.printList();
   
   bw.write("\n por favor digite de que nodo decea saber si tiene amigos en comun con otro nodo\n");
   bw.flush();
   int codigo=Integer.parseInt(br.readLine());
   for (int i =0;i<nodes;i++)
   {
      for(int j=0; j < nodes;j++)
      {
        if(matrix[i][j]==1)
        {
         if(j==codigo)
         {
          for (int k =0;k<nodes;k++)
          {
             if(matrix[i][k]==1 && k!=codigo && k!=i)
             {
              bw.write(codigo+"y"+ k+" tienen a: "+i+" como un amigo en cumun \n");
              bw.flush();
             }
          }
         }
        }
      }
   }
 }
 
 
 
 
}
