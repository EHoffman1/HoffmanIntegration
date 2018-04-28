//Eric Hoffman
//Generic Array class
public class GenericArray {
  // generic method printArray
  public static <E> void printArray(E[] inputArray) {
    // Display array elements
    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  public static void main(String args[]) {
    // Create arrays of Integer, Double and Character
    //Used professors model
    Integer[] intArray = { 1, 2, 5, 10, 25 };
    Double[] doubleArray = {2.5, 5.5, 10.55, 25.1, 50.9 };
    Character[] charArray = { 'G', 'R', 'E', 'E', 'T', 'I', 'N', 'G', 'S' };

    System.out.println("Array integerArray contains:");
    printArray(intArray); // pass an Integer array

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray); // pass a Double array

    System.out.println("\nArray characterArray contains:");
    printArray(charArray); // pass a Character array
  }
}