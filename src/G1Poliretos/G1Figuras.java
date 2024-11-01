package G1Poliretos;

public class G1Figuras {

    /**
     * Poliretos Figuras ejercicio 1)
     * @autor : Lenin Amangandi
     * @fecha: 01-11-2024
     * @version 1.0
     */

    public void showFigura1(int numNivel) {
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

}
