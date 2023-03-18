package fourPmPractice;

public class MethodDemo {
	
	int var1 = 10;
	int var2 = 3;
	
	public void addNumbers()  // M WORT WOP
	{
		System.out.println("Addition : " + (var1+var2));
	}
	
	public void subNumbers(int a, int b)  // M WORT WP
	{
		System.out.println("Subtraction : " + (a-b));
	}
	
	public int mulNumbers()   // M WRT WOP
	{
		return (var1*var2);
	}
	
	public int divNumbers(int a, int b)  // M WRT WP
	{
		return (a/b);
	}
	
	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		m.addNumbers();
		m.subNumbers(20,6);
		System.out.println("Multiplication : " +m.mulNumbers());
		System.out.println("Division : " + m.divNumbers(20,4));
	}
}
