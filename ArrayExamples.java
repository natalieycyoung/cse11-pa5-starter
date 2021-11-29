/**
 * Programming Assignment 5
 *
 * @author Natalie Young
 * @since 2021-11-02
 */
//package ArrayExamples;

import tester.*;
import java.util.Arrays;

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
	{
		int index = 0;
		String joinedStr = "";

		if (strArray.length == 0)
		{
			return joinedStr;	// empty array; return empty string 
		}

		for (String str : strArray)
		{
			if (index < strArray.length - 1)
			{
				joinedStr = joinedStr.concat(str).concat(separator);

				index += 1;
			}
			else
			{
				joinedStr = joinedStr.concat(str);
			}
		}

		return joinedStr;
	}
	
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
			// true if at least one element is false
			if (bool == false)
			{
				return true;
			}
		}

		// false if all true or empty array
		return false;
	}

	/**
	 * Takes array of doubles, two doubles, returns element count
	 * between low (inclusive) and high (inclusive) (assuming low
	 * is less than or equal to high) or 0 if empty array.
	 *
	 * @param doubleArray
	 * @param low
	 * @param high
	 * @return count
	 */
	static int countWithinRange(double[] doubleArray, double low, double high)
	{
		int count = 0;

		if (doubleArray.length == 0)	// empty array
		{
			return count;
		}

		for (double doub : doubleArray)
		{
			if ((doub >= low) && (doub <= high))
			{
				count += 1;
			}
		}
		
		return count;
	}

	/**
	 * Takes array of double and two other doubles, returns array of
	 * double that contains all elements in array between low and
	 * high (both inclusive, assume low lt/e high) or empty
	 * array if input array is empty
	 *
	 * @param doubleArray
	 * @param low
	 * @param high
	 * @return numsInRange
	 */
	static double[] numsWithinRange(double[] doubleArray, double low, double high)
	{
		double[] numsWithinRange;

		if (doubleArray.length == 0 || doubleArray == null)
		{
			numsWithinRange = new double[0];
			
			return numsWithinRange;
		}

		int arraySize = countWithinRange(doubleArray, low, high);
		numsWithinRange = new double[arraySize];
		int rangeIndex = 0;

		for (double doub : doubleArray)
		{
			if ((doub >= low) && (doub <= high))
			{
				numsWithinRange[rangeIndex] = doub;

				rangeIndex += 1;
			}
		}

		return numsWithinRange;
	}

	/**
	 * Takes array of int, returns Pair with a = min, b = max
	 *
	 * @param intArray
	 * @return maxmin
	 */
	static Pair maxmin(int[] intArray)
	{
		int min = intArray[0];
		int max = intArray[0];

		for (int integer : intArray)
		{
			if (integer < min)
			{
				min = integer;
			}
			else if (integer > max)
			{
				max = integer;
			}
		}

		Pair minmax = new Pair(min, max);

		return minmax;
	}

	/**
	 * Takes array of Strings, returns alphabetically earliest String
	 *
	 * @param strArray
	 * @return earliestStr;
	 */
	static String earliest(String[] strArray)
	{
		Arrays.sort(strArray);

		String earliestStr = strArray[0];

		return earliestStr;
	}
}

class Pair
{
	int a;
	int b;

	Pair(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

class ProvidedArrayExamples
{
	void testJoinWith(Tester t)
	{
		String[] example1 = {"a", "b","c"};
		t.checkExpect(ArrayExamples.joinWith(example1, ":"), "a:b:c");
	}
	
	void testSomethingFalse(Tester t)
	{
		boolean[] example1 = {true, false};
		t.checkExpect(ArrayExamples.somethingFalse(example1), true);
	}
	
	void testCountWithinRange(Tester t)
	{
		double[] example = {0.1, 1.3, 2.6};
		t.checkExpect(ArrayExamples.countWithinRange(example, 1.1, 2.2), 1);
	}
	
	void testNumsWithinRange(Tester t)
	{
		double[] example = {0.0, 3.0, 1.4, 1.5, 2.7, 9.1, 2.1};
		double[] expected = {1.4, 1.5, 2.1};
		t.checkExpect(ArrayExamples.numsWithinRange(example, 1.1, 2.2), expected);
	}
	
	void testMaxmin(Tester t)
	{
		int[] example = {4, 5, 2, 3, 1};
		t.checkExpect(ArrayExamples.maxmin(example), new Pair(1, 5));
	}
	
	void testEarliest(Tester t)
	{
		String[] example = {"aa", "aab", "abcd", "a"};
		t.checkExpect(ArrayExamples.earliest(example), "a");
	}
}

class MyArrayExamples
{
	void testJoinWith(Tester t)
	{
		String[] example1 = {" ", "",";"};
		t.checkExpect(ArrayExamples.joinWith(example1, ":"), " ::;");
	}
	
	void testSomethingFalse(Tester t)
	{
		boolean[] example1 = {true, true};
		boolean[] example2 = {};
		t.checkExpect(ArrayExamples.somethingFalse(example1), false);
		t.checkExpect(ArrayExamples.somethingFalse(example2), false);
	}
	
	void testCountWithinRange(Tester t)
	{
		double[] example1 = {0.0, 0.0, 0.0};
		double[] example2 = {};
		t.checkExpect(ArrayExamples.countWithinRange(example1, 1.1, 2.2), 0);
		t.checkExpect(ArrayExamples.countWithinRange(example2, 1.1, 2.2), 0);
	}
	
	void testNumsWithinRange(Tester t)
	{
		double[] example1 = {0.0, -3.0, 1.4, -1.5, 2.7, 9.1, 2.1};
		double[] expected1 = {1.4, 2.1};
		double[] example2 = {};
		double[] expected2 = {};
		t.checkExpect(ArrayExamples.numsWithinRange(example1, 1.1, 2.2), expected1);
		t.checkExpect(ArrayExamples.numsWithinRange(example2, 1.1, 2.2), expected2);
	}
	
	void testMaxmin(Tester t)
	{
		int[] example1 = {4, 5, -9, 3, 1};
		int[] example2 = {1, 1, 1, 1, 1};
		int[] example3 = {2};
		t.checkExpect(ArrayExamples.maxmin(example1), new Pair(-9, 5));
		t.checkExpect(ArrayExamples.maxmin(example2), new Pair(1, 1));
		t.checkExpect(ArrayExamples.maxmin(example3), new Pair(2, 2));
	}
	
	void testEarliest(Tester t)
	{
		String[] example1 = {"aa", "aab", "abcd", "a"};
		String[] example2 = {"b", "b", "b", "b"};
		String[] example3 = {"c"};
		t.checkExpect(ArrayExamples.earliest(example1), "a");
		t.checkExpect(ArrayExamples.earliest(example2), "b");
		t.checkExpect(ArrayExamples.earliest(example3), "c");
	}
}
