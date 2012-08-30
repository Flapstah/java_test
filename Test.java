public class Test
{
	public static void main(String args[])
	{
		if (args.length != 0)
		{
			int num = Integer.parseInt(args[0]);
			System.out.println("The sum is: " + sum(num));
		}
	}

	protected static int sum(int i)
	{
		if (i == 1)
		{
			return i;
		}
		else
		{
			return (i + sum(i-1));
		}
	}
}
