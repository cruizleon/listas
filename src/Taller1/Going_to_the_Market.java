/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import LinearDataStructures.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author TATIANA
 */
public class Going_to_the_Market {
    public static List Fruits =new List();
    public static List Vegetables= new List();
    public static int op=0,cantidad=0,precio=0,Precio=0;
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
    
    public static void CompraFrutas()
    {
        try
       {
           Fruits.printList();
            bw.write("...Por favor digite la cantidad de cada producto que desea...\n");
            bw.flush();
            
                
            bw.write("\nManzana...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=1000;
            }
            bw.write("\nGuanabana...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=3500;
            }
            bw.write("\nCereza...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=500;
            }
            bw.write("\nSandia...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=5400;
            }
            bw.write("\nDurazno...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=2100;
            }
            CompraVegetales();
        }catch(Exception ex) {}
    }
    public static void CompraVegetales()
    {
        try
       {
            Vegetables.printList();
            bw.write("...Por favor digite la cantidad de cada producto que desea...\n");
            bw.flush();
            
                
            bw.write("\nArverja...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=1500;
            }
            bw.write("\nZuchini...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=2500;
            }
            bw.write("\nColiflor...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=3200;
            }
            bw.write("\nCalabaza...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=4000;
            }
            bw.write("\nBrocoli...\n");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=1100;
            }
            
        }catch(Exception ex) {}
    }
    public static void main(String[]args)
    {
        Fruits.insertAtBegin(new Fruits("Durazno",2.100));
        Fruits.insertAtBegin(new Fruits("Sandia",5.400));
        Fruits.insertAtBegin(new Fruits("Cereza",500));
        Fruits.insertAtBegin(new Fruits("Guanabana",3.500));
        Fruits.insertAtBegin(new Fruits("Mazana",1.000));
        Vegetables.insertAtBegin(new Vegetables("Brocoli",1.100));
        Vegetables.insertAtBegin(new Vegetables("Calabaza",4.000));
        Vegetables.insertAtBegin(new Vegetables("Coliflor",3.200));
        Vegetables.insertAtBegin(new Vegetables("Zuchini",2.500));
        Vegetables.insertAtBegin(new Vegetables("Arverja",1.500));
         
        CompraFrutas();
        try
        {
            bw.write("\n R$"+Precio);
            bw.flush();
            bw.write("\n R$"+precio);
            bw.flush();
        }catch(Exception ex) {}
    }
    
}
