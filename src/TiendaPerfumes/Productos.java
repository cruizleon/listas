/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaPerfumes;

import LinearDataStructures.List;
import LinearDataStructures.Queue;
import LinearDataStructures.Stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



/**
 *
 * @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class Productos { 
    public static List Perfumeria= new List();
    public static Queue requests = new Queue();
    public static Stack reports = new Stack();
	
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
    public static int op=0, precio=0, posicion=0, delete=0;
    public static String nombre=null, codigo=null, marca=null, dirijidoA= null, 
                        correo=null, tipoTarjeta=null, numTarjeta=null, codSeguridad=null,
                        direccion=null, cadPostal=null, numCedula=null;
        
    // this is the store's initial menu
    public static String menu()
    {
        String menu = "\nMenu \n 1. imprimir lista de productos \n 2. agregar un nuevo producto a la lista \n "
                        + "3. eliminar un producto en espesifico\n 4. Buscar un producto por su codigo "
                        + "\n 5. comprar un producto \n 6. salir de la tienda \n";
        return menu;
    }
    
    //This is the menu to confirm the online purchase
    public static void Confirm_Purchase()
    {
        try
        {
            do
            {
                bw.write("Porfavor escoja una opcion \n 1. confirmar su compra"
                        + "\n2. canselar su compra");
                bw.flush();
                op = Integer.parseInt(br.readLine());
                switch(op)
                {
                    case 1: bw.write("gracias por su compra.\n el producto que"
                                    + "usted compro llegara a su destino en un lapso de "
                                    + "5 dias.");
                            bw.flush();
                    break;
                    case 2: bw.write("su compra ha sido canselada.");
                            bw.flush();
                    break;
                    default: bw.write("opcion incorrecta\n");
                             bw.flush();
                    break;
                }
            }while(op!=1||op!=2);
        }catch(Exception ex) {}
    }
    
    //in this menu the payment method is chosen
    public static void Buy_Product()
    {
        try
        {            
            do
            {
                bw.write("Porfavor escoja la forma de pago:\n 1. Con tarjeta de credito\n"
                        + "2. Descargar resivo y pagar en los puntos asignados\n "
                        + "3. canselar compra ");
                bw.flush();
                op = Integer.parseInt(br.readLine());
                switch(op)
                {
                    case 1: credit_card();//buy with credit card

                    break;
                    case 2: Download_Receipt();//download receipt to buy
                    break;
                    case 3: bw.write("compra canselada\n");
                            bw.flush();
                    break;
                    default: bw.write("opcion incorrecta\n");
                             bw.flush();
                    break;
                }
            }while(op!=3);
        }catch(Exception ex) {}
    }
    // // here the necessary data is requested to generate the receipt
    public static void Download_Receipt() throws IOException
    {
        FileWriter fw = new FileWriter("ResiboPerfume.txt");
        BufferedWriter bwf = new BufferedWriter( fw );
        try
        {
            bw.write("porfavor digite los siguientes datos para continiar con el pago\n"
                    + "codigo del producto que quiere comprar...");
            bw.flush();
            codigo=br.readLine();
            Perfumeria.linealSearch(new Perfumeria(null,codigo,null,null,0));
            int result = Perfumeria.indexOf(new Perfumeria(codigo));
            if (result!=-1)
            {   
                bw.flush();
                bw.write("Nombre completo");
                bw.flush();
                nombre=br.readLine();
                bw.write("Correo Electronico");
                bw.flush();
                correo=br.readLine();
                bw.write("numero de cedula");
                bw.flush();
                numCedula=br.readLine();
                bw.write("acontinuacion se generara su recibo de pago.\n"
                        + "cundo usted page el monto definido le llegara una notificacion "
                        + "a su correo.\n gracis por su compra\n");
                bw.flush();
                bw.write("...RECIBO DE PAGO...\n informacion del recibo\n");
                bw.flush();
                Perfumeria.linealSearch(new Perfumeria(null,codigo,null,null,0));
                bw.write("\n Este recibo tiene una vigencia de dos dias.\n Para pagos acerrcarse"
                        + "a los si guentes puntos de pago:\n BANCO CAJA SOCIAL\n"
                        + "EFECTY\n DAVIVIENDA");
                bw.flush();
            }   
        }catch(Exception ex) {}
    }
    // here the necessary data for the purchase with credit card are requested
    public static void credit_card()
    { 
        try
        {
            bw.write("porfavor digite los siguientes datos para continiar con el pago\n"
                    + "codigo del producto que quiere comprar...");
            bw.flush();
            codigo=br.readLine();
            Perfumeria.linealSearch(new Perfumeria(null,codigo,null,null,0));
            int result = Perfumeria.indexOf(new Perfumeria(codigo));
            if (result!=-1)
            {   
                bw.flush();
                bw.write("Nombre completo");
                bw.flush();
                nombre=br.readLine();
                bw.write("Correo Electronico");
                bw.flush();
                correo=br.readLine();
                bw.write("tipo de tarjeta");
                bw.flush();
                tipoTarjeta=br.readLine();
                bw.write("Numero de la tarjeta");
                bw.flush();
                numTarjeta=br.readLine();
                bw.write("codigo de seguuridad");
                bw.flush();
                codSeguridad=br.readLine();
                bw.write("direccion");
                bw.flush();
                direccion=br.readLine();
                bw.write("codigo postal");
                bw.flush();
                cadPostal=br.readLine();
                Confirm_Purchase();
            }   
        }catch(Exception ex) {}
    }
    
    // here you look for a product by its code
    public static void Look_For_Product()
    {
        try
        {
            bw.write("\n Codigo del producto...");
            bw.flush();
            codigo=br.readLine();
            Perfumeria.linealSearch(new Perfumeria(null,codigo,null,null,0));
        }catch(Exception ex) {}
    }
    
    // here a product is deleted by its code
    public static void remove_product()
    {
        try
        {
            bw.write("digite el codigo del producto que quiere eliminar...\n");
            bw.flush();
            codigo=br.readLine();
            int index = Perfumeria.indexOf(new Perfumeria(codigo));
            Perfumeria.searchAll(new Perfumeria(null,codigo,null,null,0));
            if (index != -1)
            {
                Perfumeria.deleteAtIndex(index);
                bw.write("El producto deseado se a eliminado \n");
            }
            else
            {
               bw.write("No se encuentra el producto\n");
            }
            bw.flush();
            Perfumeria.printList();
        }catch(Exception ex) {}
    }
    
    // here products are added asking for the necessary data
    public static void Add_Product()
    {
        try
        {
            bw.write("\nDigite los datos correspondientes del nuevo producto\n"
                    + "Nombre del producto...");
            bw.flush();
            nombre=br.readLine();
            bw.write("\n Codigo del producto...");
            bw.flush();
            codigo=br.readLine();
            bw.write("\n Marca del producto...");
            bw.flush();
            marca=br.readLine();
            bw.write("\n El nuevo producto es para hombres o mujeres ?...");
            bw.flush();
            dirijidoA=br.readLine();
            bw.write("\n Precio del producto...");
            bw.flush();
            precio=Integer.parseInt(br.readLine());
            Perfumeria.insertAtBegin(new Perfumeria(nombre,codigo,marca,dirijidoA,precio));
        }catch(Exception ex) {}
    }
   
    //in this part the main menu and all the options of the online store are executed

    public static void main(String[]args) throws IOException
    {
        
        Perfumeria.insertAtBegin(new Perfumeria("1millon","896","paco rabanne","hombres",65000));
        Perfumeria.insertAtBegin(new Perfumeria("2.212","245","Carolina Herrera","hombres",21000));
        Perfumeria.insertAtBegin(new Perfumeria("Giorgio Armani","554","Acqua Di Gio","hombre",19000));
        Perfumeria.insertAtEnd(new Perfumeria("Issey Miyake","978","L’eau D’issey Pour Homme","Hombres",20000));
        Perfumeria.insertAtEnd(new Perfumeria("Invictus","715","Paco Rabanne","hombres",50000));
        Perfumeria.insertAtEnd(new Perfumeria("Bvlgari","965","Homme Soir","hombres",50000));
        Perfumeria.insertAtBegin(new Perfumeria("Versace","854","Bright Crystal","mujeres",80000));
        Perfumeria.insertAtBegin(new Perfumeria("Pleasures","112","Estée Lauder","mujeres",27000));
        Perfumeria.insertAtBegin(new Perfumeria("L’eau De Issey","965","Issey Miyake","mujeres",45000));
        Perfumeria.insertAtEnd(new Perfumeria("Juicy Couture","237","Viva La Juicy","mujeres",100000));
        Perfumeria.insertAtEnd(new Perfumeria("La Vie Est Belle","716","LANCOME","mujeres",200000));
        Perfumeria.insertAtEnd(new Perfumeria("Michael Kors","884","Michael Kors","mujeres",150000));
          
        bw.write("...LISTA DE PRODUCTOS...\n");
        bw.flush();
        Perfumeria.printList();
        
        
        do
        {
            bw.write(menu());
            bw.flush();
            op = Integer.parseInt(br.readLine());
            switch(op)
            {
                case 1: Perfumeria.printList();
                break;
                case 2: Add_Product();
                        Perfumeria.printList();
                break;
                case 3: remove_product();
                        Perfumeria.printList();
                break;
                case 4: Look_For_Product();
                break;
                case 5: Buy_Product();
                break;
                case 6: bw.write("\n...gracias por su visita a la tienda... \n");
                        bw.flush();
                break;
                default: bw.write("opcion incorrecta\n");
                         bw.flush();

                break;
            }
        }while(op!=6);
    }
    /////////////////
}
