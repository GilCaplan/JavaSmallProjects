package Page38;
import java.util.Scanner;
public class TestCircle {
	public static Scanner reader= new Scanner(System.in);
	public static void main(String args[]) {
		
		point g1 = new point(6,9);
		point g2 = new point(20,12);
		System.out.println("point g1: "+g1.PointToString());
		System.out.println("point g2: "+g2.PointToString());
		
		circle c1 = new circle(g1, 6);
		System.out.println(c1.toString());
		circle c2 = new circle(g2, 15);
		System.out.println(c2.toString());

		System.out.println("area of c1 is: "+ c1.calcArea());
		System.out.println("area of c2 is: "+ c2.calcArea());
		System.out.println("perimeter of c1 is: "+ c1.calcPerimeter());
		System.out.println("perimeter of c2 is: "+ c2.calcPerimeter());
		System.out.println("c2 before1 change is: "+ c2);
		
		c1.circleMove(2,3) ;
		c1.circleScale(2);
		c2.circleMove(3,4) ;
		c2.circleScale(0.5);
		boolean cc1,cc2;
		cc1 = c1.circleEqual(c2);
		cc2 = c2.circleEqual(c1);
		System.out.println("iii is: "+ c1);
		System.out.println("iv is: "+ c2);
		System.out.println("circle c1 to c2 similar?  " +cc1);
		System.out.println("circle c2 to c1 similar?  " +cc2);
		
		System.out.println("how many times do u want to check if your point is in circle");
		int f,gx,gy;
		f= reader.nextInt();
		for(int i=0;i<f;i++) {
			System.out.println("enter a X for point you want to check if inside circle 1");
			gx= reader.nextInt();
			System.out.println("enter a Y for point you want to check if inside circle 1");
			gy= reader.nextInt();
			point g3 = new point(gx,gy);
			boolean c6 = c1.isInside(g3,c1 );
			boolean c5 = c2.isInside(g3,c2 );
			System.out.println("checking if point is in c1 : "+c6);
			System.out.println("checking if point is in c2 : "+c5);
		}
	}

}
