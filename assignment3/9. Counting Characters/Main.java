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
        ArrayList<String> list = new ArrayList<String>();
 		while(true){
 			String temp = inp.nextLine();
 			list.add(temp);
 			if(temp.length() == 1)
 				if((int)temp.charAt(0) == 48)//Integer.parseInt(temp) == 0)
 					break;
 		}

 		String maxLenWord = "";

 		for(int i = 0; i < list.size()-1; i++){
 			String temp;//toAdd logic for maxLen
 			int counter = 0, prevJ = 0;
 			ArrayList<String> cc = new ArrayList<String>();
 			temp = list.get(i);
 			int j;
 			for(j = 0; j < temp.length(); j++){
 				if((int)temp.charAt(j) == 32){
 					cc.add(""+counter);
 					if(maxLenWord.length()<counter){
 						maxLenWord="";
 						for(int l = prevJ; l < j; l++)
 							maxLenWord+=temp.charAt(l);
 					}
 					counter=0;
 					prevJ = j+1;
 				}
 				else
 					counter++;
 			}

 			cc.add(""+counter);
 			if(maxLenWord.length()<counter){
 				maxLenWord="";
 				for(int l = prevJ; l < j; l++)
 					maxLenWord+=temp.charAt(l);
 			}
			
			for(int v = 0; v < cc.size(); v++){
				char t = cc.get(v).charAt(0);
				if((int)t == 48)
					cc.remove(v);
			}

 			for(int k = 0; k < cc.size(); k++){
				
					System.out.print(cc.get(k));
 					if(k != (cc.size()-1))
 						System.out.print("-");
				
 			}
 			System.out.println();
 		}
 		System.out.println();
 		System.out.println("The biggest word: "+maxLenWord);
    }
 
}