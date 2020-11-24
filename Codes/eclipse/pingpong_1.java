
public class pingpong_1 extends Thread{
	Thread tping, tpong;
	public pingpong_1(String threadname) {
		tping.setName(threadname);
		tping.start();
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
		if(currentThread.getName().equals("PONG")) {
			for(int i=0;i<10;i++) {
				System.out.println("PONG");
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
		pingpong_1 ping = new pingpong_1("PING");
		pingpong_1 pong = new pingpong_1("PONG");

	}

}
