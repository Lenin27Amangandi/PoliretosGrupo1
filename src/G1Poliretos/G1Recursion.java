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

    public void g1_conteoRegresivo(int n) {
        if (n < 0) {
            System.out.println("Número ingresado es negativo. El conteo regresivo no es posible.");
        } else {
            g1_conteoRegresivoRecursivo(n);
        }
    }

    private void g1_conteoRegresivoRecursivo(int n) {
        if (n == 0) {
            System.out.println("¡Cuenta regresiva completa!");
        } else {
            System.out.println("Conteo regresivo: " + n);
            g1_conteoRegresivoRecursivo(n - 1);
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

    public int g1_crearMultiplicacionRecursiva(int numero4, int numero5){
        return numero5 ==0? 0:  numero4 + g1_crearMultiplicacionRecursiva(numero4, numero5-1);
    }

    public int g1_crearPotenciaRecursiva(int numero6, int numero7){
        return numero7==0? 1:  numero6 * g1_crearPotenciaRecursiva(numero6, numero7-1);
    }

    

}
