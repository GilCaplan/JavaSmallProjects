package Page38;

public class circle {
	private point p;
	private double r;
	
	circle(point p,double r){
		this.p = p;
		this.r=r;
	}
	public point getCenter() {
		return this.p;
	}
	public double getRadius() {
		return this.r;
	}
	public String toString() {
		return "(<"+this.p.getX()+"> ,"+ "(<"+this.p.getY()+">)"+ "  r= "+ "<"+r+">";
	}
	public void setCenter(point p) {
		this.p = p;
	}
	public void setRadius(double r) {
		this.r= r;
	}
	public double calcArea() {
		//s = 3.14*radius squared
		return r*r*3.14;
	}
	public  double calcPerimeter() {
		return (r+r)*3.14;
		
	}
	public boolean circleEqual(circle c) {
		
		if((c.getRadius()== this.r)&& (c.getCenter()== this.p)) {
			System.out.println("check radius" +this.r+ ","+ c.getRadius() );
			System.out.println("check x " +this.p.getX()+ ","+c.p.getX());
			System.out.println("check y "+ this.p.getY()+","+  c.p.getY());
			return true;
		}
		else {
			return false;
		}
		
	}
	public void circleMove(double dx,double dy){
		this.p.SetX(this.p.getX()+dx);
		this.p.SetY(this.p.getY()+dy);
	}
	void circleScale(double k) {
		this.r = this.r*k;
	}
	public boolean isInside(point g , circle c) {
		point h= c.getCenter();
		double d;
		d =  (int) (r*r-(( Math.pow(g.getX()-h.getX(), 2)) + Math.pow((-g.getY()-h.getY()), 2)));
       // radius^2- (x-x1)^2+(y-y1)^2
		System.out.println((int) (r*r-( Math.pow(h.getX()-g.getX(), 2)) + Math.pow((h.getY()-g.getY()), 2)));
		if(d>0) {
	    	return true;
		}
		else if(d<0) {
			return false;
		}
		return false;
		
		
	}
	

}
