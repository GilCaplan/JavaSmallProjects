package carr;

public class Car {
	private String model;
	private int year;
	private int distance;
	private int price;
	Car(String model,int year,int distance,int price){
		this.model=model;
		this.year=year;
		this.distance=distance;
		this.price=price;
	}
	public String getmodel() {
		return this.model;
	}
	public int getyear() {
		return this.year;
	}
	public int getdistance() {
		return this.distance;
	}
	public int getprice() {
		return this.price;
	}
	public void setPrice(int newprice) {
		this.price=newprice;
	}
	public String toString() {
		return "model: "+getmodel()+" year: "+getyear()+ " distance traveled: "+getdistance()+ " price is: "+getprice();
	}

}
