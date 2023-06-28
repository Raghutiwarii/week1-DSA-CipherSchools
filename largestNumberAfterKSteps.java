
import java.io.*;
class largestNumberAfterKSteps
{
	static StringBuilder findMaximumNum(StringBuilder str,
											int n, int k)
	{
	
		for (int i = 0; i < n; i++)
		{
	
			if (k < 1)
				break;
			if (str.charAt(i) != '9')
			{
				str.setCharAt(i, '9');

				k--;
			}
		}
		return str;
	}
	public static void main (String [] args)
	{
		StringBuilder str = new StringBuilder("569431");
		
		int n = str.length();
		int k = 3;
	
		System.out.println(findMaximumNum(str, n, k));
	}
}
