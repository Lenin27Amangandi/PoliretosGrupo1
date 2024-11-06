package G1Poliretos;

import java.util.Arrays;
import java.util.Scanner;

public class G1Loading {

    public void g1_crearLoading1() {
        char[] simbolos = { '\\', '|', '/', '|' };
        System.out.print("\nLoading 1: \n");
        for (int i = 0; i < 100; i++) {
            char simbolo = simbolos[i % simbolos.length];
            System.out.print("\r" + simbolo + "Cargando..." + i + "%");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\rCarga completa: 100%\n");
    }

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

     public void g1_crearLoading4() {
        String[] signos = {"0oo", "o0o", "oo0"};
        int total = 20;
        System.out.println("");
        System.out.println("Loading 4: ");
        for (int i = 0; i <= total; i++) {
            System.out.print(signos[i % signos.length] + " " + (i * 5) + "%\r");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.println(signos[1] + " 100%");
    }

    public void g1_crearLoading5(){
        int total = 20;
        System.out.println("Loading 5: ");
        for (int i = 0; i <= total; i++) {
            int progress = (i * 100) / total;
            StringBuilder barra = new StringBuilder();
            for (int j = 0; j < total; j++) {
                if (j < i) {
                    barra.append("=");
                } else if (j == i) {
                    barra.append(i % 2 == 0 ? ">" : "-");
                } else {
                    barra.append(" ");
                }
            }
            System.out.print("[" + barra + "] " + progress + "%\r");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.println("[====================] 100%");
    }

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

    public void g1_crearLoading9(Scanner sc){
        System.out.println("\n");
        System.out.println("\nLoading 8: ");
        System.out.print("\t  Ingrese su nombre: ");  
        String entrada1 = sc.nextLine();
        

        int longitud = entrada1.length(); 
        char[][] nombreArray = new char[1][longitud];
        char[] nombreChar = entrada1.toCharArray();
        int totalPasos = 100;
        int delay  = 100;

        Arrays.fill(nombreArray[0], ' ');

        for (int paso = 0; paso <= totalPasos; paso++) {
            int mostrarCaracter = (paso * longitud)/100;

            for (int i = 0; i < mostrarCaracter; i++) {
                nombreArray[0][i] = nombreChar[i];
            }

            System.out.print("\r\t\t [");
            for (char c : nombreArray[0]) {
                System.out.print(c);
            }
            System.out.print("] " + paso + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\n\t Carga interrumpida...");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.print("\r\t\t [");
        for (char c : nombreArray[0]) {
            System.out.print(c);
        }
        System.out.print("] 100% \n");
        System.out.println("\t\t Carga completada...");
        System.out.println(" ");
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
