import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class MainM {//change to main
 
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
 			String[] temp = list.get(i).split(" ");
 			String tem = "";
 			for(int j = 0; j < temp.length; j++){
 				if(temp[j].length()>maxLenWord.length())
 					maxLenWord = temp[j];
 				tem += temp[j].length();
 				if(j!=temp.length-1)
 					tem+="-";
 			}
 			System.out.println(tem);
 		}
 		System.out.println();
 		System.out.println("The biggest word: "+maxLenWord);
    }
 
}