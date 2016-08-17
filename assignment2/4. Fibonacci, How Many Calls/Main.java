import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
	static int calls = -1;
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
		 
		 Scanner inp = new Scanner(System.in);
		 int testCases = inp.nextInt();
		 

		 int fib = 0;
		 
		 //for(int i = 0; i < integers.length; i++){
			 fib = fibo(testCases);
			 System.out.println("fib("+calls+") = "+fib+" calls = "+testCases);
		 //}
 
    }
	
	public static int fibo(int n){
		
		calls++;
		
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibo(n-1) + fibo(n-2);
		
	}
 
}