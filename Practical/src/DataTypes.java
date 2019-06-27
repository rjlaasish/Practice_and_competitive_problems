
import java.util.Scanner;
public class DataTypes {
	public static void main(String[] args) {
		int i,choice;
		String ch;
		byte b;
		boolean bo;
		short s;
		long l;
		float f;
		double d;
		@SuppressWarnings("resource")
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Integer\t\t\t2.Character\t\t\t3.Byte\t\t\t4.Boolean\t\t\t5.Short\n6.Long\t\t\t\t7.Float\t\t\t\t8.Double\t\t\t");
		choice=S.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Integer");
			i=S.nextInt();
			System.out.println("Integer you entered is :"+i);
			break;
		case 2:
			System.out.println("Enter character :");
			ch=S.nextLine();
			System.out.println("Character you entered is :"+ch);
			break;
		case 3:
			System.out.println("Enter byte :");
			b=S.nextByte();
			System.out.println("Byte you entered is :"+b);
			break;
		case 4:
			bo=true;
			if(bo)
			{
				System.out.println("b is true Boolean");
			}
			else
			{
				System.out.println("This won't Execute:");
			}
			System.out.println("10 > 9 is "+(10>9));
			break;
		case 5:
			System.out.println("Enter short data type :");
			s= S.nextShort();
			System.out.println("Short data you entered is :"+s);
			break;
		case 6:
			System.out.println("Enter long data type");
			l=S.nextLong();
			System.out.println("Long data you entered is :"+l);
			break;
		case 7:
			System.out.println("Enter float data :");
			f=S.nextFloat();
			System.out.println("Float you Entered is :"+f);
			break;
		case 8:
			System.out.println("Enter double data :");
			d=S.nextDouble();
			System.out.println("Double data you entered is :"+d);
			break;
		default:
			System.out.println("Wrong choice :");
			break;
		}
			
		
		
	}
	

}
