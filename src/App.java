import java.util.Scanner;

import G1Poliretos.G1Arrays;
import G1Poliretos.G1CadenaCaracteres;
import G1Poliretos.G1Figuras;
import G1Poliretos.G1GrafosYAutomatas;
import G1Poliretos.G1Loading;
import G1Poliretos.G1Recursion;
import G1Poliretos.G1SerieCaracter;
import G1Poliretos.G1SeriesNumericas;

public class App {
    public static void main(String[] args) throws Exception {

        int tamañoSerie,nivelFigura;
        char caracter;
        String nombre;
        Scanner sc =new Scanner(System.in);
        System.out.print("Digite el nivel para la serie: ");
        tamañoSerie = sc.nextInt();
        System.out.print("Digite el nivel para la figura: ");
        nivelFigura = sc.nextInt();
        System.out.print("Digite el caracter para la figura: ");
        caracter = sc.next().charAt(0);
        

        // System.out.println();
        // System.out.println("******************************");
        // System.out.println("*                            *");
        // System.out.println("*    Escuela Universidad     *");
        // System.out.println("*           Grupo 1          *");
        // System.out.println("*                            *");
        // System.out.println("******************************");
        // System.out.println();


        try {
            G1SeriesNumericas   objSerieNumeric     = new G1SeriesNumericas();
            G1SerieCaracter     objSerieCaracter    = new G1SerieCaracter();
            G1Figuras           objFiguras          = new G1Figuras();
            G1CadenaCaracteres  objCadenaCaract     = new G1CadenaCaracteres();
            G1Arrays            objArrays           = new G1Arrays();
            G1Loading           objLoading          = new G1Loading();
            G1Recursion         objRecursion        = new G1Recursion();
            G1GrafosYAutomatas  objGrafic           =new G1GrafosYAutomatas();

            objSerieNumeric.g1_crearSerie3(tamañoSerie);
            objSerieNumeric.g1_crearSerie6(5);
            objSerieNumeric.g1_crearSerie10(5);
            objSerieNumeric.g1_crearSerie11(5);

            objSerieCaracter.g1_crearSerie1(tamañoSerie);
            objSerieCaracter.g1_crearSerieCaracter6(tamañoSerie);
            objSerieCaracter.g1_crearSerieCaracterSeis(tamañoSerie);

            System.out.println();
            objFiguras.g1_crearFigura1(nivelFigura);
            objFiguras.g1_crearFigura3(5);
            objFiguras.g1_crearFigura17(5);
            objFiguras.g1_crearFigura18(5);
            
            System.out.println();
            objArrays.dibujarfuncion2X("CrazyApple");
            System.out.println();
            objRecursion.conteoProgresivoRecursivo(1, 5);
            System.out.println();
            objLoading.showLoagin8("LeninAmangandi");

        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }

}
