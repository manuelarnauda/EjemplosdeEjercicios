
package ejerciciodepractica;


public class EjerciciodePractica {

    
    public static void main(String[] args) {
        
        int[][] consumoagua = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40},
        };
        
    int[][] Dia = new int[4][];
    Dia[0]= new int[1];
    Dia[1]= new int[2];
    Dia[2]= new int[3];
    Dia[3]= new int[4];
    
    
    consumocasa(consumoagua);
        System.out.println();
    }
        public static void consumocasa(int[][] consumoagua) {
    
        for (int i = 0; i < consumoagua.length; i++) {
            int sumafilas = 0;
            for (int j = 0; j < consumoagua[i].length; j++) {
                sumafilas+= consumoagua[i][j]; 
                
            }
            System.out.println("Consumo por casa semanal " + (i+1) + ": " + sumafilas);
        }
    
    
       
    }
    
    
}
