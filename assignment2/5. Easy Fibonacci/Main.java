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
 		int n = inp.nextInt();
 		int prev = 0, curr = 1, next;
 		///might want to start from 1 check for errors
 		if(n >= 0){
 			System.out.printf("0");
 			if(n == 0)
 				System.out.println();
 			if(n > 0)
 				System.out.printf(" ");
 		}
 		if(n >= 1){
 			System.out.printf("1");
 			if(n == 1)
 				System.out.println();
 			if(n > 1)
 				System.out.printf(" ");
 		}
 		if(n >= 2){
 			for(int i = 2; i < n; i++){
 				next = prev + curr;
 				prev = curr;
 				curr = next;
 				System.out.print(curr);
 				if(i < n-1)
 					System.out.printf(" ");
 				if(i == n-1)
 				System.out.println();
 			}
 		}
    }
 
}