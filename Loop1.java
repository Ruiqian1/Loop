import java.util.Scanner;
public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username="csc-200", password="nova",inputusername="",inputpassword="";
Scanner keyboard=new Scanner(System.in);
System.out.println("Enter the username.(csc-200)");
inputusername=keyboard.next();
System.out.println("Enter the password.(nova)");
inputpassword=keyboard.next();
while(!inputusername.equals(username)||!inputpassword.equalsIgnoreCase(password))
{ System.out.println("Wrong username or password. Enter the username.(csc-200)");
inputusername=keyboard.next();
System.out.println("Enter the password.(nova)");
inputpassword=keyboard.next();
};
System.out.println("Welcome "+ username);

	}

}
