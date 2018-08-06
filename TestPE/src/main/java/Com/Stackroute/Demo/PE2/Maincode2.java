package Com.Stackroute.Demo.PE2;

public class Maincode2 {
	 public static void main(String[] args)
	   {  Maincode2 o = new Maincode2();
	       int test_no = 64;
	       if(o.isPower(test_no) == true)
	        System.out.println(test_no + 
	                          " is a power of 4");
	       else
	        System.out.println(test_no + 
	                          "is not a power of 4");
	   }


   public boolean isPower(int n)
   {
       if(n == 0)
       return false;
       while(n != 1)
       { 
           if(n % 4 != 0)
           return false;
           n = n / 4;     
       }
       return true;
   } 
   }

  
