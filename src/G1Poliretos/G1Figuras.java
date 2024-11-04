package G1Poliretos;

public class G1Figuras {

    /**
     * Poliretos Figuras ejercicio 1)
     * @autor : Lenin Amangandi
     * @fecha: 01-11-2024
     * @version 1.0
     */

    public void g1_crearFigura1(int numNivel) {
        for (int fila = 0; fila < numNivel; fila++) {
            for (int columna = 0; columna < numNivel; columna++) {
                if (fila == 0 || fila == numNivel - 1 || columna == 0 || columna == numNivel - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void g1_crearFigura3(int tamanio) {

        System.out.println("\n\nFigura 3: ");

        for(int fila = 0; fila < tamanio; fila++){
            for(int columna = 0; columna <= fila; columna++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void g1_crearFigura17(int tamanio){

        System.out.println("\n\nFigura 17: ");

        for(int fila = 0; fila < tamanio; fila++){
            for(int columna = 0; columna < tamanio; columna++){
                if(((fila == 0 || fila == tamanio - 1) && (columna == 0 || columna == tamanio - 1)) || (fila == tamanio/2 && columna == tamanio/2)){
                    System.out.print("1");
                }

                if(((fila > 0 && fila < tamanio/2) || (fila > tamanio/2 && fila < tamanio-1)) && ((columna > 0 && columna <= tamanio/2) || (columna > tamanio/2 && columna < tamanio-1)) && (fila == columna || tamanio - fila - columna == 1)){
                    System.out.print("0");
                }

                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public void g1_crearFigura18(int tamanio) {

        System.out.println("\n\nFigura 18: ");

        int fila = 0, columna = 0;
        int[][] matriz_triangulo = new int [tamanio][tamanio]; 

        for(fila = 0; fila < tamanio; fila++){
            for(columna = 0; columna <= fila; columna++){
                
                if (fila == columna) {
                    matriz_triangulo[fila][columna] = 2;
                }
                
                if (columna == 0 && fila > 0) {
                    matriz_triangulo[fila][columna] = 1;
                }

                if((fila != columna) && columna != 0){
                matriz_triangulo[fila][columna] = matriz_triangulo[fila - 1][columna - 1] + matriz_triangulo[fila - 1][columna]; 
                }
            }
        }

        for(fila = 0; fila < tamanio; fila++){
            for(columna = 0; columna <= fila; columna++){
                System.out.print(matriz_triangulo[fila][columna] + "  ");
            }
            System.out.println("");
        }
    }

}
