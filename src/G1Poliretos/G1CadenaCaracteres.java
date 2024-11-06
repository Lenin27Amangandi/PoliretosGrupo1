package G1Poliretos;

import java.util.Arrays;
import java.util.Scanner;

public class G1CadenaCaracteres {
    
    public void g1_crearCadena1(String frase){
        
        int longitud = frase.length(), numeroVocales = 0;
        char [] caracter = new char[0];
        caracter = frase.toLowerCase().toCharArray();

        System.out.println("\nCadena Caracteres 1:");

        for(int i = 0; i < longitud; i++){
            if(caracter[i] == 'a' || caracter[i] == 'e' || caracter[i] == 'i' || caracter[i] == 'o' || caracter[i] == 'u'){
                numeroVocales++;
            }
        }

        System.out.println("La frase tiene " +numeroVocales+ " vocales.");
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
