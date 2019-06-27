
import java.util.Scanner;
public class Personalinfo {

	public static void main(String[] args) {
		String name;
		long phone;
		String Add;
		System.out.println("Enter your details :");
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter name :");
		name=SC.nextLine();
		System.out.println();
		System.out.print("Enter Address :");
		Add=SC.nextLine();
		System.out.println();
		System.out.println("Enter phone number :");
		phone=SC.nextLong();
		System.out.println();
		System.out.println("Your details are :");
		System.out.println("Name : "+name);
		System.out.println("Address : "+Add);
		System.out.println("Phone mumber : "+phone);
		SC.close();
	}

}
