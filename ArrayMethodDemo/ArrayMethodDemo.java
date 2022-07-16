import java.util.Arrays;

class MyClass {
  public void passPrimitive(int primitiveParam) {
    primitiveParam = 10;
    System.out.println("Value inside method = " + primitiveParam);
  }

  public void passReference(int[] referenceParam) {
    referenceParam[1] = 10;
    System.out.println("Value inside method = " + referenceParam[1]);
  }

  public void printFirstElement(int[] a) {
    System.out.println("The first element is " + a[0]);
  }

  public int[] returnArray() {
    int[] a = new int[3];

    for (int i = 0; i < a.length; i++) {
      a[i] = i * 2;
    }

    return a;
  }
}

public class ArrayMethodDemo {
  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    int[] myArray = { 1, 2, 3, 4, 5, 6 };
    myClass.printFirstElement(myArray);

    int[] myArray2 = myClass.returnArray();
    System.out.println(Arrays.toString(myArray2));

    int number = 2;
    System.out.println("Number before = " + number);
    myClass.passPrimitive(number);
    System.out.println("Number after = " + number);

    System.out.print("\n");

    System.out.println("myArray[1] before = " + myArray[1]);
    myClass.passReference(myArray);
    System.out.println("myArray[1] after = " + myArray[1]);
  }
}
