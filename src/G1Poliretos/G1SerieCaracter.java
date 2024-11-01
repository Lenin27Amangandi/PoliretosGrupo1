package G1Poliretos;

public class G1SerieCaracter {
    
    public void g1_crearSerie1(int numero_terminos){
        
        System.out.println("\n\nSerie de caracteres 1: ");

        for(int i = 1; i <= numero_terminos; i++){
            System.out.print((i % 2 != 0)? "+ ": "- ");
        }
    }
}
