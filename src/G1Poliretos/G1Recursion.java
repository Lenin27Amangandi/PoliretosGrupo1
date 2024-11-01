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
}
