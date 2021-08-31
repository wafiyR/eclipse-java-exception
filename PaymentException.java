public class PaymentException extends Exception
{
	public PaymentException()
	{
		super();
	}
	public PaymentException(String message)
	{
		super(message);
	}
	public String insufficientAmount()
	{
		return "Inssufficient Amount";
	}
	public String notEnoughMoney()
	{
		return "Not Enough Money";
	}
}