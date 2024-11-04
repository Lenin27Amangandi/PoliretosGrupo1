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

            objSerieNumeric.g1_crearSerie2(5);
            objSerieNumeric.g1_crearSerie6(5);
            objSerieNumeric.g1_crearSerie9(5);
            objSerieNumeric.g1_crearSerie10(5);
            objSerieNumeric.g1_crearSerie11(5);
            
            System.out.println();
            objSerieCaracter.g1_crearSerie1(5);

            System.out.println("\n");
            objFiguras.showFigura1(5);
            objFiguras.g1_crearFigura3(5);
            objFiguras.g1_crearFigura17(5);
            objFiguras.g1_crearFigura18(5);
            
            System.out.println();
            objCadenaCaract.g1_crearCadena1("Colada Morada");
            objCadenaCaract.g1_crearCadena09("Eres perfecto como eres Coraje");
            
            System.out.println();
            objArrays.dibujarfuncion2X("CrazyApple");
            objArrays.g1_crearArray04("Anthony","Alangasi");

            System.out.println();
            objRecursion.conteoProgresivoRecursivo(1, 5);
            System.out.println();
            objLoading.showLoagin8("LeninAmangandi");
            objLoading.g1_crearLoading11(50);
            
        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }

}
