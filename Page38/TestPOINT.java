package Page38;

public class TestPOINT {
	
	
	public static void main(String[] args) {
		point p1= new point(43,7);
		point p2 = new point(5,5);
		System.out.println("point1 original: "+ p1.PointToString());
		System.out.println("point2 original: "+ p2.PointToString());
		
		
		
		System.out.println("  p1  x^y  " + p1.pow(p1.getX(), p1.getY()));
		System.out.println("  p2 x^y " + p1.pow(p2.getX(), p2.getY()));
		System.out.println("  p2 x squaroot " + p2.sqrtX(p2.getX()));
		System.out.println("  p1  x squaroot " + p1.sqrtX(p1.getX()));
		System.out.println("  p2 y squaroot " + p2.sqrtY(p2.getY()));
		System.out.println("  p1  y= squaroot(same as the x=5) " + p1.sqrtY(p1.getY()));
		System.out.println(p1.PointToString());
		System.out.println(p2.PointToString());
		
		
		double c1= p1.getX();
		double c2= p2.getX();
		p1.SetX(c2);
		p2.SetY(c1);
		

		
		System.out.println("   " + p1.PointToString());
		System.out.println("   "+  p2.PointToString());
		System.out.println(" distance between the current points is:" + p1.distance(p2));
		System.out.println(" distance between the points is:" + p2.distance(p1));
		System.out.println("middle point is after the switch(p1):  "+ p1.PointToString());
		System.out.println("middle point is after the switch(p2):  "+ p2.PointToString());


	
	
	}
}
