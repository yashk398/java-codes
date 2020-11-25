import java.util.*;

public class sync implements Runnable{
	
	Thread create, consume;
	int i = 0;
	
	
	public sync() {
		create = new Thread(this);
		create.setName("create");
		create.start();
			
		consume = new Thread(this);
		consume.setName("consume");
		consume.start();
	}
	
	public void produceData() {
		Random rand = new Random();
		i = rand.nextInt((100 - 0) + 1) + 0;
		System.out.println("Generated "+i);
	}
	public void consumeData() {
		System.out.println("Consumed "+i);
	}
		
	public void run() {
		Thread curr = Thread.currentThread();
		if(curr.getName().equals("create")) {
			for(;;) {
				produceData();
				try {
					Thread.sleep(1000);	
				}
				catch(Exception e) {
					e.printStackTrace();
				}
					
			}
		}
		else if(curr.getName().equals("consume")) {
			for(;;) {
				consumeData();
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
					
			}
		}
	}
	
	public static void main(String[] args) {
		sync object = new sync();
		 
	}

}
