package G1Poliretos;
public class G1SeriesNumericas {

    public void g1_crearSerie2(int numero_terminos){
        System.out.println("\nSerie numérica 2:");
        for(int i=1; i<=numero_terminos; i+=2){
            System.out.print(i);
        if(i+2<=numero_terminos){
            System.out.print(0);
        }
        }
        System.out.println();
    }
    
    public void g1_crearSerie3(int nivel) {
        System.out.println("Serie numerica 3");
        int num1 = 0, num2 = 1, par = 1, num3;
        for (int i = 1; i <= nivel; i++) {
            if (i == 1) {
                System.out.print(num1 + "/" + par + " ");
            } else if (i == 2) {
                System.out.print(num2 + "/" + (par + 2) + " ");
                par = par + 2;
            } else {
                par = par + 2;
                num3 = num1 + num2;
                System.out.print(num3 + "/" + par + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void g1_crearSerie5(int numTerminos) {
        System.out.println("Serie Numerica 5:");
        for (int cont = 0, termino = 2; cont < numTerminos; termino++) {
            if (esPrimo(termino)) {
                System.out.print(termino + " ");
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

    public void g1_crearSerie6(int numero_terminos){
        System.out.println("Serie numérica 6:");
        for(int i = 1; i <= numero_terminos; i++){
            System.out.print(i*i + " ");
        }
        System.out.println();
    }

    public void g1_crearSerie9(int numero_terminos){
        int base=0;
        
        System.out.println("\n\nSerie numérica 9:");
        for(int i=0; i<numero_terminos;  i++){
            base=(int) Math.pow(2, i);
            System.out.print(base*2 + ", ");
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
        System.out.println();
    }

    public void g1_crearSerie11(int numero_terminos){
        int factor = 2;

        System.out.println("\n\nSerie numérica 11:");
        
        for(int i = 1; i <= numero_terminos; i++){
            System.out.print(i * factor + " ");
            factor++;
        }
        System.out.println();
    }

    
}
