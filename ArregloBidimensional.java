
package arreglobidimensional;


public class ArregloBidimensional {

   
    public static void main(String[] args) {
        int[][]numeros = new int[4][5];
        int numero=1;
        //Guardando info en arreglo unidimensional
        for (int i = 0; i < 4; i++) { //filas
            for (int j = 0; j < 5; j++) { //columnas
                numeros[i][j]=numero;
                numero++;
            }
        }
        //Leyendo info en arreglo unidimensional
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + " ");
                
            }
            System.out.println();
        }
    }
    
}
