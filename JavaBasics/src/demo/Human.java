package demo;

public class Human {
	
	String color; //Variables declared at the class level are called as Fields
	int age;
	String gender;
	
	public Human(){  //Default Constructor
		color = "Brown";
		age = 27;
		gender = "Male";
	}
	
	public Human(String humanColor, int humanAge, String humanGender){ //Parameterized Constructor
		color = humanColor;
		age = humanAge;
		gender = humanGender;
	}
	
	public void printDetails(){
		System.out.println("Color = " + color + " Age = " + age  + " Gender = " + gender);
	}
	
	public static void main(String[] args) {
		Human John = new Human("White",25,"Male");
		Human Ram = new Human("Brown",27,"Male");
		Human Rose = new Human("Brown",29,"Female");
		Human Tim  = new Human();
		
		
		Tim.printDetails();
	}
	
	
	

}
