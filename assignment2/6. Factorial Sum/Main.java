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
        int N,M;
		long total;
		
		while(true){
			total = 0;
			if(inp.hasNextInt())
				M = inp.nextInt();
			else
				break;
			
			if(inp.hasNextInt())
				N = inp.nextInt();
			else
				break;
			
			total = factorial(M) + factorial(N);
			System.out.println(total);
		}
		
	}

    public static long factorial(int n){
		long fac = 1;
        int i;

        for(i = 2; i <= n; i++)
			fac *= i;

        return fac;
    }
}