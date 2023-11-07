


public class ArregloInicializacion {
    
    public static void main(String[] args) {
        String[][]nombres= {
            {"Manu", "Dany", "Omar"},
            {"Pablo", "Javier", "Brenda"},
            {"Sofi", "Xime", "Adrian"}
                    
        };
        
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
