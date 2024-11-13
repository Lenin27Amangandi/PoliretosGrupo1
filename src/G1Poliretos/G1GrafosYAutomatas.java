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


    final String alfabetoGrafo6 = "a-c-e-f-h-i-l-o-r-s-(-)- -";
    final int   er = -1,
                esp = 100,
                     //  a   c   e,  f,   h,  i,  l,   o,  r,  s,  (,  ), esp.
            mtG6[][] =  {
                    {   er, er, 13,  1,  er, 11, er,  er, er, er, er, er, er}// q0
                    , { er, er, er, er,  er, er, er,   2, er, er, er, er, er}// q1
                    , { er, er, er, er,  er, er, er,  er,  3, er, er, er, er}// q2
                    , { er, er,  7, er,  er, er, er,  er, er, er,  4, er,  6}// q3
                    , { er, er, er, er,  er, er, er,  er, er, er, er,  5, er}// q4
                    , { er, er, er, er,  er, er, er,  er, er, er, er, er, esp}// q5
                    , { er, er, er, er,  er, er, er,  er, er, er,  4, er, er}// q6
                    , {  8, er, er, er,  er, er, er,  er, er, er, er, er, er}// q7
                    , { er, 9,  er, er,  er, er, er,  er, er, er, er, er, er}// q8
                    , { er, er, er, er,  10, er, er,  er, er, er, er, er, er}// q9
                    , { er, er, er, er,  er, er, er,  er, er, er,  4, er,  6}// q10
                    , { er, er, er, 12,  er, er, er,  er, er, er, er, er, er}// q11
                    , { er, er, 13, er,  er, er, er,  er, er, er,  4, er,  6}// q12
                    , { er, er, er, er,  er, er, 14,  er, er, er, er, er, er}// q13
                    , { er, er, er, er,  er, er, er,  er, er, 15, er, er, er}// q14
                    , { er, er, 16, er,  er, er, er,  er, er, er, er, er, er}// q15
                    , { er, er, er, er,  er, er, er,  er, er, er, 17, er, 19}// q16
                    , { er, er, er, er,  er, er, er,  er, er, er, er, 18, er}// q17
                    , { er, er, er, er,  er, er, er,  er, er, er, er, er, esp}// q18
                    , { er, er, er, er,  er, er, er,  er, er, er, er, 17, er}// q19
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

    //Pertenece al Grafo6
    @SuppressWarnings("resource")
    private int getIndexAlfabetoG6(String palabra) {
        Scanner scAlfa = new Scanner(palabra).useDelimiter("-");
        for (int indexAlfa = 0; scAlfa.hasNext(); indexAlfa++)
            if (palabra.equals(scAlfa.next()))
                return indexAlfa;
        return -1;
    }
    //Pertenece al Grafo 6
    @SuppressWarnings("resource")
        public void g1_crearAutomata6() {
            System.out.print("\n- Automata 06\n");
            System.out.println("Ingrese un bucle con sus separando sus letras por un guion y un -espacio al final:");
            System.out.println("ejm1: f-o-r-(-)- ");
            System.out.println("ejm2: i-f- -(-)- ");
            System.out.println("ejm3: i-f-e-l-s-e-(-)- ");
            System.out.println("ejm4: e-l-s-e-(-)- ");
            System.out.println("ejm4: f-o-r-e-a-c-h-(-)- ");
            Scanner sc = new Scanner(System.in);
            String lectura = sc.nextLine();
            int q = 0;
            Scanner w = new Scanner(lectura).useDelimiter("-");
            for(int indexAlfa = 0; w.hasNext(); ){
                indexAlfa = getIndexAlfabetoG6(w.next());
                if(indexAlfa < 0 || mtG6[q][indexAlfa] == er)
                    break;
                q = mtG6[q][indexAlfa];
            }
            switch(q){
                case esp: System.out.println("Cadena Valida"); break;
                default: System.out.println("No válido"); break;
            }
            System.out.println();
        }
}
