package fourPmPractice;

public class SonHouse extends FatherHouse {

	public void ktmBike()
	{
		
		System.out.println("This is Son's KTM Bike");
	}
	
	public void xbladeBike()
	{
		
		System.out.println("This is Son's xblade Bike");
	}
	
	public static void main(String[] args) {
		
		SonHouse s = new SonHouse();
		s.ktmBike();
		s.xbladeBike();
		s.audiCar();
		
		DaughterHouse d = new DaughterHouse();
		d.scootyPep();
		d.ladyBird();
		d.porscheCar();
		
		
		
	}
}
