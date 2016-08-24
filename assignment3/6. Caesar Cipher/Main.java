import java.io.IOException;
import java.util.*;
import java.lang.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	//public final static char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 		
    	//System.out.println(alphabets[1]);
 		Scanner inp = new Scanner(System.in);
 		int testCases = inp.nextInt();
 		int shifts;
 		while(testCases>0){
 			inp.nextLine(); //to clear the buffer of previously stored char
 			String encMessage = inp.nextLine();
 			shifts = inp.nextInt();
 			//String[] word = encMessage.split("");
 			char[] word = encMessage.toCharArray();
 			int[] ascii = new int[word.length];
 			for(int k = 0; k < word.length; k++){
 				ascii[k] = (int) word[k];
 				for(int l = shifts; l > 0; l--){
 					if(ascii[k] <= 65)
 						ascii[k] = 91;
 					ascii[k]--;
 				}
 				word[k] = (char) ascii[k];
 			}

 			
 			for(int k = 0; k < word.length; k++){
 				System.out.print(word[k]);			
 			}
 			System.out.println();
 			//System.out.println(ascii[0]+" "+ascii[1]+" "+ascii[2]);

 			testCases--;
 		}
    }
 
}