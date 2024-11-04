package G1Poliretos;
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

    public void g1_crearCadena09(String frase){

        String fraseMod = "";
        int longitud = frase.length(), aux = 1;
        char [] caracter = new char[0];
        caracter = frase.toLowerCase().toCharArray();

        System.out.println("\nCadena Caracteres 09:");

        for(int i = 0; i < longitud; i++){

            if(caracter[i] == ' '){
                fraseMod += String.valueOf(caracter[i]);
            }
            
            if(aux % 2 == 0 && caracter[i] != ' '){
                fraseMod += String.valueOf(caracter[i]);
                aux++;
            }
            else if (aux % 2 != 0 && caracter[i] != ' ') {
                fraseMod += String.valueOf(caracter[i]).toUpperCase();
                aux++;
            }
        }
        
        System.out.println(fraseMod);
    }
}
