public class Addition 
{
	public void sum(int number1, int number2)
	{
		int result = number1 + number2;
		System.out.println(result);
	
	}
	
	public static void main(String[] args)
	{
		Addition obj = new Addition ();
		obj.sum(10,20);
	}
}