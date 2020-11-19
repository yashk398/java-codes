public class StringSort{
	public static void main(String args[]){
		int[] nos = new int[args.length];
		for(int i=0; i<args.length; i++){
			nos[i] = Integer.parseInt(args[i]);
		}
		
		for(int i = 0; i<nos.length-1; i++){
			for(int j = i+1; j<nos.length; j++){
				if(nos[j]<nos[i]){
					int temp = nos[i];
					nos[i] = nos[j];
					nos[j] = temp;
				}
			}
		}
		System.out.println("After sorting the array ");
		for(int i=0; i<nos.length; i++){
			System.out.println(i+". "+nos[i]);
		}
	}

}