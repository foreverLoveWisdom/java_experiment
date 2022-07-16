package staticdemo;

class MyClass {
	// non static field and method
	public String message = "Hello World";

	public void displayMessage() {
		System.out.println(message);
	}

	// Static field and method
	public static String Greetings ="Good morning";

	public static void displayGreetings() {
		System.out.println(Greetings);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		MyClass sd = new MyClass();
		System.out.println(sd.message);
		sd.displayMessage();

		System.out.println(MyClass.Greetings);
		MyClass.displayGreetings();
	}
}
