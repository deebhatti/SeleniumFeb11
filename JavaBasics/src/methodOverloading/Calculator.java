package methodOverloading;

public class Calculator {
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(double a, double b){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.add(10, 20);
		basicCal.add(10.2,6.3);
	}

}
