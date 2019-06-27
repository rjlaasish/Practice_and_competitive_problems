
public class GreatestArr {

	public static void main(String[] args) {
		int x,y;
		int arr[]= {19,14,95,45,99,34,13,93,56,52};
		x=arr[0];
		y=arr[1];
		for(int a=1;a<9;a++) {
			if(x>y) {
			y=arr[a+1];
			}
			else {
				x=y;
				y=arr[a+1];
			}
				
			}
		if(x>y) {
		
		System.out.println(x);
		}
		else {
			System.out.println(y);			
		}
	}

}
