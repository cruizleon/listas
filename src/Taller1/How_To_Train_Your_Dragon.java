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
        
        sleeping_dragons.insertAtBegin(new sleeping_dragons(4,1));
        String input = br.readLine();
        int dias=4, multa=1,totalMulta=1,cont=0,div1=0,div2=0,div3=0;
        while(input==" ")
        {
            for(int i=0;i<=4;i++)
            {
                if (cont==0)
                {
                    for(int j=0;j<dias;j++)
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
                        }else
                        {    
                            if(div2==0)
                            {
                                div2=dias/multa;
                            }else
                            {
                                if(div1==0)
                                {
                                    div3=dias/multa;
                                }
                            }
                        }
                        cont=1;
                    }
                }
                for(int j=0;j<=dias;j++)
                {
                    
                }
                
        
            }
        }   
    }
              
}

