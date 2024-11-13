package G1Poliretos;

import java.util.Scanner;

public class G1Arrays {

    public void g1_crearArray01(Scanner sc){

        System.out.print("\t Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();
        String[] palabras = nombreCompleto.split(" ");
        int[] porcentajes = new int[palabras.length];


        System.out.print("\t Ingrese el porcentaje de carga para cada  palabra: ");
        for(int i = 0; i < palabras.length; i++){
            while(!sc.hasNextInt()){
                System.out.println("\t Error, ingrese un número");
                sc.next();
            }
            porcentajes[i] = sc.nextInt();
        }
        sc.nextLine();

        System.out.println("\n" + nombreCompleto);
        for(int i = 0; i < palabras.length; i++){
            mostrarProgreso(palabras[i], porcentajes[i]);
        }

    }

    private void mostrarProgreso(String palabra, int porcentaje) {
        int longitudBarra = 15;
        int cantidadLlenos = (porcentaje * longitudBarra) / 100;
        int cantidadVacios = longitudBarra - cantidadLlenos;

        int longitudCorte = (porcentaje * palabra.length()) / 100;
        String palabraCortada = palabra;
        if (longitudCorte < palabra.length()) {
            palabraCortada = palabra.substring(0, longitudCorte);
        }

        String barra = "[" + "=".repeat(cantidadLlenos) + ">".repeat(1) 
                        + " ".repeat(cantidadVacios) + "] "
                        + porcentaje + "% " + palabraCortada;
        System.out.println(barra);
    }

    public void g1_crearArray02(int tamaño,char caracter){
            char[][] primera = new char[tamaño][tamaño];
            char[][] segunda = new char[tamaño][tamaño];
    
            for (int i = 0; i < primera.length; i++) {
                for (int j = 0; j < primera[i].length; j++) {
                    if ((i == 0) || (j == tamaño / 2) || (j < tamaño / 2 && i == tamaño - 1)) {
                        primera[i][j] = caracter;
                    } else {
                        primera[i][j] = ' ';
                    }
                    if ((i == 0 || i == tamaño / 2 || j == 0) || (i < tamaño / 2 && j == segunda[i].length - 1) || (j > tamaño / 2 && j == 0)) {
                        segunda[i][j] = caracter;
                    } else {
                        segunda[i][j] = ' ';
                    }
                }
            }
            char[][] matriz = new char[tamaño][2 * tamaño + 2]; 
    
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    matriz[i][j] = primera[i][j];
                    matriz[i][j + tamaño + 2] = segunda[i][j];
                }
            }
    
            for (int i = 0; i < tamaño ; i++) {
                for (int j = 0; j < 2 * tamaño + 2; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
    }

 
    public void dibujarfuncion2X(String nombre) {
        for (int i = nombre.length() - 1; 0 <= i; i--)
            System.out.println(String.format("%2d", (i + 1)) + " |" + " ".repeat(i) + " " + nombre.charAt(i));
        System.out.println(" 0 |" + "_".repeat(nombre.length() + 2));
    }

    public void g1_crearArray04(String nombre, String apellido){
        
        int longitud = 0;
        int fila = 0, columna = 0;

        longitud = (nombre.length() >= apellido.length())? nombre.length(): apellido.length();
        char [][] matrizX = new char[longitud][longitud];
 
        for(fila = 0; fila < longitud; fila++){
            for(columna = 0; columna < longitud; columna++){
            
               if(fila == columna && fila < nombre.length()){
                    matrizX[fila][columna] = nombre.charAt(fila);
               }

               if (longitud - fila - columna == 1 && fila < apellido.length()){
                    matrizX[fila][columna] = apellido.charAt(fila);
               }

               if ((fila == columna && fila > nombre.length()) || (longitud - fila - columna == 1 && fila > apellido.length()) || (fila != columna && longitud - fila - columna != 1)) {
                    matrizX[fila][columna] = ' ';
               }
               
            }
        }

        System.out.println("\nArray 04:");
        
        for(fila = 0; fila < longitud; fila++){
            for(columna = 0; columna < longitud; columna++){

                System.out.print(matrizX[fila][columna] + "  ");

            }
            System.out.println("");
        }
    }


    public void g1_crearArray05() {
        System.out.println("Array 5");
        System.out.println("Nombre completo: Lenin Alexander Amangandi Llumiguano");
        String nombresCompleto = "Lenin Alexander Amangandi Llumiguano";
        String[] arregloNombres = nombresCompleto.split(" ");
        String primeraPalabra = arregloNombres[0];
        int tamañoMatriz = primeraPalabra.length();
        char matriz[][] = new char[tamañoMatriz][tamañoMatriz];

        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int contador = 0; contador < arregloNombres.length; contador++) {
            primeraPalabra = arregloNombres[contador];
            for (char letras : primeraPalabra.toCharArray()) {
                int x, y;
                x = (int) (Math.random() * tamañoMatriz);
                y = (int) (Math.random() * tamañoMatriz);
                if (matriz[x][y] != ' ') {
                    matriz[x][y] = '*';
                } else {
                    matriz[x][y] = letras;
                }
            }
        }

        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
