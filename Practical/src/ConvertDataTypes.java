import java.util.Scanner;
public class ConvertDataTypes {
	public static void main(String[] args) {
		int a;
		byte b;
		double d;
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter the value of int a :");
		a = Sc.nextInt();
		System.out.println("Enter the value of double d : ");
		d= Sc.nextDouble();
		b=(byte) a;
		System.out.println("Conversion of int to byte : ");
		System.out.println(a+" int value is converted to "+b+" byte value");
		System.out.println("Conversion of double to int :");
		a=(int) d;
		System.out.println(d+" double value converted to " +a+" int value");
		System.out.println("Conversion of double to byte :");
		b=(byte) d;
		System.out.println(d+" double value converted to " +b+" byte value");
		Sc.close();
		
	}
}
