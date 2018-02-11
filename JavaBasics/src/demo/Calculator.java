package demo;

public class Calculator {
	public Calculator(){
		
	}

	public int add(int a, int b) { // a and b are called as Formal Parameters
		return (a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		System.out.println(basicCal.add(10, 20));

		// 10 and 20 are called as Actual Parameters
		// basicCal.subtract(70, 60);
		basicCal.multiply(16, 5);

	}

}
