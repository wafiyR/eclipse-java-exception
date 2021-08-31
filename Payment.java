public class Payment 
{
	private double price;
	private double pay;

	public Payment(double price, double pay)
	{
		this.price =price;
		this.pay = pay;
	}
	public double doPayment() throws PaymentException
	{
		double balance =0;
		if(pay<price)
			throw new PaymentException();
		else
			balance = pay-price;
		
		return balance;
	}
}