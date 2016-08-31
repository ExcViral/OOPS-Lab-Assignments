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
        int n, m;
        n = inp.nextInt();
        m = inp.nextInt();
        ArrayList<Integer> origArr = new ArrayList<Integer>();
        ArrayList<Integer> sortArr = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
        	int temp;
        	temp = inp.nextInt();
        	origArr.add(temp);
        }

        for(int i = 0; i < m; i++){
        	for(int j = 0; j < origArr.size(); j++){
        		//System.out.println(origArr.get(j)+"%"+m+"="+origArr.get(j)%m);
        		if(origArr.get(j)%m == i){
        			//System.out.println("***"+origArr.get(j)+"%"+m+"="+origArr.get(j)%m);
        			sortArr.add(origArr.get(j));
        			origArr.remove(j);
        			j--;
        	//for(int k = 0; k < origArr.size(); k++)
        	//System.out.print(origArr.get(k)+" ");
        		}
        	}
        }

        for(int i = 0; i < sortArr.size(); i++)
        	System.out.print(sortArr.get(i)+" ");

 
    }
 
}