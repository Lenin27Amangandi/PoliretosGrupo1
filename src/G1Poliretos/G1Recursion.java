package G1Poliretos;

public class G1Recursion {

    /**
     * Poliretos Recursion 6)
     * 
     * @autor : Lenin Amangandi
     * @version 1.0
     */
    public void conteoProgresivoRecursivo(int inicio, int fin) {
        if (inicio <= fin) {
            System.out.print(inicio
                    + " ");
            conteoProgresivoRecursivo(inicio + 1, fin);
        }
    }

    public int g1_crearFactorialRecursivo(int numero){
        
        numero =  numero == 0? 1 : numero * g1_crearFactorialRecursivo(numero - 1);
        return numero;

    }

    public int g1_crearSumaRecursiva(int sumando1, int sumando2){

        int suma = 0;

        suma = sumando2 == 0? sumando1: g1_crearSumaRecursiva(sumando1 + 1, sumando2 - 1) ;

        return suma;
    }
}
