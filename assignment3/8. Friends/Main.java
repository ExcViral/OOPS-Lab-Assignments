import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static int max = 512;
    public static char[] alp = new char[26];
    public static char[] str = new char[10000];
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner inp = new Scanner(System.in);

        //make input mechanism

        //
        while(true){
            //loop stoping mech
            solveCase();
        }

    }

    //public static char summe(char[] r, char[] str);

    public static char faktor(char[26] r, char[] str){
        int i, j;
        char[] ss;//doubt
        if(str[0] == '('){
            ss = summe(r, str[1]);
            return ss[1];
        }
        else{
            for(i = 0; i <26; i++)
                r[i] = 0;
            for(i = 1; str[i]!='}';i++)
                r[str[i] - 'A'] = 1;
            return str[i+1];
        }
    }

    public static char produkt(char[26] r, char[] str){
        char[] a1 = new char[26];
        char[] a2 = new char[26];
        char[] ss;
        int i;
        ss = faktor(r,str);
        while(ss[0] == '*'){
            ss = faktor(a2,ss[1]);
            for(i = 0; i < 26; i++)
                r[i] = (r[i] && a2[i]);
        }
        return ss;
    }

    public static char summe(char[26] r, char str){
        char[] a2 = new char[26];
        char[] ss;
        char v;
        int i;
        ss = produkt(r,str);
        while((ss[0]=='+') || (ss[0]=='-')){
            v = ss[0];
            ss = produkt(a2, ss[1]);
            for(i = 0; i < 26; i++){
                if (v=='+')
                    r[i]=(r[i]||a2[i]);
                else if (a2[i]) 
                    r[i]=0;
            }
        }
        return ss;
    }

    public static void solveCase(){
        int i;
        for(i = 0; i < 26; i++)
            alp[i] = 0;
        summe(alp,str);
        System.out.printf("{");
        for(i = 0; i < 26; i++){
            if(alp[i])
                System.out.printf("%c","A"+i);/////maybe single inv comma
        }
        System.out.printf("}\n");
    }

 
}