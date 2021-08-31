public class MyMain
{
	public static void main(String [] args)
	{
		Payment payment = new Payment(20,10);
		try{
			System.out.println("Balance :"+payment.doPayment());
		}catch(PaymentException pe){
			System.out.println(pe.notEnoughMoney());
		}
	}
}