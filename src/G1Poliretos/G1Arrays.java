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

}
