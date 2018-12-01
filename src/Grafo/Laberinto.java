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
public class Laberinto {
 
 public static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
 public static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
 public static int Fila=9,Columna=9;
 public static int [][] matrix = new int[Fila][Columna];
 public static int bandera=0;
 
 public static void crear_laberinto() throws IOException
 {
   // 2 es la salida
   matrix[6][2]= 2;
   //3 es la meta
   matrix[1][3]=3;
  
  //estos son los muros
   matrix[0][4]= 1;
   matrix[0][6]= 1;
   matrix[1][7]= 1;
   matrix[1][8]= 1;
   
   matrix[1][1]= 1;
   matrix[1][2]= 1;
   matrix[1][4]= 1;
   matrix[1][6]= 1;
   matrix[1][7]= 1;
   matrix[1][8]= 1;
   
   matrix[2][1]= 1;
   matrix[2][2]= 1;
   
   matrix[3][1]= 1;
   matrix[3][2]= 1;
   matrix[3][3]= 1;
   matrix[3][5]= 1;
   matrix[3][7]= 1;
   
   matrix[4][3]= 1;
   matrix[4][7]= 1;
   
   matrix[5][0]= 1;
   matrix[5][1]= 1;
   matrix[5][3]= 1;
   matrix[5][4]= 1;
   matrix[5][5]= 1;
   matrix[5][7]= 1;

   matrix[7][1]= 1;
   matrix[7][2]= 1;
   matrix[7][3]= 1;
   matrix[7][4]= 1;
   matrix[7][6]= 1;
   matrix[7][8]= 1;
   
   matrix[8][4]= 1;
   matrix[8][6]= 1;
   matrix[8][7]= 1;
   matrix[8][8]= 1;
   

        
   for (int i = 0; i < Fila; i++) 
   {
      for (int j = 0; j < Columna; j++) {
         bw.write(matrix[i][j]+" ");
               
      }
      bw.write("\n");
   }
   bw.flush();
 }
 
 public static void recorrido() throws IOException
 {
  //do{
  int FilaActual=0,ColumnaActual=0;
   for (int i =0;i<Fila;i++)
   {
     for (int j=0;j<Columna;j++)
     {
      if (matrix[i][j]==2)
      {
       FilaActual=i;
       ColumnaActual=j;
      }
     }
   }
   int posibleFila=FilaActual, posibleColumna=ColumnaActual;
   do
   {
    int tem=posibleColumna-1;
    int tem1=posibleColumna+1;
    int tem2=posibleFila-1;
    int tem3=posibleFila+1;
    bandera=0;
    
    // posicion izquierda
    if( tem >=0)
    {
     if (matrix[posibleFila][tem]!=1)
     {
      bandera=1;
      if((matrix[posibleFila][posibleColumna-1]==0)||(matrix[posibleFila][posibleColumna-1]==3))
      {
       posibleColumna=posibleColumna-1;
       if((matrix[posibleFila][posibleColumna]==0))
       {
        matrix[posibleFila][posibleColumna]=4;
       }
      }
     }
     else
     {
      posibleColumna=tem;
     }
    }
    
    //posicion derecha
    //if(bandera==0)
    //{
     if(tem1<=8)
     {
      if(matrix[posibleFila][tem1]!=1)
      {
       bandera=1;
       if((matrix[posibleFila][posibleColumna+1]==0)||(matrix[posibleFila][posibleColumna+1]==3))
       {
        posibleColumna=posibleColumna+1;
        if((matrix[posibleFila][posibleColumna]==0))
        {
         matrix[posibleFila][posibleColumna]=4;
        }
       }
      }
      else
      {
       posibleColumna=tem1;
      }
     }
    //}
    
    //posicion arriba
    //if(bandera==0)
    //{
     if (tem2>=0)
     {
      if(matrix[tem2][posibleColumna]!=1)
      {
       bandera=1;
       if((matrix[posibleFila-1][posibleColumna]==0)||(matrix[posibleFila-1][posibleColumna]==3))
        {
         posibleFila=posibleFila-1;
         if((matrix[posibleFila][posibleColumna]==0))
         {
          matrix[posibleFila][posibleColumna]=4;
         }
        }
      }
      else
      {
        posibleFila=tem2;
      }
     }
    //}
    
    // posicion abajo
    //if(bandera==0)
    //{
     if(tem3<=8)
     {
      if(matrix[tem3][posibleColumna]!=1)
      {
       bandera=1;
       if((matrix[posibleFila+1][posibleColumna]==0)||(matrix[posibleFila+1][posibleColumna]==3))
         {
          posibleFila=posibleFila+1;
          if((matrix[posibleFila][posibleColumna]==0))
          {
           matrix[posibleFila][posibleColumna]=4;
          }
         }
      }else
      {
       posibleFila=tem3;
      }
     //}
     
     
    }
    bw.write(bandera+"\n");
   bw.flush();
   }while(matrix[posibleFila][posibleColumna]==1);
   
   
   bw.write(bandera+"\n");
   bw.flush();
   
   for (int i = 0; i < Fila; i++) 
   {
      for (int j = 0; j < Columna; j++) {
         bw.write(matrix[i][j]+" ");
               
      }
      bw.write("\n");
   }
   bw.flush();
 // }while(matrix[posibleFila][posibleColumna]==3)
 }
 
 public static void main (String []args) throws IOException
 {
   crear_laberinto();
   
   for(int i =0; i<10;i++){
    recorrido();
   }
   
 }
 
}
