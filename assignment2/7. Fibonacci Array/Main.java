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
        int testCases = inp.nextInt();
        int[] numbers = new int[testCases];
        for(int i = 0; i < testCases; i++)
            numbers[i] = inp.nextInt();
        for(int i = 0; i < testCases; i++)
            System.out.println("Fib("+numbers[i]+") = "+Fib(numbers[i]));
    }

    public static long Fib(int n){
        long prev = 0, curr = 1, next;
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        for(int i = 2; i <= n; i++){
            next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}