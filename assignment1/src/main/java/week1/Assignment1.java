

import java.util.*;
import java.math.BigDecimal;

/** Assignment1: Basic Java
 * In this assignment, focus on each method at once.
 * Step 1: Compile the code and resolve the compilation errors for that particular method, if any,
 * Step 2: Implement the body for that method if missing.
 * Step 3: Make all the test cases pass.
 */
public class Assignment1 {
	/** Adds two integers.
   */
  public static int add(int a, int b) { // replaced void by int
    return a+b; // added a+b instead of 0
  }
   /*divide two number*/
  public static double divide(double a, double b) { //replaced int by double
	  return (double)a / (double)b; // added a new return statement
  }
    /*read integer input from user*/
  public static int input_int(){
    //made whole new addition  below here
	Scanner inp = new Scanner(System.in);
	System.out.print("Please enter an integer : ");
	int a = inp.nextInt();
	return a;
	//made whole new addition above here
  }
    /*print values of a and b after swaping without using third variable and also return (a-b) after swaping.*/
  public static int swap(){
    int a =input_int();// replaced string to int
    int b = input_int();//replaced string to int
	//logic below from here
		a=a+b;
		b=a-b;
		a=a-b;
	//logic above from here
    System.out.println("a = "+a); //changed here
    System.out.println("b = "+b); //changed here
    return (a-b); //changed return statement
  }
      /*return the modullo of two numbers*/
  public static float modullo(float a,float b){ // changed void to float
		return (float) a % (float) b; //added return statement
  }

        /* output the highest common factor of two numbers*/
  public static int HCF(int a, int b){
		//logic below from here
			int temp;
			while(b != 0){
				temp = b;
				b = a % b;
				a = temp;
			}
		//logic above from here
		return a;
  }
      /* output the Least common multiple of two numbers*/
  public static int LCM(int a, int b){
		//logic below from here
		int hcf = HCF(a , b), lcm;
		lcm = (int)(a * b) / (int)hcf;
		//logic above from here
		return lcm;
  }

  /** Implement the methd to find Nth Fibonacci number using BigDecimal.
   * Refer this page: https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html
   */
 public static BigDecimal fibonacci(int n) {
	BigDecimal prev = new BigDecimal(1);
	BigDecimal curr = new BigDecimal(1);
	BigDecimal next = new BigDecimal(1);
	BigDecimal negative = new BigDecimal(-1);
	
	if(n > 0){
		for(int i = 3; i <= n; i++){
			next = prev.add(curr);
			prev = curr;
			curr = next;
		}
	return next;
	}
	return negative;
  }

  /** Nth factorial number.
   * If the facorial is going to overflow, return -1 otherwise return correct factorial value.
   * Hint: You can use Long.MAX_VALUE
   */
 public static long factorial(int n) {
	  //added Logic Below
	  long fact = 1;
	  if(n >= 1 ){
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
	  }
	  else if(n == 0)
		  fact = 1;
	  
	  else
		  return -1;
	//added logic above
	if(fact < 0)
		return -1;
	else
	return fact; //changet return statement
  }
  
  //addition of main function
  
  public static void main(String[] args){
	 
	  System.out.println(divide(5,3));
  }
  

}
