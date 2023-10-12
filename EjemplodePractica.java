
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
            // 0+1=1
            primervalor = segundovalor;
            // Pasa a valer 1
            segundovalor= suma;
            // Ahors vale 1, por lo cual 1+1=2
            // Se repite el proceso
            //Ejemplo con iteraciones en la libreta
        }
    }
    
}
