
public class Calculator {

	
	public int add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c = a-b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		c.add(5, 4);
	}

}
