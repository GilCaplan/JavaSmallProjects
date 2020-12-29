package carr;

import java.util.Scanner;

public class SaleCar {
	
	  public static Scanner reader= new Scanner(System.in);
	  public static void printmodel(Car car) {
		  System.out.println(car.toString());
	  }
	  public static void smaller(Car[] car, int price, int distance) {
		  for(int i=0;i<car.length;i++) {//smaller equal to price and bigger equal to distance
				if(car[i].getprice()<=price && car[i].getdistance()>=distance) {
					System.out.println(car[i].toString());
				}
			}
	  }
	  public static int averageprice(Car[] car) {
		  int sum=0;
		  
		  return (int)(sum/car.length);
	  }
	  public static void mostexpensive(Car[] car) {
		  String max="";int maxp=0;
		  for(int i=0;i<car.length;i++) {//smaller equal to price and bigger equal to distance
			 maxp=Math.max(maxp, car[i].getprice());
			 if(maxp==car[i].getprice()) {max=car[i].toString();}
			}
		  System.out.println("most expensive car is: "+max);
	  }
	  
		  private Car[] car= new Car[100] ;
		  public SaleCar(Car[] car) {
			  this.car=car;
		  }
}
