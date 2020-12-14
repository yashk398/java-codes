public class generics<T> { 
private T value; 
  
    public generics(T value) 
    { 
        this.value = value; 
    } 
  
    public void showType() 
    { 
        System.out.println("Type:" +  
            value.getClass().getSimpleName()); 
        System.out.println("Value: " + value); 
    } 
  
    public static void main(String[] args) 
    { 
        generics<String> Str =  
           new generics<String>("Generics"); 
  
        generics<Integer> integer =  
                         new generics<Integer>(9); 
  
        Str.showType(); 
        integer.showType(); 
    } 
} 