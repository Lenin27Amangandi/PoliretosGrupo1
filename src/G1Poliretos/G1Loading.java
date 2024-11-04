package G1Poliretos;

public class G1Loading {

    public void g1_crearLoading2(Character caracter ){
        int longitudBarra = 20;
        int porcentaje = 0;

        System.out.println("Loading 2: ");
        while (porcentaje <= 100) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i < (porcentaje * longitudBarra / 100)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%  ");
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
            porcentaje++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Poliretos Loading 8)
     * @autor : Lenin Amangandi
     * @fecha: 01-11-2024
     * @version 1.0
     */

    public void g1_crearLoading8(String nombreCompleto) {

        System.out.println("Loading 8: ");
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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void g1_crearLoading11(int numNivel){
        
        int numAleatorio = 0;

        System.out.println("\nLoading 11:\n");

        for(int nivel = 0; nivel < numNivel; nivel++){
            
            numAleatorio = (int) (Math.random() * 10);

            for(int longitudSenal = 0; longitudSenal <= 20; longitudSenal++){
                
                if (longitudSenal < 10 - numAleatorio || longitudSenal > 10 + numAleatorio) {
                    System.out.print(" ");
                }

                if ((longitudSenal >= 10 - numAleatorio && longitudSenal < 10) || (longitudSenal <= 10 + numAleatorio && longitudSenal > 10)) {
                    System.out.print("\033[32m" + "-");
                }

                if (longitudSenal == 10) {
                    System.out.print("\033[32m" + "|");
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\u001B[0m");
        }
    }

}
