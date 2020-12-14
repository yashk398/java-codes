import java.util.ArrayList;

public class OPNumbers<T> { 
private T value; 
  
    public OPNumbers(T value) 
    { 
        this.value = value; 
    } 
  
    public String getType() 
    { 
               return String.valueOf(value.getClass().getSimpleName()); 
        
    } 
    
    public String getVal() 
    { 
               return String.valueOf(value); 
        
    } 
  
    public static void main(String[] args) 
    { 
    	ArrayList<String> List = new ArrayList<String>(); 
    	
        OPNumbers<Double> doubleval =  
           new OPNumbers<Double>(3.142); 
        
        OPNumbers<String> temp =  
                new OPNumbers<String>("This");
  
        OPNumbers<Integer> integer =  
                         new OPNumbers<Integer>(9); 
        
        if(doubleval.getType().equals("Integer") || doubleval.getType().equals("Float") || doubleval.getType().equals("Double") || doubleval.getType().equals("Long")) {
        	List.add(doubleval.getVal());
        }
        if(temp.getType().equals("Integer") || temp.getType().equals("Float") || temp.getType().equals("Double") || temp.getType().equals("Long")) {
        	List.add(temp.getVal());
        }
        if(integer.getType().equals("Integer") || integer.getType().equals("Float") || integer.getType().equals("Double") || integer.getType().equals("Long")) {
        	List.add(integer.getVal());
        }
        
        System.out.println(List);
    } 
} 