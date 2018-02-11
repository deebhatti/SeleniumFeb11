package demo;

public class B {
	
	public void date(){
		System.out.println("Today it is 27");
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.month();
		b.date();
	}

}
