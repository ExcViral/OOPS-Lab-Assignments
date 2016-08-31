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
        while (true) {
			int n = inp.nextInt();
			if (n == 0)
				break;

			int[] arr = new int[n];
			for (int i = 0; i < n; ++i)
				arr[i] = inp.nextInt();

			int count = mS(arr, 0, n - 1);
			System.out.println(count % 2 == 0 ? "Carlos" : "Marcelo");
		}

    }

    public static int m(int[] A, int l, int mid, int r) {
		int count = 0;
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		for (int i = 0; i < n1; ++i)
			L[i] = A[l + i];
		for (int i = 0; i < n2; ++i)
			R[i] = A[mid + i + 1];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		for (int k = l; k <= r; ++k)
			if (L[i] <= R[j]) {
				A[k] = L[i];
				++i;
			} else {
				A[k] = R[j];
				++j;
				count += n1 - i;
			}
		return count;
	}

	public static int mS(int[] A, int l, int r) {

		if (l >= r)
			return 0;

		int mid = (l + r) / 2;
		int count = 0;
		count += mS(A, l, mid);
		count += mS(A, mid + 1, r);

		count += m(A, l, mid, r);

		return count;
	}
 
}