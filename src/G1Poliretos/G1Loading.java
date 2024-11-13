package G1Poliretos;

import java.util.Arrays;
import java.util.Random;
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

    public void g1_crearLoading2(char caracter ){
            System.out.println("Loading 2: ");
            int longitudTotal = 20;
            for (int i = 0; i <= longitudTotal; i++) {
                String barraCargada = String.valueOf(caracter).repeat(i);
                String barraEspacios = " ".repeat(longitudTotal - i);
                int porcentaje = (i * 100) / longitudTotal;
                System.out.print("\r[" + barraCargada + barraEspacios + "] " + porcentaje + "%");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
    }

    public void g1_crearLoading3(String cr) {
        System.out.println();
        int espaciosAdelante = 20, espaciosAtras = 0;
        for (int i = 0; i <= 90; i += 10) {

            while (espaciosAtras <= 20) {
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + cr + " ".repeat(espaciosAdelante) + "]" + i + "%");
                espaciosAtras++;
                espaciosAdelante--;
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            while (espaciosAtras > 0) {
                espaciosAtras--;
                espaciosAdelante++;
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + cr + " ".repeat(espaciosAdelante) + "]" + i + "%");
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.print("\r " + "[" + " ".repeat(espaciosAtras) + cr + " ".repeat(espaciosAdelante) + "]" + 100 + "%");
    }
    
    public void g1_crearLoading4() {
        String[] signos = {"0oo", "o0o", "oo0"};
        int total = 20;
        System.out.println("");
        System.out.println("\nLoading 4: ");
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
        System.out.println("\nLoading 5: ");
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

    public void g1_crearLoading6(){
        int espaciosAdelante = 20, espaciosAtras = 0;
        for (int i = 0; i <= 90;i+=10) {
            
            while (espaciosAtras <= 20) {
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + i + "%");
                espaciosAtras++;
                espaciosAdelante--;
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            while (espaciosAtras > 0) {
                espaciosAtras--;
                espaciosAdelante++;
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + i + "%");
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.print("\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + 100 + "%");
    }

    public void g1_crearLoading7(){
        int longitudBarra = 20;
      char[] puntaFlecha = {'\\', '|', '/', '-'};
      int indicePunta = 0;

      String[] figuras = {
         "[" + new String(new char[longitudBarra]).replace('\0', ' ') + "] 0%"
      };

      for (int i = 1; i <= 100; i++) {
         int cantidadRelleno = i * longitudBarra / 100;
         figuras[0] = "[" + new String(new char[cantidadRelleno]).replace('\0', '=') + puntaFlecha[indicePunta] + new String(new char[longitudBarra - cantidadRelleno]).replace('\0', ' ') + "] " + i + "%";

         System.out.print("\r" + figuras[0]);

         indicePunta = (indicePunta + 1) % puntaFlecha.length;

         try {
            Thread.sleep(250);
         } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
      }      
      System.out.println("\r[" + new String(new char[longitudBarra]).replace('\0', '=') + "] 100%");
   }


    /**
     * Poliretos Loading 8)
     * @autor : Lenin Amangandi
     * @fecha: 01-11-2024
     * @version 1.0
     */
    public void g1_crearLoading8(String nombreCompleto) {
            System.out.println("Loading 8: ");
            String barraEspacios;
            int porcentaje;
            for (int i = 0; i <= nombreCompleto.length(); i++) {
                barraEspacios = " ".repeat(nombreCompleto.length() - i);
                porcentaje = (i * 100) / nombreCompleto.length();
                System.out.print("\r[" + nombreCompleto.substring(0, i) + barraEspacios + "]" + porcentaje + "%");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }

    public void g1_crearLoading9(Scanner sc){
        System.out.println("\n");
        System.out.println("\nLoading 9: ");
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

    public void g1_crearLoading10() {
        Random random = new Random();
        int tamanoArchivo = 10 + random.nextInt(91); 
        double progreso = 0;
        double incremento = 0.4; 

        while (progreso < tamanoArchivo) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            String colorVerde = "\033[32m"; 
            String colorBlanco = "\033[0m"; 

            int longitudBarra = 30; 
            int relleno = (int) ((progreso / tamanoArchivo) * longitudBarra); 
            String barraProgreso = colorVerde + "━".repeat(relleno) + colorBlanco + " ".repeat(longitudBarra - relleno);

            System.out.printf("Downloading ArchivoYarl-win_amd64.whl (%d kB) \n", tamanoArchivo);
            System.out.printf("[%s] %.1f / %d kB\n", barraProgreso, progreso, tamanoArchivo);

            progreso += incremento;

            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String barraCompleta = "\033[32m" + "━".repeat(30) + "\033[0m";
        System.out.printf("Downloading ArchivoYarl-win_amd64.whl (%d kB)\n", tamanoArchivo);
        System.out.printf("[%s] %.1f / %d kB - Descarga completa\n", barraCompleta, tamanoArchivo * 1.0, tamanoArchivo);
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

    public void g1_crearLoading11D() {
        System.out.println("Loading 11.1: ");
        int numColumnas = 15;
        Random ramdom = new Random();
        int alturasRandosm[] = new int[numColumnas];

        for (int i = 0; i < alturasRandosm.length; i++) {
            alturasRandosm[i] = ramdom.nextInt(8);
            // System.out.print(alturasRandosm[i] + " ");
        }

        for (int nivel = 8; 0 < nivel; nivel--) {
            for (int altura : alturasRandosm) {
                if (altura >= nivel) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < alturasRandosm.length; i++) {
            System.out.print("* ");
        }
    System.out.println();
    }



    public void g1_crearLoading12() throws InterruptedException{
        
        System.out.println("\nLoading 12:\n");

        String[] figura = {
                                "   \\|||/",
                                "   (> <)",
                                "ooO-(_)-Ooo"
                        };
        
        int limiteTerminal = 70; 
        int delay = 100; 
        for (int movimientoDerecha = 0; movimientoDerecha <= limiteTerminal; movimientoDerecha++) {
            imprimirFigura(figura, movimientoDerecha);
            Thread.sleep(delay);
        }

        for (int movimientoIzquierda = limiteTerminal; movimientoIzquierda > 0; movimientoIzquierda--) {
            imprimirFigura(figura, movimientoIzquierda);
            Thread.sleep(delay);
        }
    }
    
    private void imprimirFigura(String[] figura, int espacios) {
        if (espacios == 0) {
            for (String parteFigura : figura) {
                System.out.println(" ".repeat(espacios) + parteFigura);
            }
        }
    
        if (espacios != 0) {
            System.out.print("\033[F\033[F\033[F\033[0J");
            System.out.flush();
            for (String parteFigura : figura) {
                System.out.println(" ".repeat(espacios) + parteFigura);
            }
        }
    }
}
