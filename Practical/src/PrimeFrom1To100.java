
public class PrimeFrom1To100 {
	public static void main(String[] args) {	
		
		int k;
			for(k=1;k<=100;k++){
			int n=0;
				for(int l=k;l>=1;l--) {
					if(k%l==0) {
						n=n+1;
							   }
					
					}
				if(n==2) {
					
					  System.out.println(k);
				}
		
			
		
					
				
			
			}
			}

}
