/**
 * Programming Assignment 5
 *
 * @author Natalie Young
 * @since 2021-11-02
 */

class Stats
{
	/**
	 * If the first argument is:
	 * "--product", print the product of the provided numbers
	 * "--mean", print the average (mean) of the provided numbers
	 * "--total", print the sum of the provided numbers
	 * "--max", print the maximum of the provided numbers
	 * "--min", print the minimum of the provided numbers
	 * any other string, print "Bad option <arg>" where you will
	 * replace "<arg>" with the first argument
	 * 
	 * Assume at least two command-line args (name of operation, at
	 * least one number), and all args after first appropriate for
	 * Double.parseDouble
	 */
	public static void main(String[] args)
	{
		String arg0 = args[0];
		double[] doubles = strsToDoubles(args);

		switch (arg0)
		{
			case "--product":
				System.out.println(getProduct(doubles));
				break;
			case "--mean":
				System.out.println(getMean(doubles));
				break;
			case "--total":
				System.out.println(getTotal(doubles));
				break;
			case "--max":
				System.out.println(getMax(doubles));
				break;
			case "--min":
				System.out.println(getMin(doubles));
				break;
			default:
				System.out.println("Bad option " + args[0]);
		}
	}

	/**
	 * Converts String array to double array
	 *
	 * @param args
	 * @return doublesArray
	 */
	static double[] strsToDoubles(String[] args)
	{
		double[] doublesArray = new double[args.length - 1];

		for (int i = 1; i < args.length; i++)
		{
			doublesArray[i - 1] = Double.valueOf(args[i]);
		}

		return doublesArray;
	}

	/**
	 * Calculates product of double array
	 *
	 * @param doubles
	 * @return product
	 */
	static double getProduct(double[] doubles)
	{
		double product = 1;

		for (double doub : doubles)
		{
			product *= doub;
		}

		return product;
	}

	/**
	 * Calculates mean of double array
	 *
	 * @param doubles
	 * @return mean
	 */
	static double getMean(double[] doubles)
	{
		double total = getTotal(doubles);
		double number = doubles.length;
		double mean = total/number;

		return mean;
	}

	/**
	 * Calculates total of double array
	 *
	 * @param doubles
	 * @return total
	 */
	static double getTotal(double[] doubles)
	{
		double total = 0;

		for (double doub : doubles)
		{
			total += doub;
		}

		return total;
	}

	/**
	 * Finds largest value of double array
	 *
	 * @param doubles
	 * @return max
	 */
	static double getMax(double[] doubles)
	{
		double max = doubles[0];

		for (double doub : doubles)
		{
			if (doub > max)
			{
				max = doub;
			}
		}

		return max;
	}

	/**
	 * Finds smallest value of double array
	 *
	 * @param doubles
	 * @return min
	 */
	static double getMin(double[] doubles)
	{
		double min = doubles[0];

		for (double doub : doubles)
		{
			if (doub < min)
			{
				min = doub;
			}
		}

		return min;
	}
}
