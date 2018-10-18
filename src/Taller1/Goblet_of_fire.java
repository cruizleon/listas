/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import LinearDataStructures.List;
import LinearDataStructures.Node;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
* @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Goblet_of_fire {
    public static List Students =new List();
    public static List Names_chalice =new List();
    public static List prob =new List();
    public static int op=0, numeroRollo=0, cantidad=10,calis=0;
    public static String nombre=null, numeroEscuela=null;
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

    public static void Nombre_en_el_calis()
    {
        try
        {
            Names_chalice=prob;
            //if(calis==1)
            //{
                //bw.write("\n Los nombres en el calis son...");
                //bw.flush();
                for(int i =0;i<cantidad;i++)
                {
                    Names_chalice.deleteAtEnd();
                }
                Names_chalice.printList();
            //}
        }catch(Exception ex) {}   
    }
    public static void poner_Nombre_calisFuego()
    {
        try
        {
            cantidad=cantidad-1;
            Students.deleteAtBegin();
            calis=1;
        }catch(Exception ex) {}
    }
    public static void agregar_Estudiante()
    {
        try
        {
            bw.write("\nDigite los datos correspondientes del nuevo producto\n"
                    + "Nombre del estudaiante...");
            bw.flush();
            nombre=br.readLine();
            bw.write("\n numero de su escuela...");
            bw.flush();
            numeroEscuela=br.readLine();
            bw.write("\n numero de su rollo...");
            bw.flush();
            numeroRollo=Integer.parseInt(br.readLine());
            cantidad+=1;
            Students.insertAtEnd(new Students(nombre,numeroEscuela,numeroRollo));
            prob=Students;
        }catch(Exception ex) {}
    }
    public static void menu()
    {
        try
        {
            do
            {
                bw.write("...Menu...\n\n1. Agregar un estudiante a la cola"
                        + "\n2. Poner un nombre en el calis de fuego"
                        + "\n3. Mostrar nombres en el calis en orden"
                        + "\n4. salir");
                bw.flush();
                op = Integer.parseInt(br.readLine());
                switch(op)
                {
                    case 1: agregar_Estudiante();
                    break;
                    case 2: poner_Nombre_calisFuego();
                    break;
                    case 3: Nombre_en_el_calis();
                    break;
                    case 4: bw.write("salir\n");
                            bw.flush();
                    break;
                    default: bw.write("opcion incorrecta\n");
                             bw.flush();
                    break;
                }
            }while(op!=4);
        }catch(Exception ex) {}
    }
    public static void main(String []args)
    {
            Students.insertAtBegin(new Students("Harry","1",5));
            Students.insertAtBegin(new Students("Albus","4",41));
            Students.insertAtBegin(new Students("Dobby","2",54));
            Students.insertAtBegin(new Students("Hermione","1",45));
            Students.insertAtBegin(new Students("Sirius","4",455));
            Students.insertAtBegin(new Students("James","2",5));
            Students.insertAtBegin(new Students("Minerva","2",5));
            Students.insertAtBegin(new Students("Neville","4",5));
            Students.insertAtBegin(new Students("Lily","4",5));
            Students.insertAtBegin(new Students("Rita","2",5));
            
            prob=Students;
            Names_chalice=prob;
            menu();
    }
}
