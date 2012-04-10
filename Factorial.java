public class Factorial {
	public static void main(String[] args) {
		if(args.length != 0) {
			int num = Integer.parseInt(args[0]);
			System.out.println(factorial(num));
		}
	}

	private static int factorial(int fact) {
		int result = fact;
		if (fact == 0)
			return result;
		else {
			while (fact != 1)
				result *= --fact;
		}
		return result;
	}
}
