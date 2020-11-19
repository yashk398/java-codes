import java.util.concurrent.*;

public class BannerEffect{
	public static void main(String args[]){
		StringBuilder s = new StringBuilder(" Welcome To Java ");
		int l = s.length();
		System.out.println("Ctrl+C to Interrupt and Exit. Total Duration ~1.8sec");
		for(int i = 0; i<l; i++){
			s.append(s.charAt(0));
			s.delete(0, 1);
			
			for(int j = 1; j<l; j++){
				
			}
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			System.out.print(s+"\r");
		}
	}
}