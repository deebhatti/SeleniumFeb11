package inheritance;

public class HR extends Management{
	
	
	
	int bonus = 12000; 
	
	public static void main(String[] args) {
		HR Tim = new HR();
		System.out.println("Total Annual Compensation of Tim = $ " + (Tim.salary+Tim.bonus));
	}

}
