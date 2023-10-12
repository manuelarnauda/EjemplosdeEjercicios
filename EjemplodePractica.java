
package ejemplodepractica;
import java.util.Scanner;

public class EjemplodePractica {

   
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        int numero = scanner.nextInt();
        int primervalor = 0;
        int segundovalor = 1;
        
        for (int i = 0; i < numero; i++) {
            
            System.out.println(segundovalor);
            int suma = primervalor + segundovalor;
            primervalor = segundovalor;
            segundovalor= suma;
            
        }
    }
    
}
