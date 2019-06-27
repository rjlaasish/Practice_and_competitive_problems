import java.util.Scanner;
public class EvenFromn1Ton2 {

		public static void main() {
			int n1,n2;
			Scanner SC=new Scanner(System.in);
			System.out.println("Enter n1");
			n1=SC.nextInt();
			System.out.println("Enter n2");
			n2=SC.nextInt();
			for(int i=n1;i<=n2;i++) {
				if((i%2)==0) {
				System.out.println(i);
								}  
				}
		SC.close();
			
	}
		
}		
		


