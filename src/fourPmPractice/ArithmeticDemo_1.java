package fourPmPractice;

public class ArithmeticDemo {
	
	int var1 = 10;  // Variable
	int var2 = 3;
	
	public void addNumbers()   // Method
	{
		System.out.println(var1+var2);
	}
	
	public void subNumbers()
	{
		System.out.println(var1-var2);
	}
	
	public void mulNumbers()
	{
		System.out.println(var1*var2);
	}
	
	public void divNumbers()
	{
		System.out.println(var1/var2);
	}
	
	public void modNumbers()
	{
		System.out.println(var1%var2);
	}
	
	public static void main(String[] args)   // Main Method
	{
		ArithmeticDemo a = new ArithmeticDemo();  // Object Creation
		a.addNumbers();
		a.subNumbers();
		a.mulNumbers();
		a.divNumbers();
		a.modNumbers();
	}
	
	
	
	

}
