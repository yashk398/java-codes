
public class pingpong implements Runnable{
	Thread tping, tpong, ttong;
	public pingpong() {
		tping = new Thread(this);
		tping.setName("PING");
		tping.start();
		tpong = new Thread(this);
		tpong.setName("PONG");
		tpong.start();
		ttong = new Thread(this);
		ttong.setName("TONG");
		ttong.setDaemon(true);
		ttong.start();
	}
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("PING")) {
			for(int i=0;i<10;i++) {
				System.out.println("PING");
				try {
					Thread.sleep(500);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("PONG")) {
			for(int i=0;i<10;i++) {
				System.out.println("\tPONG");
				try {
					Thread.sleep(500);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("TONG")) {
			for(;;) {
				System.out.println("\t\tTONG");
				try {
					Thread.sleep(500);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		pingpong p = new pingpong();

	}

}
