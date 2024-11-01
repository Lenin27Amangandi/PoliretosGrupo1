package G1Poliretos;
public class G1SeriesNumericas {
    
    public void g1_crearSerie6(int numero_terminos){
        
        System.out.println("\nSerie numérica 6:");
        
        for(int i = 1; i <= numero_terminos; i++){
            System.out.print(i*i + " ");
        }
    }

    public void g1_crearSerie10(int numero_terminos){
        
        int resultado = 0;
        
        System.out.println("\n\nSerie numérica 10:");
        
        for(int i = 1; i< numero_terminos; i++){
            resultado = (int) Math.pow(3, i);
            System.out.print(resultado + ", ");
        }
            
        System.out.print(resultado * 3 + ".");
    }

    public void g1_crearSerie11(int numero_terminos){
        int factor = 2;

        System.out.println("\n\nSerie numérica 11:");
        
        for(int i = 1; i <= numero_terminos; i++){
            System.out.print(i * factor + " ");
            factor++;
        }
    }
}
