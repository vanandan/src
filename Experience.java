import java.util.Scanner;

import Common.GetUserInput;
import CustomException.InvalidEntryException;

public class Experience
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

		// System.out.println("Hello World!");
		// new CollectionTesting();

		String toContinue = "y";
		// int userPrime;

		// int userNaturalNumEntry;
		int userProgramChoice;

		
		while (toContinue.equalsIgnoreCase("y"))
		{


			try
			{
				userProgramChoice = new GetUserInput()
				.getNaturalNumberInput(""
						+ "What would you like to test? Type the Option Number"
						+ "\n 1. Check for Prime \n 2. Check for number Palindrome"
						+ "\n 3. Check if Armstrong number "
						+ "\n 4. Factorial - Regular \n 5. Factorial - Recursion "
						+ "\n 6. Fibonacci - Regular \n 7. Fibonacci - Recursion "
						+ "\n "
						);

				switch (userProgramChoice)
				{
					case 1:
					{
						prime();
						break;
					}
	
					case 2:
					{
						palindromeNumber();
						break;
					}
					case 3:
					{
						armstrongNumber();
						break;
					}
					case 4:
					{
						factorialRegular();
						break;
					}
					case 5:
					{
						factorialRecursion();
						break;
					}
					case 6:
					{
						fibonacciRegular();
						break;
					}
					case 7:
					{
						fibonacciRecursion();
						break;
					}
					default:
					{
						System.out.println("Please enter a valid option.");
					}
				}
			}
			catch (InvalidEntryException e)
			{
				System.out.println("You STUPID! Invalid entry: " + e.getEntry());
				e.printStackTrace();
			}

			toContinue = new GetUserInput()
					.getStringInput("Do you want to continue? (Y/N)");
		}

		System.out.println("You typed " + toContinue + ". Program exits.");
	}
		


	private static void fibonacciRecursion() throws InvalidEntryException
	{
		int fibNum;
		try
		{
			fibNum = new GetUserInput().getNaturalNumberInput("7. Fibonacci - Recursion. Please enter a Positive Integer:");
			FibonacciSeries fib = new FibonacciSeries();
			System.out.println("The Fibonacci Series of " + fibNum + " is " + fib.getFibonacciRecursion(fibNum).toString());
		}
		catch (InvalidEntryException e)
		{
			throw e;
		}
		
	}



	private static void fibonacciRegular() throws InvalidEntryException
	{
		int fibNum;
		try
		{
			fibNum = new GetUserInput().getNaturalNumberInput("6. Fibonacci - Regular. Please enter a Positive Integer:");
			FibonacciSeries fib = new FibonacciSeries();
			System.out.println("The Fibonacci Series of " + fibNum + " is " + fib.getFibonacci(fibNum).toString());
		}
		catch (InvalidEntryException e)
		{
			throw e;
		}
		
	}



	private static void factorialRecursion() throws InvalidEntryException
	{
		int factNum;
		try
		{
			factNum = new GetUserInput().getNaturalNumberInput("5. Factorial - Recursion. Please enter a Natural Number (integer):");
			Factorial fact = new Factorial(factNum);
			System.out.println("The Factorial of " + factNum + " is " + fact.getFactorialRecursion(factNum));
		}
		catch (InvalidEntryException e)
		{
			throw e;
		}
	}



	private static void factorialRegular() throws InvalidEntryException
	{
		int factNum;
		try
		{
			factNum = new GetUserInput().getNaturalNumberInput("4. Factorial - Regular. Please enter a Natural Number (integer):");
			Factorial fact = new Factorial(factNum);
			System.out.println("The Factorial of " + factNum + " is " + fact.getFactorial());
		}
		catch (InvalidEntryException e)
		{
			throw e;
		}

	}



	private static void armstrongNumber() throws InvalidEntryException
	{
		int armstrongNum;
		try
		{
			armstrongNum = new GetUserInput()
					.getNaturalNumberInput("3. Check if Armstrong number. Please enter a Natural Number (integer):");
			ArmstrongNumber arm = new ArmstrongNumber(armstrongNum);
			if (arm.isArmstrong())
				System.out.println("The number is Armstrong.");
			else
				System.out.println("The number is not Armstrong.");

		}
		catch (InvalidEntryException e)
		{
			// e.printStackTrace();
			throw e;
		}

		return;

	}

	private static void palindromeNumber() throws InvalidEntryException
	{
		int userPalinNum;
		try
		{
			userPalinNum = new GetUserInput()
					.getNaturalNumberInput("2. Check for number Palindrome. Please enter a Natural Number (integer):");
			PalindromeNumber pal = new PalindromeNumber(userPalinNum);
			if (pal.checkIfPalindrome())
				System.out.println("The number is a Palindrome.");
			else
				System.out.println("The number is not a Palindrome.");

		}
		catch (InvalidEntryException e)
		{
			// e.printStackTrace();
			throw e;
		}

		return;
	}

	private static void prime() throws InvalidEntryException
	{

		int userPrime;
		try
		{
			userPrime = new GetUserInput()
					.getNaturalNumberInput("1. Check for Prime. Please enter a Natural Number (integer):");

			PrimeNumber p = new PrimeNumber(userPrime);
			if (p.checkIfPrime())
				System.out.println("The number " + userPrime + " is Prime.");
			else
				System.out.println("The number " + userPrime + " is not Prime.");
		}
		catch (InvalidEntryException e)
		{
			// e.printStackTrace();
			throw e;
		}

	}

}
