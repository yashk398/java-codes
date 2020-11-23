import java.util.*;

class Date{
	int day;
	int month;
	int year;
	public Date() {
		this.day = 10;
		this.month = 10;
		this.year = 2020;
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean canVote(Date t) {
		if(this.year+18<=t.year) {
			if(this.month<=t.month) {
				if(this.day<=t.day) {
					
					return true;
				}
			}
		}
		return false;
	}
	
}

class ElectionHouse{
	ArrayList<String> voterList = new ArrayList<String>();	
	ArrayList<String> votersList(HashMap<String, Date> voter, Date t) {
		Iterator<Map.Entry<String, Date>> SetIterator = voter.entrySet().iterator();
        
        while (SetIterator.hasNext())
        {
            Map.Entry<String, Date> e = SetIterator.next();	
	    	if(e.getValue().canVote(t)==true) {
	    		voterList.add(e.getKey());
	    	}
	    		
	    }
	    return voterList;
	}
}

public class Voters {

	public static void main(String[] args){
		Date today = new Date(23, 11, 2020);
		HashMap<String, Date> voter = new HashMap<String, Date>();
		
		voter.put("2020TRFM1", new Date(10,05,1980));
		voter.put("2020TRFM2", new Date(01,01,1999));
		voter.put("2020TRFM3", new Date(10,10,1990));
		voter.put("2020TRFM4", new Date(10,01,2008));
		
		
		
		
		
		ElectionHouse e = new ElectionHouse();
		
		System.out.println(e.votersList(voter, today));
	

	}

}
