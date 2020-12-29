package Customer;

public class Program {
	private static Store s= new Store();
	private static int num;//0<num<100
	public static String phonenumber() {
		Customer[] cus= s.getArrCust();
		num=s.getCurrent();
		Customer number=cus[num];
		if(!number.equals("")) {
			return String.valueOf(number);
		}
		return "no";
	}
}
