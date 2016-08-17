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
         double x1, y1, x2, y2;
         x1 = inp.nextDouble();
         y1 = inp.nextDouble();
         x2 = inp.nextDouble();
         y2 = inp.nextDouble();
         double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
         System.out.printf("%.4f\n",distance);
 
    }
}