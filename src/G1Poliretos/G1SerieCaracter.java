package G1Poliretos;

public class G1SerieCaracter {
    
    public void g1_crearSerieCaracter1(int numero_terminos){
        
        System.out.println("\n\nSerie de caracteres 1: ");

        for(int i = 1; i <= numero_terminos; i++){
            System.out.print((i % 2 != 0)? "+ ": "- ");
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

}
