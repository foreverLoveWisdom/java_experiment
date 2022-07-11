import java.util.Arrays;

public class HelloWorld {
  public static void main(String[] args){
    System.out.println("Hello World!");
    int x = (int) 20.9;

    System.out.println(x);

    String msg = "I am not afraid of you anymore...";
    msg = "Are you sure????";
    System.out.println(msg + "!!!");

    System.out.println("What is your lenght? " + msg.length());
    String[] bankAccounts= {"abc", "def", "aisntarietn"};

    System.out.println(Arrays.toString(bankAccounts));
  }
}
