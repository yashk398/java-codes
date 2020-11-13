abstract class Persistence{
	abstract void persist();
}

class FilePersistence extends Persistence{
	void persist(){
		System.out.println("\ndata persisted into file\n");
	}
}
class DataBasePersistence extends Persistence{
	void persist(){
		System.out.println("\ndata persisted into database\n");
	}
}

public class savefile{
	public static void main(String args[]){
		Persistence p[] = new Persistence[3];
		p[0] = new DataBasePersistence();
		p[1] = new DataBasePersistence();
		p[2] = new FilePersistence();
		
		for(int i=0;i<p.length;i++){
			p[i].persist();
		}
	}
}