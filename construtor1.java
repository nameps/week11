package week11;

public class construtor1 {
	int age=5;
	String size;
	String breed="Thai";
	
	public construtor1(){
		System.out.println("My Cat is age="+age);
		System.out.println("My Cat is breed"+breed);
	}
	void macethod1() {
		System.out.println("My Cat is size"+size);
	}
	
	void maethod2() {
		
	}
	public static void main(String[]args) {
		String size="Big";
		construtor1 Cat1 = new construtor1();
		construtor1 Cat2 = new construtor1();
		Cat2.size="Small";
		
		
		
		
	}
	
	
	
}
