package Customer;

public class Store {
	private static Customer[] arrCust;
	static int current;
	public Store() {
		this.arrCust=new Customer[100];
		this.current=0;
	}
	public Customer[] getArrCust() {
		return arrCust;
	}
	public void setArrCust(Customer[] arrCust) {
		this.arrCust = arrCust;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public static void addCustomer() {
		Customer newc=new Customer();
		arrCust[current]=newc;current++;
	}
	
}
