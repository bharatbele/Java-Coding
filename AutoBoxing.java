class AutoBoxing
{
	public static void main(String[] args)
	{
		Integer a = 100;
		int b = a;

		System.out.println(b);
		
		short c = 110;
		Short d = new Short (c);
		byte e = (byte) c;
		System.out.println(d+"" +e);

	
	}
}