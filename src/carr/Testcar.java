package carr;

import java.util.Scanner;

public class Testcar {
	  public static Scanner reader= new Scanner(System.in);
	public static void main(String[] args) {
		Car[] car= new Car[100];
		for(int i=0;i<car.length;i++) {
			String model= reader.nextLine();
			int year= reader.nextInt();
			int distance= reader.nextInt();
			int price=reader.nextInt();
			car[i]=new Car(model,year, distance, price) ;
		}
	for(int i=0;i<car.length;i++) {
		SaleCar.printmodel(car[i]);//3b
	}
	System.out.println("enter price and distance to check on all cars  ");
	int p=reader.nextInt();
	int d= reader.nextInt();
	SaleCar.smaller(car,p,d);//3c
	System.out.println(SaleCar.averageprice(car));//3d
	int averagepric= SaleCar.averageprice(car);//3d
	System.out.println(averagepric);
	SaleCar.mostexpensive(car);
  }
}


