import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int [4];
		int min;
		int max;
		
		Scanner in = new Scanner(System.in);
		for(int i=0;i<+arr.length ;i++)
		{
			System.out.println("input:");
			arr[i] = in.nextInt();
		}
/*
		for(int i=0;i<=arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		*/
		//System.out.print("\n-------\n");
		
		Arrays.sort(arr);
		min = arr[0];
		max = arr[arr.length-1];
		System.out.println("min:"+min);
		System.out.println("max:"+max);
		
		
	}

}
