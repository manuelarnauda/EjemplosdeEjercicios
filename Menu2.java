

import java.util.Scanner;
public class Menu2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean banderaSalida = true;
        
        while (banderaSalida) {
            System.out.println("Bienvenido a la cafeteria");
            System.out.println("Elige tu cafe favorito");
            System.out.println("1. Pumpkin spice latte");
            System.out.println("2. Latte");
            System.out.println("3. Americano");
            System.out.println("4. Capuccino");
            System.out.println("5. Salir");     
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido un Pumpkin spice latte");
                    System.out.println("El total es de $90");
                    break;
                case 2:
                    System.out.println("Has elegido un Latte");
                    System.out.println("El total es de $50");
                    break;
                case 3:
                    System.out.println("Has elegido un Americano");
                    System.out.println("El total es de $30");
                    break;
                case 4:
                    System.out.println("Has elegido un Capuccino");
                    System.out.println("El total es de $70");
                    break;
                case 5:
                    System.out.println("Gracias por venir");
                    banderaSalida = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            
        }
    }
    
}
