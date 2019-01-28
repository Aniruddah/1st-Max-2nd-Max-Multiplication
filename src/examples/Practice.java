package examples;

public class Practice {
	public static void main(String[] args) {
		int [] array1=new int[]{1,12,3,4,5,30,70,8,9,10};
				int i,j,max=0;
				
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {
				if(max<array1[i]) {
				max=array1[i];
					}
		}
	}System.out.println("1st max is : "+max);
	
	int max2nd=0;
	for (i=0;i<10;i++) {
		for (j=0;j<10;j++) {
			if( max2nd<array1[j] && max>array1[j]) {
			max2nd=array1[i];
				}
	}
}System.out.println("2nd Max is :" + max2nd);
System.out.println("Multiplication of Max and 2nd Max num is :"+max*max2nd);
	}
}
