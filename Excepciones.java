
package excepciones;
import java.util.Scanner;
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Stack;

public class Excepciones
{

    
    public static void main(String[] args)
    {
    //Archivo prueba = new Archivo();
//prueba.leer();  
        Stack pila = new Stack();
        Object p;
        System.out.println(pila);
        //insertar datos
        pila.push("Hola");
        System.out.println(pila); 
        pila.push(15);
        
           try{
            //sacar de la pila 
            p = pila.pop();
               System.out.println(pila+"==>"+p);
               p = pila.pop();
                System.out.println(pila+"==>"+p);
                p = pila.pop();
        }
catch(EmptyStackException e){
    System.err.println("Error pila vacia");
}
           // ERROR EN MENU DE OPCIONES
           try{
               int opc;
               Scanner leer = new Scanner(System.in);
               do{
                   System.out.println("1. Pedir datos");
                   System.out.println("2. Salir");
                   System.out.println("¿Que deseas hacer?"); 
                   opc=leer.nextInt();
                   switch(opc){
                       case 1: 
                           pedirDatos();
                           break;
                       case 2:
                           System.out.println("Esta saliendo de la aplicacion");
                           break;
                   }
               } while(opc != 2);
           }
           catch(InputMismatchException e){
               System.err.println("Error: debes de teclear un numero");
               
           }
     
    }
    
    
    public static void pedirDatos() throws InputMismatchException{
        // throw lo que hace es lanzar alguna excepcion de tipo InputMismatchException o IOException
        int edad = 0;
        String nom, n;
        Scanner leer;
        boolean esEntero;
        try{
        leer = new Scanner(System.in);
            System.out.println("Ingrese nombre: ");
        
        nom = leer.nextLine();
        do{
            System.out.println("Dame tu edad: ");
            n = leer.nextLine();
            esEntero = validaNum(n);
            if(esEntero == true)
                edad = Integer.parseInt(n);
        }while(esEntero != true);{
        System.out.println("Hola "+nom+ " tienes: "+edad+" años");
        }
        }
        catch(Exception e){
            System.err.println("Error, debes teclear un numero");
        }
    }
    
    public static boolean validaNum(String cad) {
        try{
           Integer.parseInt(cad);
           return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
