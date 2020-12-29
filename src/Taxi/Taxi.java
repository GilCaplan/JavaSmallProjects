package Taxi;

import java.util.Scanner;

public class Taxi {
	public static Scanner reader= new Scanner(System.in);
	private String taxID;
	private String driverName;
	private int numPass;
	private boolean available=true;
	Taxi(String taxID, String driverName, int numPass, boolean available){
		this.taxID=reader.nextLine();
		this.driverName=reader.nextLine();
		this.numPass=4;
		this.available=available;
	}
	public String getId() {
		return this.taxID;
	}
	public String getName() {
		return this.driverName;
	}
	public int getNumPass() {
		return this.numPass;
	}
	public boolean isAvailable() {
		return this.available;
	}
	public void taxibusy() {
		this.available=false;
	}

}
