public class Question3
{
	public static void main(String args[])
	{
		int[] A1 = {0, 1, 2, 3, 2};
		int[] A2 = {0, 0};
		int[] A3 = {22, 0, -5, 0, 126};
		int[] A4 = {1, 0};

		System.out.print("passing ");
		PrintArray(A1);
		int[] R = NonZeros(A1);
		System.out.print(" got back ");
		PrintArray(R);
		System.out.println();

		System.out.print("passing ");
		PrintArray(A2);
		R = NonZeros(A2);
		System.out.print(" got back ");
		PrintArray(R);
		System.out.println();

		System.out.print("passing ");
		PrintArray(A3);
		R = NonZeros(A3);
		System.out.print(" got back ");
		PrintArray(R);
		System.out.println();

		System.out.print("passing ");
		PrintArray(A4);
		R = NonZeros(A4);
		System.out.print(" got back ");
		PrintArray(R);
		System.out.println();
	}

	protected static void PrintArray(int[] A)
	{
		System.out.print("[");
		for (int index = 0; index < A.length;++index)
		{
			System.out.print(A[index]);
			if (index < (A.length-1))
			{
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	protected static int[] NonZeros(int[] A)
	{
		int count = 0;
		for (int index = 0; index < A.length; ++index)
		{
			if (A[index] != 0)
			{
				++count;
			}
		}

		int[] R = new int[count];
		count = 0;
		for (int index = 0; index < A.length; ++index)
		{
			if (A[index] != 0)
			{
				R[count++] = A[index];
			}
		}

		return R;
	}
}
