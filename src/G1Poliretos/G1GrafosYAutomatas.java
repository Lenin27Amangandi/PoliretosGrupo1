package G1Poliretos;

import java.util.Scanner;

public class G1GrafosYAutomatas {

    final String alfabeto = "a-b-c-."; 
    final int err    = -1,
              valido = 100,
              matriz_transicion[][] = {// a       b        c      point
                                         {1      ,2       ,3      ,err   } //q0
                                        ,{1      ,err     ,err    ,valido} //q1
                                        ,{err    ,2       ,err    ,valido} //q2
                                        ,{err    ,err     ,3      ,valido} //q3
                                    };

    final String alfabeto2 = "a-b-c-d-e-f-g-h-i-j-k-l-m-n-o-p-q-r-s-t-u-v-w-x-y-z-1-2-3-4-5-6-7-8-9-_-$-;"; 
    final int var_valida = 100,
          matriz_transicion2[][] = {// a       b       c       d       e        f         g         h        i         j         k        l       m       n       o        p        q       r        s        t       u      v       w        x       y       z       1          2        3         4         5         6         7        8       9         _        $         ;
                                     {1      ,1       ,1      ,1      ,1       ,1        ,1        ,1        ,1        ,1       ,1       ,1      ,1      ,1       ,1      ,1       ,1      ,1       ,1       ,1      ,1      ,1      ,1      ,1      ,1      ,1      ,err      ,err      ,err      ,err      ,err      ,err      ,err     ,err     ,err     ,1       ,1      ,err        }  //q0
                                    ,{1      ,1       ,1      ,1      ,1       ,1        ,1        ,1        ,1        ,1       ,1       ,1      ,1      ,1       ,1      ,1       ,1      ,1       ,1       ,1      ,1      ,1      ,1      ,1      ,1      ,1      ,1        ,1        ,1        ,1        ,1        ,1        ,1       ,1       ,1       ,1       ,1      ,var_valida }  //q1
                                };

    @SuppressWarnings("resource")
    private int indiceColumna(String palabra){

        Scanner scan = new Scanner(alfabeto).useDelimiter("-");
        for(int indice = 0; scan.hasNext(); indice++){
            if(palabra.equals(scan.next())){
                return indice;
            }
        }
        return -1;
    }

    public void g1_crearAutomata03(String palabra){
        
        int q = 0;
        Scanner word = new Scanner(palabra).useDelimiter("-");
    
        for(int indice = 0; word.hasNext(); ){
                indice = indiceColumna(word.next());
                if (indice < 0 || matriz_transicion[q][indice] == err)
                    break;
                q = matriz_transicion[q][indice];
            }

        switch (q) {
                case valido:    System.out.println("Palabra válida"); break;                
                default:        System.out.println("Error, palabra desconocida");
            }
        word.close();
    }
    
    @SuppressWarnings("resource")
    private int indiceColumna1(String variable){

        Scanner scan = new Scanner(alfabeto2).useDelimiter("-");
        for(int indice = 0; scan.hasNext(); indice++){
            if(variable.equals(scan.next())){
                return indice;
            }
        }
        return -1;
    }

    public void g1_crearAutomata05(String variable){
        
        int q = 0;
        Scanner word = new Scanner(variable).useDelimiter("-");
    
        for(int indice = 0; word.hasNext(); ){
                indice = indiceColumna1(word.next());
                if (indice < 0 || matriz_transicion2[q][indice] == err)
                    break;
                q = matriz_transicion2[q][indice];
            }

        switch (q) {
                case var_valida:    System.out.println("Variable válida"); break;                
                default:            System.out.println("Error de sintaxis");
            }
        word.close();
    }
}
