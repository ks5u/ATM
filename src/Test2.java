import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr = {10,12,1,23,58,69,456,12,356,1};
		System.out.println(arr.length);
		
		/*
		for(int i=0;i<=arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
			
		Arrays.sort(arr);
		for(int i=0;i<=arr.length;i++ )
		{
			System.out.print(arr[i] + " ");
		}
			
	}

}
