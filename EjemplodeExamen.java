
package ejemplodeexamen;
import java.util.Scanner;

public class EjemplodeExamen {

    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double precio;
        
        
        System.out.println("1. soltero: chico: 250, mediano: 266.5, grande: 275");
        System.out.println("2. pareja: chico: 300, mediano: 314.5, grande: 330");
        System.out.println("3. estudiante: chico: 200, mediano: 236.5, grande: 250");
        System.out.println("elige el combo");
        int nombrecombo = num.nextInt();
        num.nextLine();
        
        
        switch (nombrecombo) {
            case 1:
                System.out.println("tamano del combo (ch, m, g)");
                String tamano = num.nextLine();
                if (tamano.equals("ch")) {
                    precio = 250;
                    
                    
                }else if(tamano.equals("m")) {
                    precio = 266.5;
                }else {
                    precio= 275;
                }
                System.out.println("Desea palomitas mas grandes por un cargo extra de $15");
                String aumenta = num.nextLine();
                if (aumenta.equals("si")) {
                    precio+=15;
                    
                }
                System.out.println("Combo comprado :" + nombrecombo);
                System.out.println("Aumento tamano: " + aumenta);
                System.out.println("Total cuenta: " + precio);
                break;
                
            default:
                System.out.println("Opcion invalida");
        }
    }
    
}
