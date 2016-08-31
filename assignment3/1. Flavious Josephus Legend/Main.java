import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner inp = new Scanner(System.in);
       int n, x, y;

       n = inp.nextInt();

       for(int  i = 0; i < n; i++){
            x = inp.nextInt();
            y = inp.nextInt();
            System.out.printf("Case %d: %d\n",i+1,flav(x,y)+1);
       }
 
    }

    public static int flav(int x, int y){
        int sum = 0;
        for(int i = 2; i <= x; i++){
            sum = (sum+y)%i;
        }
        return sum;
    }
 
}