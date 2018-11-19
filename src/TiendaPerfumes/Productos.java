/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaPerfumes;

import LinearDataStructures.List;
import LinearDataStructures.Queue;
import LinearDataStructures.Stack;
import Trees.BinaryTree;
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
    public static List Carrito = new List();
    public static BinaryTree Node_tree=new BinaryTree();
    public static List HistorialCompras = new List();
	
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
    public static String h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h12,h13,h14,h15;
    public static int op=0, precio=0, posicion=0, delete=0, recibo=0, credito=0, tipoTarjeta=0;
    public static String nombre=null, codigo=null, tipoTarjet=null,marca=null, dirijidoA= null, 
                        correo=null, numTarjeta=null, codSeguridad=null,
                        direccion=null, cadPostal=null, numCedula=null;
        
    // this is the store's initial menu
    public static String menu()
    {
        String menu = "\nMenu \n 1. imprimir lista de productos \n 2. agregar un nuevo producto a la lista \n "
                        + "3. eliminar un producto en especifico por su nodo\n 4. Buscar un producto por su codigo "
                        + "\n 5. Añadir al carrito \n 6. Confirmar compra de los productos en el carro\n "
                        + "7. ver historial de compras \n 8. ordenar los productos por precio de menor a mayor \n"
                        + "9. salir de la tienda \n";
        return menu;
    }
    public static void historial()
    {
        try
        {
            bw.write("su historial es: \n");
            bw.flush();
            HistorialCompras=Perfumeria;
            if (h7!=null)
            {
            HistorialCompras.linealSearch(new Perfumeria(null,h7,null,null,0));
            }
            if (h6!=null)
            {
            HistorialCompras.linealSearch(new Perfumeria(null,h6,null,null,0));
            }
            if (h5!=null)
            {
            HistorialCompras.linealSearch(new Perfumeria(null,h5,null,null,0));
            }
            if (h4!=null)
            {
            HistorialCompras.linealSearch(new Perfumeria(null,h4,null,null,0));
            }
            if (h3!=null)
            {
            HistorialCompras.linealSearch(new Perfumeria(null,h3,null,null,0));
            }
            if (h2!=null)
            {
            HistorialCompras.linealSearch(new Perfumeria(null,h2,null,null,0));
            }
            if (h1!=null)
            {
            HistorialCompras.linealSearch(new Perfumeria(null,h1,null,null,0));
            }
            
            //Hist|orialCompras.printList();
        }catch(Exception ex) {}
    }
    public static void agregar_compra()
    {
        try
        {
    
            bw.write("Por favor digite los siguientes datos para continuar \n"
                    + "codigo del producto que quiere comprar...");
            bw.flush();
            codigo=br.readLine();
            Perfumeria.linealSearch(new Perfumeria(null,codigo,null,null,0));
            
            if(h2==null)
            {
             h2=codigo;   
            }
            else
            {
                if(h3==null)
                {
                    h3=codigo;   
                }
                else
                {
                    if(h4==null)
                    {
                        h4=codigo;   
                    }
                    else
                    {
                        if(h5==null)
                        {
                            h5=codigo;   
                        }
                        else
                        {
                          if(h6==null)
                            {
                                h6=codigo;   
                            }
                            else
                            {
                                if(h7==null)
                                {
                                    h7=codigo;   
                                }
                            }
                        }
                    }
                }
            }
            Carrito.insertAtEnd(new Carrito(codigo));
            Confirm_Purchase();
        }catch(Exception ex) {}
    }
    //This is the menu to confirm the online purchase
    public static void InprimirRecibo()
    {
        try
        {
            FileWriter fw_recibo = new FileWriter("Recibo.umd");
            BufferedWriter bw_txt = new BufferedWriter( fw_recibo );
			
           
            bw_txt.write("\n\n...RECIBO DE PAGO...\n informacion del recibo\n"+"\n"+nombre+"\n"+correo+"\n"+numCedula);
            bw_txt.flush();
            //Perfumeria.linealSearch(new Perfumeria(null,codigo,null,null,0));
            Carrito.printList();
            bw_txt.write("\n\n Este recibo tiene una vigencia de dos dias.\n Para pagos acercarse "
                    + "a los siguentes puntos de pago:\n BANCO CAJA SOCIAL\n "
                    + "EFECTY\n DAVIVIENDA\n\n");
            bw_txt.flush();
        }catch(Exception ex) {}
    }
    public static void Confirm_Purchase()
    {
        try
        {
            for(int i =0;i<1;i++)
            {
                bw.write("Por favor escoja una opcion \n1. confirmar su compra"
                        + "\n2. añadir mas productos a su compra \n3. cancelar su compra\n");
                bw.flush();
                op = Integer.parseInt(br.readLine());
                switch(op)
                {
                    case 1: i+=1; 
                            if(recibo==1)
                            {
                                recibo=0;
                                InprimirRecibo();
                            }
                            else
                            {
                                bw.write("gracias por su compra.\n el producto que "
                                         + "usted compro llegara a su destino en un lapso de "
                                         + "5 dias.\n");
                                bw.flush();          
                            }
                    break;
                    case 2: i=-1;
                            agregar_compra();
                    break;
                    case 3: i+=1;
                            bw.write("Su compra ha sido cancelada.\n");
                            bw.flush();
                    break;
                    default: bw.write("Opcion incorrecta\n");
                             bw.flush();
                    break;
                }
            }
        }catch(Exception ex) {}
    }
    
    //
    public static void add_a_cart()
    {
            agregar_compra();
    }
    
    //in this menu the payment method is chosen
    public static void Buy_Product()
    {
        try
        {
            do
            {
                bw.write("\nPor favor escoja la forma de pago:\n 1. Con tarjeta de credito\n"
                        + " 2. Descargar recibo y pagar en los puntos asignados\n "
                        + "3. cancelar compra \n");
                bw.flush();
                op = Integer.parseInt(br.readLine());
                switch(op)
                {
                    case 1: credit_card();//buy with credit card
                            op=3;
                    break;
                    case 2: Download_Receipt();//download receipt to buy
                            op=3;
                    break;
                    case 3: bw.write("Compra cancelada\n");
                            bw.flush();
                    break;
                    default: bw.write("Opcion incorrecta\n");
                             bw.flush();
                    break;
                }
            }while(op!=3);
        }catch(Exception ex) {}
    }
    // // here the necessary data is requested to generate the receipt
    public static void Download_Receipt() 
    {
        try
        {
            bw.write("Por favor digite los siguientes datos para continuar con el pago\n");
            bw.flush();
            //codigo=br.readLine();
            //Perfumeria.linealSearch(new Perfumeria(null,codigo,null,null,0));
            //int result = Perfumeria.indexOf(new Perfumeria(codigo));
            //h1=codigo;
            //if (result!=-1)
            //{   
                bw.flush();
                bw.write("Nombre completo\n");
                bw.flush();
                nombre=br.readLine();
                bw.write("Correo Electronico\n");
                bw.flush();
                correo=br.readLine();
                bw.write("numero de cedula\n");
                bw.flush();
                numCedula=br.readLine();
                bw.write("A continuacion se generara su recibo de pago.\n"
                        + "Cuando usted pague el monto definido le llegara una notificacion "
                        + "a su correo.\n!GRACIAS POR SU COMPRA¡\n");
                bw.flush();
                recibo =1;
                Confirm_Purchase();
            //}   
        }catch(Exception ex) {}
    }
    // here the necessary data for the purchase with credit card are requested
    public static void credit_card()
    { 
        try
        {
            bw.write("Por favor digite los siguientes datos para continuar con la compra\n");
            bw.flush();
            //codigo=br.readLine();
            //Perfumeria.linealSearch(new Perfumeria(nombre,codigo,marca,dirijidoA,precio));
            //int result = Perfumeria.indexOf(new Perfumeria(codigo));
            //Perfumeria.cloneList();
            //h1=codigo;
            //if (result!=-1)
            //{   
                bw.write("Nombre completo\n");
                bw.flush();
                nombre=br.readLine();
                bw.write("Correo Electronico\n");
                bw.flush();
                correo=br.readLine();
                bw.write("Tipo de tarjeta\n");
                bw.flush();
                
                    bw.write("1. VISA\n2. MasterCard\n3. American Express\n");
                    bw.flush();
                    tipoTarjeta= Integer.parseInt(br.readLine());
                    switch(tipoTarjeta)
                    {
                        case 1: tipoTarjet="VISA";
                        break;
                        case 2: tipoTarjet="MasterCard";
                        break;
                        case 3: tipoTarjet="American Express";
                        break;
                        default: bw.write("Opcion incorrecta\n");
                                 bw.flush();

                        break;
                    }
                
                bw.write("Numero de la tarjeta\n");
                bw.flush();
                numTarjeta=br.readLine();
                bw.write("Codigo de seguridad\n");
                bw.flush();
                codSeguridad=br.readLine();
                bw.write("Direccion\n");
                bw.flush();
                direccion=br.readLine();
                bw.write("Codigo postal\n");
                bw.flush();
                cadPostal=br.readLine();
                credito=1;
                
                Confirm_Purchase();
            //}   
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
            bw.write("Digite el numero del nodo que quiere eliminar...\n");
            bw.flush();
            delete= Integer.parseInt(br.readLine());
            Perfumeria.deleteAtIndex(delete);
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
            Node_tree.insert(new Node_tree(nombre,codigo,marca,dirijidoA,precio));
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
        Node_tree.insert(new Node_tree("1millon","896","paco rabanne","hombres",65000));
        Node_tree.insert(new Node_tree("2.212","245","Carolina Herrera","hombres",21000));
        Node_tree.insert(new Node_tree("Giorgio Armani","554","Acqua Di Gio","hombre",19000));
        Node_tree.insert(new Node_tree("Issey Miyake","978","L’eau D’issey Pour Homme","Hombres",20000));
        Node_tree.insert(new Node_tree("Invictus","715","Paco Rabanne","hombres",50000));
        Node_tree.insert(new Node_tree("Bvlgari","965","Homme Soir","hombres",50000));
        Node_tree.insert(new Node_tree("Versace","854","Bright Crystal","mujeres",80000));
        Node_tree.insert(new Node_tree("Pleasures","112","Estée Lauder","mujeres",27000));
        Node_tree.insert(new Node_tree("L’eau De Issey","965","Issey Miyake","mujeres",45000));
        Node_tree.insert(new Node_tree("Juicy Couture","237","Viva La Juicy","mujeres",100000));
        Node_tree.insert(new Node_tree("La Vie Est Belle","716","LANCOME","mujeres",200000));
        Node_tree.insert(new Node_tree("Michael Kors","884","Michael Kors","mujeres",150000));
          
        
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
                case 5: add_a_cart();
                break;
                case 6: Buy_Product();
                break;
                case 7: historial();
                break;
                case 8: Node_tree.inorder(Node_tree.root);
                break;
                case 9: bw.write("\n...Gracias por su visita a la tienda... \n");
                        bw.flush();
                break;
                default: bw.write("opcion incorrecta\n");
                         bw.flush();

                break;
            }
        }while(op!=9);
    }
    
}
