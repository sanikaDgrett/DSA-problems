import java.io.*;
import java.util.*;

import java.util.*;

class SwapTheArray{

	public static void main(String[] args)
	{
		/* 
			added input and output to the external files 
		*/
		try {
			System.setIn(new FileInputStream("input.txt")); // give address of files as an agrument
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}

		//int[] a = {1,3,5,6,2,9};

		int[] arr = swapArray(a);

		for(int x: arr)
		{
			System.out.print(x+ " ");
		}

	}

	static int[] swapArray(int[] arr)
	{
		int n = arr.length;
		int i = 0, j = n-1, temp = 0;

		while(i<j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		return arr;
	}
}