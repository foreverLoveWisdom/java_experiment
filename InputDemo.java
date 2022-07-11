import java.util.Scanner;

public class InputDemo {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int myInt = input.nextInt();
    System.out.printf("You entered: %d.%n%n", myInt);
  }
}
