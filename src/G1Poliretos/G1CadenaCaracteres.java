package G1Poliretos;

import java.util.Arrays;
import java.util.Scanner;

public class G1CadenaCaracteres {
    
    public void g1_crearCadena1(String frase){
        
        int longitud = frase.length(), numeroVocales = 0;
        char [] caracter = new char[0];
        caracter = frase.toLowerCase().toCharArray();

        for(int i = 0; i < longitud; i++){
            if(caracter[i] == 'a' || caracter[i] == 'e' || caracter[i] == 'i' || caracter[i] == 'o' || caracter[i] == 'u'){
                numeroVocales++;
            }
        }
        System.out.println("La frase tiene " +numeroVocales+ " vocales.");
    }

    public void g1_crearCadena2(String frase){
        
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < frase.length(); i++) {
            char letraActual = frase.toLowerCase().charAt(i);
            boolean esVocal = false;
            for (char vocal : vocales) {
                if (letraActual == vocal) {
                    esVocal = true;
                    break;
                }
            }
            if (!esVocal) {
                contador++;
            }
        }
        System.out.println("La frase: " + frase + " contiene " + contador + " letras.");
    }       
    

    public void g1_crearCadena3() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();
        
        System.out.print("Ingresa una vocal para eliminar: ");
        char vocal = sc.next().toLowerCase().charAt(0); 
        
        StringBuilder fraseModificada = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.toLowerCase(caracter) != vocal) {
                fraseModificada.append(caracter);
            }
        }
        System.out.println("Frase sin la vocal '" + vocal + "': " + fraseModificada.toString());
    }

    public void g1_crearCadena4(String frase){
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingresa una frase:");
        System.out.print("Ingresa una letra a eliminar:");
        char letraEliminar = reader.next().charAt(0);
        String fraseSinLetra = frase.replace(String.valueOf(letraEliminar), " ");
        System.out.println("Frase resultante: " + fraseSinLetra);
    }
    
    public String g1_crearCadena5(String frase){
        StringBuilder resultado = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);   
            if (esVocal(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }     
    private boolean esVocal(char c) {
        char caracterEnMinuscula = Character.toLowerCase(c);
        return caracterEnMinuscula == 'a' || caracterEnMinuscula == 'e' || caracterEnMinuscula == 'i'
                || caracterEnMinuscula == 'o' || caracterEnMinuscula == 'u';
    }

    public void g1_crearCadena6(String palabraOriginal) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = palabraOriginal.length() - 1; i >= 0; i--) {
            char caracter = palabraOriginal.charAt(i);
            if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) {
                palabraInvertida.append(caracter);
            } else {
                palabraInvertida.append(Character.toUpperCase(caracter));
            }
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

    public void g1_crearCadena7(String palabraOrigial){
        palabraOrigial = palabraOrigial.toUpperCase();
        StringBuilder palabraAlterada = new StringBuilder();
        for(int i=0;i<palabraOrigial.length();i++){
            if(palabraOrigial.charAt(i)!= 'J'){
                palabraAlterada.append(palabraOrigial.charAt(i));
            }
        }
        System.out.println("Palabras sin J y Mayúsculas: "+palabraAlterada);
    }
    
    public void g1_crearCadena08() {
        
        Scanner sc = new Scanner(System.in);
        
        int aleatorio=1;
        int intentos=0;
        
        String [] anagramas={"delira","lidera","ballena","llenaba","alondra","ladrona","espana","apanes","enrique","quieren"};
        aleatorio=(int)(Math.random()*anagramas.length);
            System.out.println(anagramas[aleatorio]);
            
        char [] palabras1=anagramas[aleatorio].toCharArray();
        Arrays.sort(palabras1);
        String anagramas2 = new String (palabras1);
        
        System.out.println("Ingresa el anagrama: ");
        while(intentos<3){
            String entrada = sc.nextLine();
            char [] palabras2=entrada.toCharArray();
            Arrays.sort(palabras2);
            String anagramas3 = new String (palabras2);
            if (anagramas2.equals(anagramas3)){
                System.out.println("Anagrama correcto" );
                break;
            }else{
                intentos++;
                System.out.println("Error" );
            }
        }
        if (intentos == 3 &&  aleatorio%2 ==0 ){
            System.out.println("La respuesta correcta es " + anagramas[aleatorio+1] );
        }else{
            System.out.println("La respuesta correcta es " + anagramas[aleatorio-1] );
        }
    }
       

    public void g1_crearCadena09(String frase){
        String fraseMod = "";
        int longitud = frase.length(), aux = 0;
        char [] caracter = new char[0];
        caracter = frase.toLowerCase().toCharArray();

        System.out.println("\nCadena Caracteres 09:");

        for(int i = 0; i < longitud; i++){

            aux++;
            
            if(caracter[i] == ' '){
                fraseMod += String.valueOf(caracter[i]);
                aux--;
            }

            if (aux % 2 != 0 && caracter[i] != ' ') {
                fraseMod += String.valueOf(caracter[i]).toUpperCase();
            }
            
            if(aux % 2 == 0 && caracter[i] != ' '){
                fraseMod += String.valueOf(caracter[i]);
            }
            
        }
        
        System.out.println(fraseMod);
    }
}
