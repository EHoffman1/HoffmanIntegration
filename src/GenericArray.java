/**
 * Generic method of Array.
 * @author Eric Hoffman
 *
 */
public class GenericArray {
  
  /**
   * public method to loop through the array.
   * @param inputArray is the array that will be used in this method declared in main
   */
  public static <E> void printArray(E[] inputArray) {
    // Display array elements
    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }


  /**
   * Main method that returns all the elements of each array.
   * @param args A string array containing command line arguments
   */
  public static void main(String[] args) {
    // Create arrays of Integer, Double and Character
    //Used professors model
    Integer[] intArray = { 1, 2, 5, 10, 25 };
    final Double[] doubleArray = {2.5, 5.5, 10.55, 25.1, 50.9 };
    final Character[] charArray = { 'G', 'R', 'E', 'E', 'T', 'I', 'N', 'G', 'S' };

    System.out.println("Array integerArray contains:");
    printArray(intArray); // pass an Integer array

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray); // pass a Double array

    System.out.println("\nArray characterArray contains:");
    printArray(charArray); // pass a Character array
  }
}