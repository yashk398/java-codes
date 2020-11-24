import java.util.*;



class person{
	protected String name;
	protected int height;
	protected int weight;
	
	public person(){
		this.name = "NA";
		this.height = 170;
		this.weight = 65;
	}
	public person(String name, int ht, int wt){
		this.name = name;
		this.height = ht;
		this.weight = wt;
	}
	


	int getWt() {
		return this.weight;
	}

	int getHt() {
		return this.height;
	}
	
	String getName() {
		return this.name;
	}
}

class CompareStats extends person{
	public CompareStats(person[] p, int len) {
		for(int i=0; i<len; i++) {
			System.out.println(p[i].weight);
		}
	}
}



public class personStatsCompare {

	public static void main(String[] args) {
		
		person[] p = new person[5];
		p[0] = new person("Alex", 175, 71);
		p[1] = new person("Alexa", 171, 61);
		p[2] = new person("Pheneas", 185, 90);
		p[3] = new person("Tom", 180, 80);
		p[4] = new person("Jerry", 171, 75);
		CompareStats c = new CompareStats(p, 5);
	}

}
