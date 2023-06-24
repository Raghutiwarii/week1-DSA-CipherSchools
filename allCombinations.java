// Java program to print all combination of size r in an array of size n
import java.io.*;

class Combination {

	static void combinationUtil(int arr[], int n, int r, int index,
								int data[], int i)
	{
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
		return;
		}
		if (i >= n)
		return;

		data[index] = arr[i];
		combinationUtil(arr, n, r, index+1, data, i+1);

		combinationUtil(arr, n, r, index, data, i+1);
	}

	static void printCombination(int arr[], int n, int r)
	{
		int data[]=new int[r];
		combinationUtil(arr, n, r, 0, data, 0);
	}

	public static void main (String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int r = 3;
		int n = arr.length;
		printCombination(arr, n, r);
	}
}
