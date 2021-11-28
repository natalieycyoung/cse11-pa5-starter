/**
 * Programming Assignment 5
 *
 * @author Natalie Young
 * @since 2021-11-02
 */

import tester.*;

class ArrayExamples
{
	/**
	 * Takes array of String and String separator, returns new
	 * String containing strings from array separated by separator
	 * or empty string if input array is empty
	 *
	 * @param strArray
	 * @param separator
	 * @return separatedStrs
	 */
	static String joinWith(String[] strArray, String separator)
	{}
	
	/**
	 * Takes array of boolean, returns true if at least one element
	 * is false or false if empty array.
	 *
	 * @param boolArray
	 * @return boolean
	 */
	static boolean somethingFalse(boolean[] boolArray)
	{
		for (boolean bool : boolArray)
		{
			// returns true if at least one element is false
			if (bool == false)
			{
				return true;
			}
			// false if all true or empty array
			else
			{
				return false;
			}
		}
	}
}
