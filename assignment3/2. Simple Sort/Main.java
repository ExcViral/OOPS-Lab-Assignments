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
 		int[] arr = new int[3];
 		int[] tempArr = new int[3];
 		
 		Scanner inp = new Scanner(System.in);
 		for(int i = 0; i < 3; i++){
 			arr[i] = inp.nextInt();
 			tempArr[i] = arr[i];
 		}
 		
 			Arrays.sort(arr);

 		for(int i = 0; i < 3; i++)
 			System.out.println(arr[i]);

 		System.out.println();

 		for(int i = 0; i < 3; i++)
 			System.out.println(tempArr[i]);

    }
 
}