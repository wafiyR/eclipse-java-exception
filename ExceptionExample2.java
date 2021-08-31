import java.net.DatagramSocket;
public class ExceptionExample2
{
	public static void main(String [] args)
	{
		int [] values = {1,2,3,4,5};
		
		DatagramSocket socket;
		try{
			socket = new DatagramSocket(2020);
			System.out.println(values[10]);
			
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("size of array only 5");
		}catch(java.net.SocketException s)
		{
			System.out.println("Internet Problem");
		}
		
	}

}