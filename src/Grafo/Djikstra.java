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
 * @author LENOVO1
 */
public class Djikstra {
 
 public static void main(String[]args) throws IOException
 {
   int nodes=5;
   int [][] matrix = new int[nodes][nodes];
   matrix[0][1]= 1;
   matrix[0][2]= 1;
   matrix[1][3]= 1;
   matrix[2][4]= 1;
   matrix[3][4]= 1;
   
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
   
   //bw.write("pofavor digite el nodo con el que quiere empezar el recorrido...\n");
   bw.flush();
   int nodoInicio=0;//Integer.parseInt(br.readLine());
   //bw.write("pofavor digite el nodo al que quiere llegar...\n");
   bw.flush();
   int nodoFin=4;//Integer.parseInt(br.readLine());
   int posible=0;
   int casos=0, caso1=0, caso2=0;
   for (int i = 0; i <nodoInicio ; i++) 
   {
      for (int j = 0; j < nodes; j++) {
         if(matrix[i][j]==1)
         {
           casos=j;
           posible++;
         }
               
      }
      bw.write("\n");
   }
   bw.flush();
   
   int cantCas1=0;
   while(casos!=posible)
   {
    casos++;
   int fila=0;
   int colum=0;
   for (int i = 0; i <nodes ; i++) 
   {
      for (int j = 0; j < nodes; j++) {
         if(matrix[i][j]==1)
         {
          if (caso1==0)
          {
           fila=i;
           colum=j;
           cantCas1++;
          }
           
         }
               
      }
      bw.write("\n");
   }
   bw.flush();
   }
 }
 
 
 
 }
 

