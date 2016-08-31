import java.util.*;
import java.lang.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int max=0;
		String big="";
		for(int i=0;;i++){	
			String message=sc.nextLine();
			if(message.charAt(0)=='0'){
				break;
			}
			String[] word=message.split("\\s+");
			for(int j=0;j<word.length;j++){
				if(j==word.length-1){
					System.out.print(word[j].length());
					System.out.println();
				}
				else{
					System.out.print(word[j].length()+"-");
				}
				
				if(word[j].length()>=max){
					max=word[j].length();
					big=word[j];
				}
			}
			
		}
		System.out.println();
		System.out.println("The biggest word: " + big);
	}
}