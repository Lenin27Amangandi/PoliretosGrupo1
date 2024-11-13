package G1Poliretos;

public class G1SerieCaracter {
    
    public void g1_crearSerieCaracter1(int numero_terminos){
        
        System.out.println("\n\nSerie de caracteres 1: ");

        for(int i = 1; i <= numero_terminos; i++){
            System.out.print((i % 2 != 0)? "+ ": "- ");
        }
        System.out.println();
    }

    public void g1_crearSerieCaracter2(int numero_terminos){
        
        System.out.println("\n\nSerie de caracteres 2: ");

        for (int i = 0, nActual = 0, nSiguiente = 1; i <= numero_terminos; nSiguiente+=nActual, nActual = nSiguiente-nActual, i++) {
            for (int j = 0; j < nActual; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public void g1_crearSerieCaracter3(int numTerminos) {
    System.out.println("\nSerie de caracteres 3:");
    int contador = 0;
    int numero = 2;
    
    while (contador < numTerminos) {
        if (esPrimo(numero)) {
            System.out.print("+".repeat(numero) + " ");
            contador++;
        }
        numero++;
    }
    System.out.println();
}

    public void g1_crearSerieCaracter4(int numTerminos) {
    System.out.println("\nSerie de caracteres 4:");
    char[] caracteres = { '+', '-', '*', '/' };

    for (int i = 0; i < numTerminos; i++) {
        char caracterActual = caracteres[i % caracteres.length];
        System.out.print(caracterActual + " ");
    }
    System.out.println();
}

    public void g1_crearSerieCaracter5(int numero_terminos) {
    System.out.println("\nSerie de caracteres 5:");
    
    char[] patrones = {'\\', '|', '/', '-'};
    
    for (int i = 0; i < numero_terminos; i++) {
        System.out.print(patrones[i % patrones.length] + " ");
    }
    System.out.println();
}
    public void g1_crearSerieCaracter6(int numCaracteres) {
        System.out.println("\nSerie de caracteres 6: ");
        for (int i = 0; i < numCaracteres; i++) {
            char caracter = (char) (i + 'a');
            System.out.print(caracter + " ");
        }
        System.out.println();
    }
    
    public void g1_crearSerieCaracterSeis(int numCaracteres) {
        System.out.println("\nSerie de caracteres 6.1: ");
        for (int i = 0; i < (numCaracteres / 2); i++) {
            char vocal = (char) ('a' + (i * 2));
            System.out.print(vocal + " ");
            System.out.print((i % 2 == 0)?"+ ":"- ");
        }
        System.out.println();
    }

    public void g1_crearSerieCaracter7(int numCaracteres) {
        System.out.println("\nSerie de caracteres 7: ");
        for (int fila = 1; fila <= numCaracteres; fila++) {
            char vocal = (char) ('a' + (fila - 1));
            String mLetra = Character.toString(vocal);
            System.out.print(mLetra.repeat(fila * 2) + " ");
        }
        System.out.println();
    }

    public void g1_crearSerieCaracter8(int numTerminos) {
        System.out.println("\nSerie de caracteres 8: ");
        for (int cont = 0, termino = 2, abecedario = 0; cont < numTerminos; termino++) {
            if (esPrimo(termino)) {
                char letra = (char) ('a' + abecedario);
                System.out.print(String.valueOf(letra).repeat(termino) + " ");
                abecedario++;
                cont++;
            }
        }
        System.out.println();
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void g1_crearSerieCaracter9(int numCaracteres) {
        System.out.println("\nSerie de caracteres 9: ");
        for (int i = 0; i < numCaracteres; i++) {
            char letra = (char) ('a' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(letra);
            }

            if (i < numCaracteres - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
