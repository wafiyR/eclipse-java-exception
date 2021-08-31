public class ExceptionExample
{
	public static void main(String [] args)
	{
		int value1 = 0;
		int value2 = 2;
		int answer =0;
		try{
			answer = value2/value1;
			System.out.println(answer);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Cannot divide by zero");
		}
	}

}