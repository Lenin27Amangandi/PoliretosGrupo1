package G1Poliretos;
public class G1Arrays {

    /**
     * Poliretos Arrays ejercicio 3)
     * Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como
     * caracteres las letras de su nombre
     * @autor : Lenin Amangandi
     * @fecha: 01-11-2024
     * @version 1.0
     */
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

}
