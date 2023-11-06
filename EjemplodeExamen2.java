
package ejemplodeexamen2;
import java.util.Scanner;

public class EjemplodeExamen2 {

   
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double precio;
        
        
        System.out.println("1. cappuccino: chico: $25.30, mediano: $30.0, grande: $37.5");
        System.out.println("2. latte: chico: $32.5, mediano: $38.4, grande: $42.5");
        System.out.println("3. matcha: chico: $41.5, mediano: %48.9, grande: $52.5");
        System.out.println("elige tu cafe");
        int nombrecombo = num.nextInt();
        num.nextLine();
        
        
        switch (nombrecombo) {
            case 1:
                System.out.println("tamano del combo (ch, m, g)");
                String tamano = num.nextLine();
                if (tamano.equals("ch")) {
                    precio = 25.30;
                    
                    
                }else if(tamano.equals("m")) {
                    precio = 30.0;
                }else {
                    precio= 37.5;
                }
                System.out.println("Desea que su leche sea deslactosada? En caso afirmativo, se le cobraran $12 extra");
                String aumenta = num.nextLine();
                if (aumenta.equals("si")) {
                    precio+=12;
                    
                }
                System.out.println("Cafe comprado :" + nombrecombo);
                System.out.println("Aumento tamano: " + aumenta);
                System.out.println("Total cuenta: " + precio);
                break;
                
            default:
                System.out.println("Opcion invalida");
        }
         switch (nombrecombo) {
            case 2:
                System.out.println("tamano del combo (ch, m, g)");
                String tamano = num.nextLine();
                if (tamano.equals("ch")) {
                    precio = 32.5;
                    
                    
                }else if(tamano.equals("m")) {
                    precio = 38.4;
                }else {
                    precio= 42.5;
                }
                System.out.println("Desea que su leche sea deslactosada? En caso afirmativo, se le cobraran $12 extra");
                String aumenta = num.nextLine();
                if (aumenta.equals("si")) {
                    precio+=12;
                    
                }
                System.out.println("Cafe comprado :" + nombrecombo);
                System.out.println("Aumento tamano: " + aumenta);
                System.out.println("Total cuenta: " + precio);
                break;
                
            default:
                System.out.println("Opcion invalida");
        }
          switch (nombrecombo) {
            case 3:
                System.out.println("tamano del combo (ch, m, g)");
                String tamano = num.nextLine();
                if (tamano.equals("ch")) {
                    precio = 41.5;
                    
                    
                }else if(tamano.equals("m")) {
                    precio = 48.9;
                }else {
                    precio= 52.5;
                }
                System.out.println("Desea que su leche sea deslactosada? En caso afirmativo, se le cobraran $12 extra");
                String aumenta = num.nextLine();
                if (aumenta.equals("si")) {
                    precio+=12;
                    
                }
                System.out.println("Cafe comprado :" + nombrecombo);
                System.out.println("Aumento tamano: " + aumenta);
                System.out.println("Total cuenta: " + precio);
                break;
                
            default:
                System.out.println("Opcion invalida");
        }
    }
    
}
        
 
