
package preexamenu3;
import java.util.Scanner;

public class PreExamenU3 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double precio;
       int comboelegido;
        do {            
            System.out.println("Bienvenido a dulceria, a continuacion elija el combo de su preferencia");
            System.out.println("1. Individual CH: $60, M: $80, G: $100");
            System.out.println("2. Pareja CH: $90, M: $120, G: $140");
            System.out.println("3. Familiar CH: $120, M: $150, G: $180");
            System.out.println("4. Salir");
            comboelegido = scanner.nextInt();
            scanner.nextLine();
            
            String combo;
            if (comboelegido==1) {
                combo = "Individual";
            } else if (comboelegido==2) {
                combo = "Pareja";
                
            } else
                combo = "Familiar";
        
            switch (comboelegido) {
                case 1:
                    System.out.println("Tamanio del combo: CH, M, G");
                    String tamanio = scanner.nextLine();
                    if (tamanio.equals("CH")) {
                        precio = 60;
                    } else if (tamanio.equals("M")){
                        precio = 80;
                    } else 
                    precio= 100;
                    System.out.println("Por un cobro extra de $12, quisiera un chocolate Snickers?, Si, No");
                    String chocolate = scanner.nextLine();
                    if (chocolate.equals("Si")) {
                        precio+=12;
                    } else if (chocolate.equals("No")) {
                        precio+=0;
                    }
                    System.out.println("Combo comprado: " + comboelegido);
                    System.out.println("Cobro extra: " + chocolate);
                    System.out.println("Total de la cuenta: " + precio);
                    break;
                case 2: 
                    System.out.println("Tamanio del combo: CH, M, G");
                    String tamanio2 = scanner.nextLine();
                    if (tamanio2.equals("CH")) {
                        precio = 90;
                        
                    } else if (tamanio2.equals("M")) {
                        precio = 120;
                    } else 
                        precio = 140;
                    System.out.println("Por un cobro extra de $12, quisiera un chocolate Snickers?, Si, No");
                    String chocolate2= scanner.nextLine();
                    if (chocolate2.equals("Si")) {
                        precio+=12;
                        
                    } else if (chocolate2.equals("No")) {
                        precio+=0;
                    }
                    System.out.println("Combo comprado: " + comboelegido);
                    System.out.println("Cobro extra: " + chocolate2);
                    System.out.println("Total de la cuenta: " + precio);
                    break;
                case 3:
                    System.out.println("Tamanio del combo: CH, M, G");
                    String tamanio3 = scanner.nextLine();
                    if (tamanio3.equals("CH")) {
                        precio = 120;
                        
                    } else if (tamanio3.equals("M")) {
                        precio = 150;
                    } else 
                        precio = 180;
                    System.out.println("Por un cobro extra de $12, desearia un chocolate Snickers?, Si, No, ");
                    String chocolate3 = scanner.nextLine();
                    if (chocolate3.equals("Si")) {
                        precio+=12;
                        
                    } else if (chocolate3.equals("No")) {
                        precio+=0;
                    }
                    System.out.println("Combo comprado: " + comboelegido);
                    System.out.println("Cobro extra: " + chocolate3);
                    System.out.println("Total de la cuenta: " + precio);
                    break;
                case 4:
                    System.out.println("Gracias por su visita, le recomendamos revisar cartelera para futuros encuentros");
                default:
                    System.out.println("Opcion invalida");
            }
        } while (true);
    }
    
}
