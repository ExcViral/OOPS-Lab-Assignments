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
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner inp = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        boolean i=true;
        String temp;
        //for taking in the list of inputs
        while(i){
            temp = inp.nextLine();
            numbers.add(temp);
            if(Integer.parseInt(temp)==0)
                i=false;
        }
        //display(numbers);
        for(int k=0; k<numbers.size()-1; k++){
            System.out.println(ACM(Integer.parseInt(numbers.get(k))));
        }
    }

    public static int power(int n, int p){
        int ans=1;
        for(int i=1; i<=p; i++){
            ans*=n;
        }
        return ans;
    }

    public static int ACM(int num){
        int acm = 0,l,tempNum=num;
        int temp;
        int f = digitCounter(num);
        int d = f;
        l = power(10,d-1);
        if(f!=1){
            while(l!=1){
                temp=tempNum%l;
                acm+=((tempNum-temp)/l)*factorial(f);
                f--;
                l=l/10;
                tempNum=temp;
            //System.out.println("temp = "+temp);
                if(l==1)
                    acm+=temp;
            }
        }
        else{
            return num;
        }
        //acm+=temp;
        return acm;
    }

    public static int factorial(int n){
    	int factorial = 1;
    	for(int i = 1; i <= n; i++)
    		factorial *= i;
    	return factorial;
    }

    public static int digitCounter(int n){
        int counter=1,k=10;
        while(n%k!=n){
            counter++;
            k*=10;
        }
        return counter;
    }
}