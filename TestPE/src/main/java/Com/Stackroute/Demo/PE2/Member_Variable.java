package Com.Stackroute.Demo.PE2;

 class Member {
		String s; 
		int i; 
		double d;}
	
 
public class Member_Variable{
	public String getVal(String res) {
		System.out.println(res);
				return res;
	}
	public static void main() {
		
			Member m = new Member();
				 m.s = "Shweta";
				 m.i=22;
				 m.d=6000.00;
				 String s1=m.s+" "+m.i+" "+m.d;
				 Member_Variable m1 = new Member_Variable();
				 m1.getVal(s1);
	}
	
		}
		
		


