package methodOverloading;

public class Printer {
	
	public void print(String name){
		System.out.println("You have entered your name as - " + name);
	}
	
	public void print(int age){
		System.out.println("You have entered your age as - " + age);
	}
	
	public static void main(String[] args) {
		Printer laserJet = new Printer();
		laserJet.print("Deepinder");
	}
	

}
