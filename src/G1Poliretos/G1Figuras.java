package G1Poliretos;

public class G1Figuras {

    /**
     * Poliretos Figuras ejercicio 1)
     * @autor : Lenin Amangandi
     * @fecha: 01-11-2024
     * @version 1.0
     */

    public void g1_crearFigura1(int numNivel) {
        System.out.println("Figura 1:");
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

    public void g1_crearFigura5(int nivel, char caracter) {
        System.out.println("\nFigura 5");
        for (int fila = 0; fila < nivel; fila++) {
            for (int espacio = 0; espacio < fila; espacio++) {
                System.out.print(" ");
            }
            for (int simbolo = 0; simbolo < (nivel * 2 - (fila * 2) - 1); simbolo++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void g1_crearFigura9(int tamanio){

        System.out.println("Figura 9:");

        int aux1 = (tamanio - 1) * 4, aux2 = 3;
        String cadenaGuion = "___";

        for(int fila  = 0; fila < tamanio; fila++){

            for(int espaciosIzq = 0; espaciosIzq < aux1; espaciosIzq++){
                System.out.print(" ");
            }

            if (fila == 0) {
                System.out.println(cadenaGuion);
                aux1 -= 4;
            }

            if (fila > 0) {
                System.out.print(cadenaGuion + "|");
                aux1 -= 4;

                for(int espaciosInternos = 0; espaciosInternos < aux2; espaciosInternos++){
                    System.out.print(" ");
                }

                System.out.println("|" + cadenaGuion);
                aux2 += 8;
            }
        }
        System.out.println();
    }
    
    public void g1_crearFigura10(int tamanio){

        int aux = 3;

        System.out.println("\nFigura 10:\n");

        for(int fila = 1; fila <= tamanio + 1; fila++){
            if (fila == 1) {
                System.out.println("_+_");
            }

            if (fila > 1) {
                for(int j = 0; j < aux; j++){
                    System.out.print(" ");
                }
            }

            if (fila > 1 && fila % 2 == 0 && fila != tamanio + 1) {
                System.out.println("|_-_");
                aux += 4;
            }

            if (fila > 1 && fila % 2 != 0 && fila != tamanio + 1) {
                System.out.println("|_+_");
                aux += 4;
            }

            if (fila == tamanio + 1) {
                System.out.println("|");
            }
        }
    }

    public void g1_crearFigura11(int tamanio){

        int aux = 3;

        System.out.println("\nFigura 11:\n");

        for(int fila = 1; fila <= tamanio; fila++){
            if (fila == 1) {
                System.out.print("| _");
            }

            if (fila > 1) {
                for(int espaciosIzq = 0; espaciosIzq < aux; espaciosIzq++){
                    System.out.print(" ");
                }

                System.out.print("|");

                for(int guiones = 0; guiones < fila; guiones++){
                    System.out.print(" _");
                    aux+=2;
                }
                aux += 1;
            }

            System.out.println("");
        }

    }

    public void g1_crearFigura13(int tamanio){

        System.out.println("\nFigura 13:\n");

        for(int fila = 1; fila <= tamanio; fila++){
            for(int columna = 1; columna <= fila; columna++){
                System.out.print(columna);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void g1_crearFigura14(int nivel) {
        System.out.println("Figura 14: ");
        for (int filas = 0; filas < nivel; filas++) {
            for (int espacios = nivel; filas < espacios; espacios--) {
                System.out.print(" ");
            }
            int contador = 1;
            for (int j = 0; j <= filas; j++) {
                System.out.print(contador + " ");
                contador = contador * (filas - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void g1_crearFigura15(int nroNiveles) {
        System.out.println("Figura 15: ");
        for (int i = 0; i < nroNiveles; i++) {
            imprimirCoeficientes1(i);
            System.out.println();
        }
    }
    public void imprimirCoeficientes1(int rowNum) {
        for (int i = 0; i <= rowNum; i++) {
            System.out.print(calcularCoeficiente1(rowNum, i) + " ");
        }
    }
    public int calcularCoeficiente1(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcularCoeficiente1(n - 1, k - 1) + calcularCoeficiente1(n - 1, k);
        }
    }

    public void g1_crearFigura16(int nroNiveles){
        System.out.println("\nFigura 16: ");
        for (int i = 1; i <= nroNiveles; i++) {
            for (int j = 1; j <= nroNiveles; j++) {
                if ((i == j || i + j == nroNiveles + 1)) {
                    if (i%2==0) {
                        System.out.print(" "+ '-' +" ");
                    } else {
                        System.out.print(" " + '+' + " ");
                    } 
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public void g1_crearFigura17(int tamanio){

        System.out.println("\nFigura 17: ");

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
