import java.util.Scanner;
public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username="csc-200", password="nova",inputusername="",inputpassword="";
Scanner keyboard=new Scanner(System.in);
int i=1;
System.out.println("Enter the username.(csc-200)");
inputusername=keyboard.next();
System.out.println("Enter the password.(nova)");
inputpassword=keyboard.next();																										
for(i=1;i<3;i++){
	if(inputusername.equals(username)&&inputpassword.equals(password))
	{System.out.println("Welcome "+username+"!");return;}
	else{System.out.println("Enter the username.(csc-200)");
	inputusername=keyboard.next();
	System.out.println("Enter the password.(nova)");
	inputpassword=keyboard.next();}
	}
	if(!inputusername.equals(username)&&!inputpassword.equals(password)){
		System.out.println("Please contact your adminstrator to unlock your account!");
		System.out.println("After contacting the adminstrator,enter the username.(csc-200)");
		inputusername=keyboard.next();
		System.out.println("Enter the password.(nova)");
		inputpassword=keyboard.next();
		while(!inputusername.equals(username)||!inputpassword.equalsIgnoreCase(password))
		{ System.out.println("Wrong username or password. Enter the username.(csc-200)");
		inputusername=keyboard.next();
		System.out.println("Enter the correct password.(nova)");
		inputpassword=keyboard.next();
		};}
		{System.out.println("Welcome "+ username);}

	
		
	}
}
	
