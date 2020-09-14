package week11;

public class Cat {
	String breed="NN";
	String size;
	String colour;
	int age;
	
	void print() {
		System.out.println("Breed is"+breed);
		System.out.println("Size is"+size);
		System.out.println("Colour is"+colour);
		System.out.println("Age is"+age);
	}
	void name() {
		
		System.out.println("My Cat");
	}
	
	public static void main (String[]args) {
		Cat Cat1 = new Cat();
		Cat Cat2 = new Cat();
		Cat1.breed="Thai";
		Cat1.size="Big";
		Cat1.colour="Back";
		Cat1.age=5;
		Cat1.print();
		Cat1.breed="Thai";
		Cat1.size="Big";
		Cat1.colour="Back";
		Cat1.age=5;
		Cat1.print();
		Cat2.breed="Sfring";
		Cat2.size="Big";
		Cat2.colour="Back";
		Cat2.age=5;
		Cat2.print();
		Cat2.breed="Thai";
		Cat2.size="Big";
		Cat2.colour="Back";
		Cat2.age=5;
		Cat2.print();
		System.out.println();
		
		
	}
	
}
