import java.util.Scanner;

class chatroom{
	public String id;
	public boolean status;
	public chatroom(String id) {
		this.id = id;
	}
	
	
}

class user{
	protected String userid;
	private String pass;
	public String name;
	public boolean available=false;
	public boolean loggedin=false;
	
	public void createUser(String name, String userid, String passwrd){
		if(this.available!=true) {
			this.userid = userid;
			this.pass = passwrd;
			this.name = name;
			this.available = true;
		}
		else {
			System.out.println("This user is already available, sign in instead");
		}
	}
	
	public void deleteUser() {
		if(this.available==true) {	
			this.userid = null;
			this.pass = null;
			this.name = null;
			this.available = false;
		}
		else {
			System.out.println("This user has already been deleted, create a new user please");
		}
	}
	
	public void login(String uid, String pass, String channel){
		if(uid==this.userid&&pass==this.pass) {
			this.loggedin=true;
		}
		else {
			System.out.println("Incorrect User Id or Password");
		}
	}
	
	
}


public class CMD_CHAT {
	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		user[] activeuser = new user[5];
		chatroom active = new chatroom(null);
		int c = 0;
		int ch = 0;
		int c_act=0;
		String tempchoice = "";
		do {
			System.out.println("Please Select an option : ");
			ch = sc.nextInt();
			switch(ch) {
				case 1: System.out.println("Enter chat room name to create : ");
						String id =  sc.nextLine();
						active = new chatroom(id);
						break; 
				case 2: System.out.println("Currently, "+c+"/5 users are already signed up, selct a slot first : ");
						c_act = sc.nextInt();
						System.out.println("Enter your name, a new userid and a password : ");
						String name =  sc.nextLine();
						String userid =  sc.nextLine();
						String pass =  sc.nextLine();
						activeuser[c_act] = new user();
						if(activeuser[c_act].available==true) {
							System.out.println("User already exists in this slot, do you wish to overwrite? Y/N");
							tempchoice = sc.nextLine();
							if(tempchoice=="Y")
								activeuser[c_act].createUser(name, userid, pass);
							else {
								break;
							}
						}
						else {
							activeuser[c_act].createUser(name, userid, pass);
						}
						break;
				case 3: System.out.println("Currently, "+c+"/5 users are already signed in, selct a slot first : ");
						c_act = sc.nextInt();
						if(activeuser[c_act].available==true) {
							System.out.println("User already exists in this slot, do you wish to overwrite? Y/N");
							tempchoice = sc.nextLine();
							if(tempchoice=="Y") {
								System.out.println("Enter your username : ");
								userid =  sc.nextLine();
								sc.nextInt();
								System.out.println("Enter your password : ");
								pass =  sc.nextLine();
								activeuser[c_act].login(userid, pass, active.id);
							}
							else {
								break;
							}
						}
						
						
						
						break; 
				default: System.out.println("Wrong Option Selected ... ");
					break; 
			}
		}while(ch!=0);
	}
}
