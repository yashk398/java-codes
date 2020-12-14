public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		int z = 0;
		try {
			z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e){
			System.out.println ("Can't be divided by Zero"+e);
		}
		finally {
			System.out.println("Continuing to multiplication...");
		}
		z = x*y;
		System.out.println ("The result of multiplication is "+z);
		
		
		try{    
             int a[]=new int[5];    
             a[5]=10/0;    
           }    
        catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
		catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }   
		
		try{
			z= x/y;
		}	
		finally {
			System.out.println("Exception occurs");
		}
		
		System.out.println("Exception occured, you should not see this statement.");
	}

}
