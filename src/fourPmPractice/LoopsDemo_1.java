package fourPmPractice;

public class LoopsDemo {

	public void printNumbers()
	{
		

		for(int row = 1; row<=5; row++)  // row = 2
		{
			for(int col = 1; col<=5; col++)  // col =1
			{
				if(row==1 || row==5 || col==1 || col==5)
				{
				System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
		
			System.out.println();
		
		}

	}
	
	public static void main(String[] args)
	{
		LoopsDemo l = new LoopsDemo();
		l.printNumbers();
	}
	
	
	
	

}
