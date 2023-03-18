package fourPmPractice;

public class RelationalDemo {
	
	int var1 = 10;
	int var2 = 3;
	
	public void compareNumbers()
	{
		System.out.println(var1<var2);
		System.out.println(var1>var2);
		System.out.println(var1<=var2);
		System.out.println(var1>=var2);
		System.out.println(var1==var2);
		System.out.println(var1!=var2);
	}
	
	public static void main(String[] args)
	{
		RelationalDemo r = new RelationalDemo();
		r.compareNumbers();
	}
	
	

}
