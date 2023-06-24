
import java.io.*;

class Solution {
	public static boolean
	nonLower(String s)
	{
		for (int i = 0; i < s.length(); i++) {

			if (!Character
					.isLowerCase(s.charAt(i))) {
				return true;
			}
		}

		return false;
	}

	public static void
	printCodes(String output[])
	{
		for (int i = 0; i < output.length; i++) {

			
			if (nonLower(output[i]))
				continue;
			System.out.println(output[i]);
		}
	}
	public static char getChar(int n)
	{
		return (char)(n + 96);
	}
	public static String[] getCode(
		String str)
	{
		if (str.length() == 0) {

			String ans[] = { "" };
			return ans;
		}

	
		String output1[]
			= getCode(str.substring(1));

		String output2[] = new String[0];

		int firstDigit
			= (str.charAt(0) - '0');
		int firstTwoDigit = 0;

		if (str.length() >= 2) {

			firstTwoDigit
				= (str.charAt(0) - '0') * 10
				+ (str.charAt(1) - '0');

			if (firstTwoDigit >= 10
				&& firstTwoDigit <= 26) {

				// Next recursive call
				output2
					= getCode(str.substring(2));
			}
		}
		String output[]
			= new String[output1.length
						+ output2.length];

		int k = 0;

	
		for (int i = 0; i < output1.length; i++) {

			char ch = getChar(firstDigit);

			output[i] = ch + output1[i];
			k++;
		}

		for (int i = 0; i < output2.length; i++) {

			char ch = getChar(firstTwoDigit);

			output[k] = ch + output2[i];
			k++;
		}

		return output;
	}

	public static void main(String[] args)
	{
		String input = "101";

		String output[] = getCode(input);

		printCodes(output);
	}
}
