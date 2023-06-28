import java.io.*;
import java.util.*;
class GenerateSubsets{

	public static void generateAllSubstes(int[] nums)
	{
		// Get the length of the input array
		int n = nums.length;

		for (int i = 0; i < (1 << n); i++) {

			for (int j = 0; j < n; j++) {

			
				if ((i & (1 << j)) != 0) {

					System.out.print(nums[j] + " ");
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		int[] arr = new int[] { 1, 2, 3 };
		generateAllSubstes(arr);
	}
}
