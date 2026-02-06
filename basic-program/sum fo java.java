import java.util.Scanner;
class SumOfArray {
    public static void main	(String[]args) {
	Scanner as = new Scsnner(System.in);
	int size = as.next(); 
	int [] arr = new int [size];
	int sum = 0;
	System.out.println("Enter array element");
	for (i= 0; i<size; i++) {
	     arr [i]= as.nextInt();
		 sum = sum+ arr[i];
		 }
		 System.out.println("sum of array elements" + sum);
	}
}
	