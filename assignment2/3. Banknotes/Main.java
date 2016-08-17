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
		 int[] notes = {100, 50, 20, 10, 5, 2, 1};
		 int[] numNotes = new int[7];
		 int remainder = 0;
		 int amount = inp.nextInt();
		 
		 System.out.println(amount);
		 
		 for(int i=0; i< notes.length; i++){
			 numNotes[i] = calcNotes(amount, notes[i], remainder);
			 amount = amount % notes[i];
			 System.out.println(numNotes[i]+" nota(s) de R$ "+ notes[i]+",00");
		 }
 
    }
	
	public static int calcNotes(int amount, int note, int remainder){
		if(amount>=note){
			remainder = amount % note;
			return (amount - remainder)/note;
		}
		else{
			return 0;
		}
	}
 
}