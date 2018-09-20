/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListEstudiantes;
import java.util.*;
import LinearDataStructures.List;
import LinearDataStructures.Node;

/**
 *
 * @author TATIANA
 */
public class Main {
    
    public static void main (String[] args){
        List Estudiantes = new List();
        
        Estudiantes.insertAtBegin(new Estudiantes("\n Maria","4654",12,"cruizh","1465"));
        Estudiantes.insertAtBegin(new Estudiantes("\n luis","8586",45,"ewrwe","46665"));
        Estudiantes.insertAtBegin(new Estudiantes("\n pepita","484",31,"wqrewqrf","8465"));
        Estudiantes.insertAtBegin(new Estudiantes("\n andres","864654",41,"dsfasdf","65465"));
        Estudiantes.insertAtBegin(new Estudiantes("\n pepito","75885",32,"sdfsdf","44648\n"));
        
        
        int op,edad,delete;
        String nombre,id,correo,telefono;
        Scanner leer =new Scanner (System.in); 
        do
        {
            System.out.print("\n Escoja la accion que desea realizar con la lista de estudiantes \n");
            System.out.println("Menu \n 1. inprimir lista \n 2. insertAtBegin \n 3. insertAtEnd \n"
                    + " 4. insertAtIndex \n 5. deleteAtBegin \n 6. deleteAtEnd\n 7. deleteAtIndex \n"
                    + " 8. updateFirst \n 9. updateAll \n 10. linealSearch \n 11. searchAll \n "
                    + "12. binarySearch \n 13. salir \n\n Digite una opcion...");
            op=leer.nextInt();
            switch(op)
            {
                case 1: Estudiantes.printList();
                break;
                case 2: System.out.print("Digite los datos del estudiante por agregar:\n"
                        + "Nombre...");
                        nombre=leer.next();
                        System.out.print("\n ID...");
                        id=leer.next();
                        System.out.print("\n edad...");
                        edad=leer.nextInt();
                        System.out.print("\n correo...");
                        correo=leer.next();
                        System.out.print("\n telefono...");
                        telefono=leer.next();
                        Estudiantes.insertAtBegin(new Estudiantes(nombre,id,edad,correo,telefono));
                        Estudiantes.printList();
                break;
                case 3: System.out.print("Digite los datos del estudiante por agregar:\n"
                        + "Nombre...");
                        nombre=leer.next();
                        System.out.print("\n ID...");
                        id=leer.next();
                        System.out.print("\n edad...");
                        edad=leer.nextInt();
                        System.out.print("\n correo...");
                        correo=leer.next();
                        System.out.print("\n telefono...");
                        telefono=leer.next();
                        Estudiantes.insertAtBegin(new Estudiantes(nombre,id,edad,correo,telefono));
                        Estudiantes.printList();
                break;
                case 4: System.out.print("Digite los datos del estudiante por agregar:\n"
                        + "Nombre...");
                        nombre=leer.next();
                        System.out.print("\n ID...");
                        id=leer.next();
                        System.out.print("\n edad...");
                        edad=leer.nextInt();
                        System.out.print("\n correo...");
                        correo=leer.next();
                        System.out.print("\n telefono...");
                        telefono=leer.next();
                        Estudiantes.insertAtBegin(new Estudiantes(nombre,id,edad,correo,telefono));
                        Estudiantes.printList();
                break;
                case 5: Estudiantes.deleteAtBegin();
                        Estudiantes.printList();
                break;
                case 6: Estudiantes.deleteAtEnd();
                        Estudiantes.printList();
                break;
                case 7: System.out.print("digite el numero nodo que quiere eliminar...\n");
                        delete=leer.nextInt();
                        Estudiantes.deleteAtIndex(delete);
                        Estudiantes.printList();
                break;
                case 8: Estudiantes.updateFirst(Node.next, Node.next);
                        Estudiantes.printList();
                break;
                case 9: Estudiantes.updateAll(Node.next, Node.next);
                        Estudiantes.printList();
                break;
                case 10: Estudiantes.linealSearch(Node.next);
                         Estudiantes.printList();
                break;
                case 11: Estudiantes.searchAll(Node.next);
                         Estudiantes.printList();
                break;
                case 12: Estudiantes.binarySearch(Node.next);
                         Estudiantes.printList();
                break;
                default: System.out.print("opcion incorrecta\n");

                break;
            }
        }while(op!=13);
        
    }
    
}
