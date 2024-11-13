import G1Poliretos.G1Arrays;
import G1Poliretos.G1CadenaCaracteres;
import G1Poliretos.G1Figuras;
import G1Poliretos.G1GrafosYAutomatas;
import G1Poliretos.G1Loading;
import G1Poliretos.G1Recursion;
import G1Poliretos.G1SerieCaracter;
import G1Poliretos.G1SeriesNumericas;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int tamañoSerie,nivelFigura;
        char caracter;
        String nombre,frase1,frase2,frase3,apellido,palabra,variable;
        Scanner sc =new Scanner(System.in);      

        System.out.println();
        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("*    Escuela Politécnica Nacional     *");
        System.out.println("*               Grupo 1               *");
        System.out.println("*                                     *");
        System.out.println("*    Integrantes                      *");
        System.out.println("*    Alangasí.Anthony                 *");
        System.out.println("*    Amangandi.Lenin                  *");
        System.out.println("*    Azaña.Kevin                      *");
        System.out.println("*    Bedón.Joan                       *");
        System.out.println("*    Cadena.Darwin                    *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println();

        System.out.print("Digite el número de términos para las series: ");
        tamañoSerie = sc.nextInt();
        System.out.print("\nDigite el nivel para las figuras: ");
        nivelFigura = sc.nextInt();
        System.out.print("\nDigite el caracter para la figura: ");
        caracter = sc.next().charAt(0);

        try {
            G1SeriesNumericas   objSerieNumeric     = new G1SeriesNumericas();
            G1SerieCaracter     objSerieCaracter    = new G1SerieCaracter();
            G1Figuras           objFiguras          = new G1Figuras();
            G1CadenaCaracteres  objCadenaCaract     = new G1CadenaCaracteres();
            G1Arrays            objArrays           = new G1Arrays();
            G1Loading           objLoading          = new G1Loading();
            G1Recursion         objRecursion        = new G1Recursion();
            G1GrafosYAutomatas  objGrafic           =new G1GrafosYAutomatas();

            System.out.println();

            objSerieNumeric.g1_crearSerie1(tamañoSerie);
            objSerieNumeric.g1_crearSerie2(tamañoSerie);
            objSerieNumeric.g1_crearSerie3(tamañoSerie);
            objSerieNumeric.g1_crearSerie5(tamañoSerie);
            objSerieNumeric.g1_crearSerie6(tamañoSerie);
            objSerieNumeric.g1_crearSerie9(tamañoSerie);
            objSerieNumeric.g1_crearSerie10(tamañoSerie);
            objSerieNumeric.g1_crearSerie11(tamañoSerie);

            objSerieCaracter.g1_crearSerieCaracter1(tamañoSerie);
            objSerieCaracter.g1_crearSerieCaracter6(tamañoSerie);
            objSerieCaracter.g1_crearSerieCaracterSeis(tamañoSerie);
            objSerieCaracter.g1_crearSerieCaracter8(tamañoSerie);

            System.out.println();
            objFiguras.g1_crearFigura1(nivelFigura);
            objFiguras.g1_crearFigura2(nivelFigura);
            objFiguras.g1_crearFigura3(nivelFigura);
            objFiguras.g1_crearFigura5(nivelFigura,caracter);
            objFiguras.g1_crearFigura9(nivelFigura);
            objFiguras.g1_crearFigura10(nivelFigura);
            objFiguras.g1_crearFigura11(nivelFigura);
            objFiguras.g1_crearFigura13(nivelFigura);
            objFiguras.g1_crearFigura14(nivelFigura);
            objFiguras.g1_crearFigura15(nivelFigura);
            objFiguras.g1_crearFigura16(nivelFigura);
            objFiguras.g1_crearFigura17(nivelFigura);
            objFiguras.g1_crearFigura18(nivelFigura);
            
            System.out.println();
            String vacio=sc.nextLine();

            System.out.print("\nDigite un frase para la cadena 1: ");
            frase1=sc.nextLine();
            objCadenaCaract.g1_crearCadena1(frase1);
            
            System.out.print("\nDigite un frase para la cadena 6: ");
            String frase6=sc.nextLine();
            objCadenaCaract.g1_crearCadena6(frase6);

            System.out.print("\nDigite un frase para la cadena 7: ");
            String frase7=sc.nextLine();
            objCadenaCaract.g1_crearCadena7(frase7);
            
            System.out.print("\nDigite un frase para la cadena 8: ");
            objCadenaCaract.g1_crearCadena08();

            System.out.print("\nDigite un frase para la cadena 9: ");
            frase2=sc.nextLine();
            objCadenaCaract.g1_crearCadena09(frase2);
            
            System.out.println("\n");
            objArrays.g1_crearArray01(sc);

            System.out.print("\nDigite un frase para el array 3: ");
            frase3=sc.nextLine();
            objArrays.dibujarfuncion2X(frase3);
            
            System.out.print("\nDigite su nombre para el array 4: ");
            nombre=sc.nextLine();
            System.out.print("\nDigite su apellido para el array 4: ");
            apellido=sc.nextLine();
            objArrays.g1_crearArray04(nombre,apellido);

            objArrays.g1_crearArray05();

            System.out.println();
            objLoading.g1_crearLoading1();
            objLoading.g1_crearLoading2(caracter);
            objLoading.g1_crearLoading4();
            objLoading.g1_crearLoading5();
            objLoading.g1_crearLoading8("LeninAmangandi");
            objLoading.g1_crearLoading9(sc);
            objLoading.g1_crearLoading11(50);
            objLoading.g1_crearLoading11D();

            System.out.println("\n\nEl factorial de 5: " + objRecursion.g1_crearFactorialRecursivo(5));
            System.out.println("\nEl suma de 4 y 3: " + objRecursion.g1_crearSumaRecursiva(4, 3));
            System.out.println("\nLa multiplicacion de 4 y 3: " + objRecursion.g1_crearMultiplicacionRecursiva(4, 3));
            System.out.print("\n El Conteo desde 1 a 5 es: ");
            objRecursion.conteoProgresivoRecursivo(1, 5);
            System.out.println("\n4 elevado al cubo es: " + objRecursion.g1_crearPotenciaRecursiva(4, 3));

            System.out.println();
            System.out.println("\nIngrese una palabra separada por '-' y finalice con un punto para su verificación: ");
            palabra = sc.next();
            objGrafic.g1_crearAutomata03(palabra);

            System.out.println("\nIngrese el nombre de una variable separada por '-' y finalice con punto y coma para su verificación: ");
            variable = sc.next();
            objGrafic.g1_crearAutomata05(variable);

        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }

}
