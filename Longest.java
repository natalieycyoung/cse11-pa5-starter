/**
 * Programming Assignment 5
 *
 * @author Natalie Young
 * @since 2021-11-02
 */

public class Longest
{
	/**
	 * Prints out longest string in commandline args, nothing if no
	 * args given, or the string that appears earliest in array if
	 * there is tie
	 */
	public static void main(String[] args)
	{
		// initialize storage vars
		String longestStr = "";
		int longestIndex = 0;

		// do nothing if no args given
		if (args.length == 0)
		{
			return;
		}

		for (int index = 0; index < args.length; index++)
		{
			// compare current string with longest so far
			if (args[index].length() > longestStr.length())
			{
				longestStr = args[index];
				longestIndex = index;
			}
			// if length equal and index earlier, set as longest
			else if ((args[index].length() == longestStr.length())
					&& (index < longestIndex))
			{
				longestStr = args[index];
				longestIndex = index;
			}
		}

		// print out the "winner"
		System.out.println(longestStr);
	}
}
