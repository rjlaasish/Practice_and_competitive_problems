
public class AverageArray {

	public static void main(String[] args) {
		int arr[],average=0,result=0;
		arr= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<5;i++) {
			result=result+arr[i];
			}
average=result/5;
System.out.println("The average is :"+average);
	}

}
