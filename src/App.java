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
        String nombre,frase1,frase2,frase3,frase4,apellido,palabra,variable;
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

            System.out.println();
            objSerieNumeric.g1_crearSerie2(tamañoSerie);
            objSerieNumeric.g1_crearSerie3(tamañoSerie);
            objSerieNumeric.g1_crearSerie6(tamañoSerie);
            objSerieNumeric.g1_crearSerie9(tamañoSerie);
            objSerieNumeric.g1_crearSerie10(tamañoSerie);
            objSerieNumeric.g1_crearSerie11(tamañoSerie);

            objSerieCaracter.g1_crearSerie1(tamañoSerie);
            objSerieCaracter.g1_crearSerieCaracter6(tamañoSerie);
            objSerieCaracter.g1_crearSerieCaracterSeis(tamañoSerie);

            System.out.println();
            objFiguras.g1_crearFigura1(nivelFigura);
            objFiguras.g1_crearFigura3(nivelFigura);
            objFiguras.g1_crearFigura5(nivelFigura,caracter);
            objFiguras.g1_crearFigura14(nivelFigura);
            objFiguras.g1_crearFigura15(nivelFigura);
            objFiguras.g1_crearFigura16(nivelFigura);
            objFiguras.g1_crearFigura17(nivelFigura);
            objFiguras.g1_crearFigura18(nivelFigura);
            
            System.out.println();
            String vacio=sc.nextLine();

            System.out.print("Digite un frase para la serie 1: ");
            frase1=sc.nextLine();
            objCadenaCaract.g1_crearCadena1(frase1);
            
            System.out.print("Digite un frase para la cadena 6: ");
            String frase6=sc.nextLine();
            objCadenaCaract.g1_crearCadena6(frase6);

            System.out.print("Digite un frase para la cadena 7: ");
            String frase7=sc.nextLine();
            objCadenaCaract.g1_crearCadena7(frase7);
            
            System.out.print("Digite un frase para la cadena 8: ");
            objCadenaCaract.g1_crearCadena08();

            System.out.print("Digite un frase para la serie 9: ");
            frase2=sc.nextLine();
            objCadenaCaract.g1_crearCadena09(frase2);
            
            System.out.print("Digite un frase para el array 3: ");
            frase3=sc.nextLine();
            objArrays.dibujarfuncion2X(frase3);
            
            System.out.print("Digite su nombre para el array 4: ");
            nombre=sc.nextLine();
            System.out.print("Digite su apellido para el array 4: ");
            apellido=sc.nextLine();
            objArrays.g1_crearArray04(nombre,apellido);

            System.out.println();
            objLoading.g1_crearLoading2(caracter);
            objLoading.g1_crearLoading8("LeninAmangandi");
            objLoading.g1_crearLoading11(50);

            System.out.println();
            objRecursion.conteoProgresivoRecursivo(1, 5);
            System.out.println("\n\nEl factorial de 5: " + objRecursion.g1_crearFactorialRecursivo(5));
            System.out.println("\nEl suma de 4 y 3: " + objRecursion.g1_crearSumaRecursiva(4, 3));
            
            System.out.println();
            System.out.println("\nIngrese una palabra separada por '-' para su verificación : ");
            palabra = sc.next();
            objGrafic.g1_crearAutomata03(palabra);

            System.out.println("\nIngrese el nombre de una variable separada por '-' para su verificación: ");
            variable = sc.next();
            objGrafic.g1_crearAutomata05(variable);

        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }

}
