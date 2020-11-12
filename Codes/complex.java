public class complex{
	double a;
	double b;
	public complex(double a,double b){
		this.a = a;
		this.b = b;
	}
	public static complex add(complex x,complex y){
		complex temp = new complex(0.0,0.0);
		temp.a = x.a+y.a;
		temp.b = x.b+y.b;
		return temp;
	}
	public static complex subtr(complex x,complex y){
		complex temp = new complex(0.0,0.0);
		temp.a = x.a-y.a;
		temp.b = x.b-y.b;
		return temp;
	}
	public static void main(String args[]){
		complex x = new complex(15.75,20.50);
		complex y = new complex(7.5,10.5);
		complex answer;
		answer = add(x,y);
		System.out.print("\nThe sum is : "+answer.a+"+i"+answer.b);
		answer = subtr(x,y);
		System.out.print("\nThe difference is : "+answer.a+"+i"+answer.b);
	}
}