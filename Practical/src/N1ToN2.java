import java.util.Scanner;
public class N1ToN2 {
	public static void main() {
	int n1,n2;
	Scanner S=new Scanner(System.in);
	System.out.println("Enter n1 :");
	n1=S.nextInt();
	System.out.println("Enter n2 :");
	n2=S.nextInt();
	for(int i=n1;i<=n2;i++) {
		System.out.println(i);
	}
	S.close();
	}

}
