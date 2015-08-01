public class PrimeNumber
{
	private int input;

	public PrimeNumber(int userInput)
	{
		input = userInput;
	}

	public boolean checkIfPrime()
	{
		if (input == 1)
			return false;

		for (int i = 2; i < input / 2; i++)
		{
			if (input % i == 0)
				return false;
		}
		return true;
	}
}
