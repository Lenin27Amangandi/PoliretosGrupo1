package G1Poliretos;
public class G1Loading {

    /**
     * Poliretos Loading 8)
     * @autor : Lenin Amangandi
     * @fecha: 01-11-2024
     * @version 1.0
     */

    public void showLoagin8(String nombreCompleto) {
        int longitud = nombreCompleto.length();
        for (int i = 0; i <= longitud; i++) {
            int porcentaje = (i * 100) / longitud;
            System.out.print("[");
            for (int j = 0; j < i; j++) {
                System.out.print(nombreCompleto.charAt(j));
            }
            for (int k = 0; k < longitud - i; k++) {
                System.out.print(" ");
            }
            System.out.print("] " + porcentaje + "%");
            System.out.print("\r");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
