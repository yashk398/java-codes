public class queue{
	private int maxSize;
	private long[] queueArray;
	private int end;
	public queue(int s){
		maxSize = s;
		queueArray = new long[maxSize];
		end = 0;
	}
	
	public int queueFull(){
		if(end==maxSize){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public void enqueue(int val){
		if(queueFull()==0){
			queueArray[end]=val;
			end++;
		}
		else{
			System.out.print("\nQueue Is Full\n");
		}
	}
	
	public void dequeue(){
		int i = 0;
		while(i<end-1){
			queueArray[i]=queueArray[i+1];
			i++;
		}
		end--;
	}
	
	public void print(){
		int i = 0;
		while(i<end){
			System.out.print("\n"+queueArray[i]);
			i++;
		}
	}
	
	public static void main(String args[]){
		queue q = new queue(5);
		q.print();
		q.enqueue(15);
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(18);
		q.enqueue(1);
		q.dequeue();
		q.print();
		q.enqueue(10);
		q.enqueue(10);
		q.enqueue(10);
		q.print();
	}
}