package Page38;

public class point {
	private double x;
	private double y;
	
	//constuctor
	point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	void SetX(double x) {
		this.x =x;
	}
	void SetY(double y) {
		this.y =y;
	}
	String  PointToString() {
		String name;
		name = "(<"+x+">,<"+y+">)";
		return name;
	}
	
	
	 double pow(double x,double y) {
		 int power;
		 power = (int) Math.pow(x, y);
		return power;
	}
	 double sqrtX(double x) {
		
		return Math.sqrt(x);
	}
 double sqrtY(double y) {
		
		return Math.sqrt(y);
	}
 public double distance(point p)
	{
		int Distance;
		Distance = (int)(Math.sqrt(Math.pow(this.x,2)-Math.pow(p.getX(), 2))+(Math.pow(this.y, 2)-Math.pow(p.getX(), 2)));
		double d;
		d= Math.sqrt(Distance);
		System.out.println("first point in distance method:  "+p.PointToString());
		System.out.println("second point in distance method:"+p.PointToString());
		return d;
		
	}
	public String MiddleX(point p)
	{
		int mx,my;
		mx = (int) (p.getX()+this.x)/2;
		my = (int) (p.getY()+this.y)/2;
		
		return "(<"+mx+","+my+">)";
		
	}
	public double MiddleY(point p)
	{
		int my;
		my = (int) (p.getY()+this.y)/2;

		return my;
		


	}
}
