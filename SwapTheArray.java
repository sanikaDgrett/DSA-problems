// General code for input output from and to external file

import java.util.*;

class SwapTheArray{

	public static void main(String[] args)
	{

		int[] a = {1,3,5,6,2,9};

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