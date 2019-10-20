import java.io.IOException;    // package for handling IOExceptions
import java.util.Arrays;       //package for using inbuilt sort method
import java.util.Scanner;      //package for using scanner class

//Class Declaration
public class ArraySort {       
	//creating a funtion for accpeting the integer values in an array
	public int[] input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements of the array to be made");
		//creating scanner object
		int n=sc.nextInt(); 
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+"th element");
			a[i]=sc.nextInt();
		}
		return(a);  // returning the new made array
	}
	// creating a funtion to print an array
	public void print(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	
	//funtion to sort the array using inbuilt sort method
	public void sorting(int a[]) {
		System.out.println("Ascending order: ");
		Arrays.sort(a); // inbuilt sort method
		System.out.printf("\nModified array[]: %s", Arrays.toString(a));
		}
	public static void main(String args[])throws IOException{
		ArraySort ab= new ArraySort(); //creating object of class
		int x[]=ab.input(); 
		ab.print(x);//calling the print funtion and passing the value of a to it
		ab.sorting(x); //calling the sort funtion and passing the value of a to it.
	}
}
