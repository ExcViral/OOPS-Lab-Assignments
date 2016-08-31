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
        for(int i = 0; i < n; i++){
        	int l = inp.nextInt();
        	int[] train = new int[l];
        	for(int j = 0; j < l; j++)
        		train[j] = inp.nextInt();
        	swaps(train);
        }
 
    }

    public static void swaps(int[] arr){
    	int n = arr.length;
    	int counter = 0;
    	for(int i = 0; i < n; i++){
    		for(int j = 1; j < (n-i); j++){
    			if(arr[j-1]>arr[j]){
    				int temp = arr[j-1];
    				arr[j-1] = arr[j];
    				arr[j] = temp;
    				counter++;
    			}
    		}
    	}
    	System.out.println("Optimal train swapping takes "+counter+" swaps.");
    }
 
}