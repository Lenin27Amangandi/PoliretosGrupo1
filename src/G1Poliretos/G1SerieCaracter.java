package G1Poliretos;

public class G1SerieCaracter {
    
    public void g1_crearSerie1(int numero_terminos){
        
        System.out.println("\n\nSerie de caracteres 1: ");

        for(int i = 1; i <= numero_terminos; i++){
            System.out.print((i % 2 != 0)? "+ ": "- ");
        }
        System.out.println();
    }

    public void g1_crearSerieCaracter6(int numCaracteres) {
        System.out.println("Serie de caracteres 6: ");
        for (int i = 0; i < numCaracteres; i++) {
            char caracter = (char) (i + 'a');
            System.out.print(caracter + " ");
        }
        System.out.println();
    }
    
    public void g1_crearSerieCaracterSeis(int numCaracteres) {
        System.out.println("Serie de caracteres 6.1: ");
        for (int i = 0; i < (numCaracteres / 2); i++) {
            char vocal = (char) ('a' + (i * 2));
            System.out.print(vocal + " ");
            System.out.print((i % 2 == 0)?"+ ":"- ");
        }
        System.out.println();
    }

}
