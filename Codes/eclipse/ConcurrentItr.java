import java.util.*;


public class ConcurrentItr implements Runnable {
	Thread add, iterate;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int i = 0;
	
	
	public ConcurrentItr() {
		add = new Thread(this);
		add.setName("add");
		add.start();
			
		iterate = new Thread(this);
		iterate.setName("itr");
		iterate.start();
	}
	@Override
	public void run() {
		Thread curr = Thread.currentThread();
		if(curr.getName().equals("add")) {
			while(i<5) {
				arr.add(1);
				System.out.println(arr);
				try {
					Thread.sleep(500);
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				i++;
			}
		}
		else if(curr.getName().equals("itr")) {
			for(;;) {
				for(Integer i : arr) {
					System.out.println(i);
					try {
						Thread.sleep(100);
						
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
			

		
		
		ConcurrentItr c = new ConcurrentItr();
	}

}
