package Com.Stackroute.Demo.PE2;

import java.util.Scanner;

public class MainCode1 {
	
		public  boolean checkValue(String s) {
			String n=s; 
			String reverse="";
			
			 for(int i = n.length() - 1; i >= 0; i--)
		        {
		            reverse = reverse + n.charAt(i);
		        }
			
			if(n.equals(reverse)) {
				return true ;
			}
			else {
				return false;
							}			
		}
		
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter an input to be reversed ");
	String input=sc.nextLine();
	MainCode1 obj=new MainCode1();
	System.out.println(obj.checkValue(input));

}
}
