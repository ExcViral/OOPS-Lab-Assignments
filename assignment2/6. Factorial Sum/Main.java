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
        int M = inp.nextInt();
        int N = inp.nextInt();
        System.out.println( factorial(M) + factorial(N) );
    }

    public static long factorial(int n){
    	long factorial = 1;
    	for(int i = 1; i <= n; i++)
    		factorial *= i;
    	return factorial;
    }
}