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
* @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class How_To_Train_Your_Dragon {
    
    public static List sleeping_dragons =new List();
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    public static void main (String []args) throws IOException
    {
        String input = br.readLine();
        int dia1=4,dia2=0,dia3=0,dia4=0,dias=0,ndia=0; 
        int multa=1,totalMulta=1,multa2=0,multa3=0,multa4=0;
        int cont=0,div1=0,div2=0,div3=0;
        sleeping_dragons.insertAtBegin(new sleeping_dragons(dia1,multa));
        //while(input==" ")
        //{
            for(int i=0;i<=10;i++)
            {
                if (cont==0)
                {
                    for(int j=0;j<dia1;j++)
                    {
                        bw.write("...Por favor digite los dias que el dragon tarda en ser entrenado...\n");
                        bw.flush();
                        dias = Integer.parseInt(br.readLine());
                        bw.write("...Por favor digite el total de la multa que se cobra por que el tragon este durmiendo...\n");
                        bw.flush();
                        multa = Integer.parseInt(br.readLine());
                        sleeping_dragons.insertAtEnd(new sleeping_dragons(dias,multa));
                        totalMulta=totalMulta+multa;
                        if(div1==0)
                        {
                            div1=dias/multa;
                            dia2=dias;
                            multa2=multa;
                        }else
                        {    
                            if(div2==0)
                            {
                                div2=dias/multa;
                                dia3=dias;
                                multa3=multa;
                            }else
                            {
                                if(div1==0)
                                {
                                    div3=dias/multa;
                                    dia4=dias;
                                    multa4=multa;
                                }
                            }
                        }
                        cont=1;
                    }
                }
                if((dia2!=0)&&(dia3!=0)&&(dia4!=0))
                {
                    if((div1<div2)&&(div1<div3))
                    {
                        dias=dia2;
                    }
                    if((div2<div1)&&(div2<div3))
                    {
                        dias=dia3;
                    }
                    if((div3<div1)&&(div3<div2))
                    {
                        dias=dia4;
                    }
                }
                else
                {
                    if (dia2==0)
                    {
                        multa2=0;
                        if(dia3<dia4)
                        {
                         dias=dia3;   
                        }
                        if(dia4<dia3)
                        {
                         dias=dia4;   
                        }
                    }
                    if (dia3==0)
                    {
                        multa3=0;
                        if(dia2<dia4)
                        {
                         dias=dia2;   
                        }
                        if(dia4<dia2)
                        {
                         dias=dia4;   
                        }
                    }
                    if (dia4==0)
                    {
                        multa4=0;
                        if(dia3<dia2)
                        {
                         dias=dia3;   
                        }
                        if(dia2<dia3)
                        {
                         dias=dia2;   
                        }
                    }
                }
                for(int j=0;j<=dias;j++)
                {
                    ndia=dias;
                    ndia=ndia-1;
                    if(dias==dia2)
                    {
                        totalMulta=totalMulta+multa3+multa4;
                    }
                    if(dias==dia3)
                    {
                        totalMulta=totalMulta+multa2+multa4;
                    }
                    if(dias==dia4)
                    {
                        totalMulta=totalMulta+multa3+multa2;
                    }
                    
                }
                dias=0;
            }
            bw.write("el total de la multa es:\n"+totalMulta);
            bw.flush();
        }   
    //}/
              
}

