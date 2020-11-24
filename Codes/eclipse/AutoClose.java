interface AutoClosable{
	public void close() throws Exception;
}
class MyAutoClosable implements AutoClosable{
	@Override
	public void close() throws Exception {
		System.out.println("MyAutoClosableclosed!");
	}
}



public class AutoClose {
	public static void main(String args[]) {
		MyAutoClosable q = new MyAutoClosable();
		try {
			q.close();
		}
		catch(Exception e) {
			System.out.println("Exception was spotted");
		}
		
		
	}
}
