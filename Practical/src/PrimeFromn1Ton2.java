import java.util.Scanner;

public class PrimeFromn1Ton2 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter n1 : ");
		n1=SC.nextInt();
		System.out.println("Enter n2 : ");
		n2=SC.nextInt();
		for(int i=n1;i<=n2;i++) {
			int n=0;
			for(int j=i;j>=1;j--) {
			if((i%j)==0) {
				n=n+1;
					} 
			}
			if(n==2) {
			System.out.println(i);	
			}
			
	
		
}
		SC.close();

}
}