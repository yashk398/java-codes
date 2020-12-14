import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WaterThread extends Frame implements Runnable{
	int cap=100, curr = 10, vol=0, coord=300;
	Thread inlet, outlet, ctrl;
	
	public WaterThread() {
		super("Water Filler");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
		ctrl = new Thread(this);
		ctrl.setName("ctrl");
		ctrl.setDaemon(true);
		ctrl.start();
		inlet = new Thread(this);
		inlet.setName("in");
		inlet.start();
		outlet = new Thread(this);
		outlet.setName("out");
		outlet.start();
		
	}

	@SuppressWarnings("removal")
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("ctrl")) {
			for(;;){
				if(vol<=800) {
					outlet.suspend();
					inlet.resume();
					try {
						Thread.sleep(100);
					}
					catch(Exception e){
						e.printStackTrace();
					}
				}
				else{
					inlet.suspend();
					outlet.resume();
					try {
						Thread.sleep(100);
					}
					catch(Exception e){
						e.printStackTrace();
					}
				}
				
			}
		}
			
		if(currentThread.getName().equals("in")) {
			for(;;) {
				vol+=100;
				curr=curr+10;
				coord-=10;
				repaint();
				try {
					Thread.sleep(100);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				System.out.println(vol);
			}
		}
		if(currentThread.getName().equals("out")) {
			for(;;) {
				vol=vol-100;
				curr=curr-10;
				coord+=10;
				repaint();
				try {
					Thread.sleep(100);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				System.out.println(vol);
			}
		}
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(250, 300, 100, cap);
		g.setColor(Color.CYAN);
		g.fillRect(250, coord+cap, 100, curr);
	}
		
	public static void main(String[] args) {
		Frame om = new WaterThread();
		om.setSize(600, 600);
		om.setBackground(Color.BLACK);
		om.setVisible(true);
	}

}
