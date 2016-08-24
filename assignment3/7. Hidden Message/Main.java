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
        inp.nextLine();
        for(int i = 0; i < n; i++){
        	//inp.nextLine();
        	String line = inp.nextLine();
        	char[] charac = line.toCharArray();
        	if((int)charac[0]!=32)
        		System.out.print(charac[0]);
        	for(int k = 0; k < charac.length-1; k++){
        		//System.out.println("*"+(int)charac[k]);
        		if((int)charac[k] == 32 && (int)charac[k+1]!=32)
        			System.out.print(charac[k+1]);
        	}
        	System.out.println();
        	
        }
 
    }
 
}