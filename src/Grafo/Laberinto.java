/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import LinearDataStructures.ExampleNode;
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
public class Laberinto {
 
 public static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
 public static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
 public static List n= new List();
 public static int Fila=9,Columna=9;
 public static int [][] matrix = new int[Fila][Columna];
 public static int bandera=0,tem=0, tem1=0, tem2=0, tem3=0, posibleFila=0, posibleColumna=0;
         
 
 public static void imprimir() throws IOException
 {
  for (int i = 0; i < Fila; i++) 
   {
      for (int j = 0; j < Columna; j++) {
         bw.write(matrix[i][j]+" ");
               
      }
      bw.write("\n");
   }
   bw.flush();
   
   bw.write("\n");
   bw.flush();
 
   
   
 }
         
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
   
   imprimir();
 }
 
 public static void recorrido() throws IOException
 {
  int Fila=0,Columna=0 ;
   for (int i =0;i<Fila;i++)
   {
     for (int j=0;j<Columna;j++)
     {
      if (matrix[i][j]==2)
      {
       Fila=i;
       Columna=j;
      }
     }
   }
  
        String direccion = "derecha";
        Fila=6;
        Columna=2;
        //n.insertAtEnd(new ExampleNode(matrix[1][3])); 
        while (matrix[Fila][Columna] !=3 && bandera!=1) {
            imprimir();
            switch (direccion) {
                case "derecha"://DERECHA
                    if (Fila - 1>=0 && matrix[Fila - 1][Columna]!=1 && (matrix[Fila - 1][Columna]==0||matrix[Fila - 1][Columna]==4)) 
                    {
                        matrix[Fila - 1][Columna] = 4;
                        //matrix[Fila][Columna] = 0;
                        Fila--;
                        direccion = "arriba";
                    } 
                    else 
                    {
                     if(Fila - 1>=0 &&matrix[Fila - 1][Columna] ==3)
                     {
                      Fila = Fila - 1;
                      bandera=1;
                      break;
                     }
                        if (Columna + 1<=8 && matrix[Fila][Columna + 1]!=1&& (matrix[Fila][Columna + 1]==0||matrix[Fila][Columna + 1]==4)) 
                        {
                            matrix[Fila][Columna + 1] = 4;
                            //matrix[Fila][Columna] = 0;
                            Columna++;
                        } else {
                            if (Fila + 1<=8 && matrix[Fila + 1][Columna]!=1&& (matrix[Fila + 1][Columna]==0||matrix[Fila + 1][Columna]==4)) {
                                matrix[Fila + 1][Columna] = 4;
                               // matrix[Fila][Columna] = 0;
                                Fila++;
                                direccion = "abajo";
                            } else {
                                matrix[Fila][Columna - 1] = 4;
                                //matrix[Fila][Columna] = 0;
                                Columna--;
                                direccion = "izquierda";
                            }
                        }
                    }
                    break;
                case "arriba"://ARRIBA
                    if (Columna - 1>=0 && matrix[Fila][Columna - 1]!=1&& (matrix[Fila][Columna - 1]==0||matrix[Fila][Columna - 1]==4)) 
                    {
                        matrix[Fila][Columna - 1] = 4;
                        //matrix[Fila][Columna] = 0;
                        Columna--;
                        direccion = "izquierda";
                    } 
                    else 
                    {
                     if (Columna - 1>=0 &&matrix[Fila][Columna - 1] ==3)
                     {
                      Columna =Columna - 1;
                      bandera=1;
                      break;
                     }
                        if (Fila - 1>=0 && matrix[Fila - 1][Columna]!=1 && (matrix[Fila - 1][Columna]==0||matrix[Fila - 1][Columna]==4)) 
                        {
                            matrix[Fila - 1][Columna] = 4;
                           // matrix[Fila][Columna] = 0;
                            Fila--;
                        } else {
                            if (Columna + 1<=8 && matrix[Fila][Columna + 1]!=1 && (matrix[Fila][Columna + 1]==0||matrix[Fila][Columna + 1]==4)) 
                            {
                                matrix[Fila][Columna + 1] = 4;
                                //matrix[Fila][Columna] = 0;
                                Columna++;
                                direccion = "derecha";
                            } else {
                                matrix[Fila + 1][Columna] = 4;
                                //matrix[Fila][Columna] = 0;
                                Fila++;
                                direccion = "abajo";
                            }
                        }
                    }
                    break;
                case "izquierda":
                    if (Fila + 1<=8 && matrix[Fila + 1][Columna]!=1 && (matrix[Fila + 1][Columna]==0||matrix[Fila + 1][Columna]==4)) {
                        matrix[Fila + 1][Columna] = 4;
                       // matrix[Fila][Columna] = 0;
                        Fila++;
                        direccion = "abajo";
                    } 
                    else 
                    {
                     if (Fila + 1<=8 &&matrix[Fila + 1][Columna] ==3)
                     {
                      bandera=1;
                       Fila =Fila + 1;
                     }
                        if (Columna - 1>=0 && matrix[Fila][Columna - 1]!=1 &&(matrix[Fila][Columna - 1]==0||matrix[Fila][Columna - 1]==4)) {
                            matrix[Fila][Columna - 1] = 4;
                            //matrix[Fila][Columna] = 0;
                            Columna--;
                        } else {
                            if (Fila - 1>=0 && matrix[Fila - 1][Columna]!=1&& (matrix[Fila - 1][Columna]==0||matrix[Fila - 1][Columna]==4)) {
                                matrix[Fila - 1][Columna] = 4;
                                //matrix[Fila][Columna] = 0;
                                Fila--;
                                direccion = "arriba";
                            } else {
                                matrix[Fila][Columna + 1] = 4;
                                //matrix[Fila][Columna] = 0;
                                Columna++;
                                direccion = "derecha";
                            }
                        }
                    }
                    break;

                case "abajo"://ARRIBA
                    if (Columna + 1<=8 && matrix[Fila][Columna + 1]!=1 && (matrix[Fila][Columna + 1]==0||matrix[Fila][Columna + 1]==4)) {
                        matrix[Fila][Columna + 1] = 4;
                        //matrix[Fila][Columna] = 0;
                        Columna++;
                        direccion = "derecha";
                    } 
                    else 
                    {
                     if(Columna + 1<=8 &&matrix[Fila][Columna + 1] ==3)
                     {
                      bandera=1;
                       Columna= Columna + 1;
                       break;
                     }
                        if (Fila + 1<=8 && matrix[Fila + 1][Columna]!=1 && (matrix[Fila + 1][Columna]==0||matrix[Fila + 1][Columna]==4)) {
                            matrix[Fila + 1][Columna] = 4;
                            //matrix[Fila][Columna] = 0;
                            Fila++;
                        } else {
                            if (Columna - 1>=0 && matrix[Fila][Columna - 1]!=1 && (matrix[Fila][Columna - 1]==0||matrix[Fila][Columna - 1]==4)) {
                                matrix[Fila][Columna - 1] = 4;
                                //matrix[Fila][Columna] = 0;
                                Columna--;
                                direccion = "izquierda";
                            } else {
                                matrix[Fila - 1][Columna] = 4;
                                //matrix[Fila][Columna] = 0;
                                Fila--;
                                direccion = "arriba";
                            }
                        }
                    }
                    break;
                default:
            }
        }
  //........................................................................................
  
 }


 public static void main (String []args) throws IOException 
 {
   crear_laberinto();

    recorrido();
   
   
 }
 
}
