import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 * My Project that integrates my skills I've learned.
 * Asks for a lot of numbers from the user.
 * Also includes some of my interests like sports, cars, and technology
 * @author Eric Hoffman
 *
 */
public class Main {
  
  //Lambda Expression interface
  interface Greetings {
    void sayMessage(String message);
  }

  /**
   * Public method to do division of two doubles.
   * @param number1 double value assigned to number1 for division
   * @param number2 double value assigned to number2 for division
   * @return the division value of the two doubles
   */
  public static double divisionCalc(double number1, double number2) {
    //method body
    double division;
    division = number1 / number2;
    return division;

  }

  /**
   * Public method to multiply two doubles.
   * @param number1 double value used as the first number in the multiplication
   * @param number2 double value used as the divisor in the multiplication
   * @return
   */
  public static double multiplicationCalc(double number1, double number2) {
    double multiplication;
    multiplication = number1 * number2;
    return multiplication;
  }

  /**
   * Public method that gets the max value of an array.
   * @param inputArray is the array used in the loop that will be declared in main
   * @return max value of the array
   */
  public static int getMax(int[] inputArray) {
    //method body
    int maxValue = inputArray[0];
    for (int i = 1; i < inputArray.length; i++) {
      if (inputArray[i] > maxValue) {
        maxValue = inputArray[i];
      }
    }
    return maxValue;
  }

  /**
   * Public method to get the minimum value in an array.
   * @param inputArray is the array used in the loop that will be declared in main
   * @return minimum value in an array
   */
  public static int getMin(int[] inputArray) {
    //method body
    int minValue = inputArray[0];
    for (int i = 1; i < inputArray.length; i++) {
      if (inputArray[i] < minValue) {
        minValue = inputArray[i];
      }
    }
    return minValue;
  }
  //method from tutorials point for showpush
  
  static void showpush(Stack<Integer> stacker, int s) {
    stacker.push(s);
    System.out.println("push(" + s + ")");
    System.out.println("stack: " + stacker);
  }
  
  //method from tutorials point for showpop
  
  static void showpop(Stack<Integer> stacker) {
    System.out.println("pop -> ");
    Integer a = (Integer) stacker.pop();
    System.out.println(a);
    System.out.println("stack: " + stacker);
  }

  // static difinition: Belonging to the class, not belonging to the object.
  /**
   * Main method that executes all code and returns all the elements to the user.
   * @param args A string array containing command line arguments
   */
  public static void main(String[] args) {
    // calling date and showing user
    LocalDate currentDate = LocalDate.now();
    System.out.println("Todays date is: " + currentDate);
    
    //calling current time and showing user
    LocalTime currentTime = LocalTime.now();
    System.out.println("The current time is: " + currentTime);
    
    LocalDate myDateOfBirth = LocalDate.of(1997, 9, 22);
    System.out.println("I was born on " + myDateOfBirth);

    Scanner scan = new Scanner(System.in);
    
    //Lambda Expression
    Greetings greetService = message ->
        System.out.println("Hello " + message);
    greetService.sayMessage("Professor");
    // sysout ctrl+space

    // Ask for users name
    System.out.println("What is your name?");
    String userName = scan.nextLine();
    // A variable is a location in memory
    // There are 8 primitive data types
    // byte: 8 bit value, minimum of -128 and max of 127
    // short: 16 bit value, minimum of -32,768 and a max of 32,767
    // int: 32 bit, used for non decimal numbers
    // long: twice the size of an int
    // float: 32 bit, used for floating point numbers or decimals
    // double: 64 bit, same as float, but double the range of values
    // boolean: 2 possible values, True or False
    // char: 16 bit unicode, minimum is 0 and max is 65,535

    System.out.println("enter x1");
    int x1 = scan.nextInt();
    System.out.println("Your name plus the number is " + userName + x1);

    // Showing off my fast car from my Car class
    System.out.println("Do you like fast cars? I have a fast car, it goes ");
    Car myCar = new Car();
    myCar.setSpeed(250);
    myCar.setMake("Ford");
    System.out.println(myCar.getSpeed() + "mph");
    System.out.println("It is a " + myCar.getMake());

    // Converting a double to an int
    System.out.println("Please enter a double to be converted into an Integer");
    double num2 = scan.nextDouble();
    int num1 = (int) num2;
    System.out.println("The Integer is " + num1);

    // Dividing two int's and using try catch to make sure
    // two int's are entered
    int a = 0;
    int b = 0;
    boolean goodInput = false;
    while (goodInput == false) {
      System.out.println("Enter two Integers");
      try {
        a = scan.nextInt();
        b = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("At least one number entered is not an Integer");
        scan.nextLine();
      }
    }
    System.out.println("a divided by b is " + (double) a / b);
    System.out.println("The remainder in the division would be " + a % b);

    // String method to return an int and a double in String
    int c = 5;
    double d = 5.25;
    String s1 = String.valueOf(c);
    String s2 = String.valueOf(d);
    System.out.println("The string value of int c is " + s1);
    System.out.println("The string value of the double d is " + s2);

    // String method to return the index of a letter
    String str1 = "I don't have a theme for this project";
    System.out.println("Index of t in str1: " + str1.indexOf('t'));

    // Calculating the price of a meal including the tax and tip
    // Use try catch to make sure correct type is entered
    double mealCost = 0;
    double tipPercent = 0;
    double taxPercent = 0;
    boolean inputGood = false;
    while (inputGood == false) {
      System.out.println("Enter your meal cost, percent tip, and tax percent.");
      try {
        mealCost = scan.nextDouble();
        tipPercent = scan.nextDouble();
        taxPercent = scan.nextDouble();
        inputGood = true;
      } catch (InputMismatchException ex) {
        System.out.println("All numbers must be a double");
        scan.nextLine();
      }
    }
    double tipCost = ((mealCost * tipPercent) / 100);
    double tax = ((mealCost * taxPercent) / 100);
    double totalCost = (mealCost + tipCost + tax);
    int totalRoundedCost = (int) Math.round(totalCost);
    System.out.println("The total meal cost is " + totalRoundedCost + " dollars.");

    // Switch to tell the user what month it is
    System.out.println("Enter the number of the current month");
    int month = scan.nextInt();
    String monthString;
    switch (month) {

      case 1:
        monthString = "January";
        break;
      case 2:
        monthString = "February";
        break;
      case 3:
        monthString = "March";
        break;
      case 4:
        monthString = "April";
        break;
      case 5:
        monthString = "May";
        break;
      case 6:
        monthString = "June";
        break;
      case 7:
        monthString = "July";
        break;
      case 8:
        monthString = "August";
        break;
      case 9:
        monthString = "September";
        break;
      case 10:
        monthString = "October";
        break;
      case 11:
        monthString = "November";
        break;
      case 12:
        monthString = "December";
        break;
      default:
        monthString = "Invalid month";

    }
    System.out.println(monthString);

    System.out.println("Enter two doubles that are greater than 0");
    double e = scan.nextDouble();
    double f = scan.nextDouble();
    if (e < 0 || f < 0) {
      System.out.println("One of the entered numbers is negative");
    } else {
      // Call multiplication method
      System.out.println("Your numbers multiplied equal " + (multiplicationCalc(e, f)));
      // Call division method
      System.out.println("Your numbers divided equal " + (divisionCalc(e, f)));
      System.out.println("Your numbers squared equal " + Math.pow(e, 2) + " and " + Math.pow(f, 2));
    }
    System.out.println("Let's flip a coin!");

    Random rand = new Random();

    int result = rand.nextInt(2);

    if (result == 0) {
      System.out.println("It landed on heads"); 
    } else if (result == 1) {
      System.out.println("It landed on tails"); 
    } else if (result == 3) {
      System.out.println("It landed on the side. fix your random number generator");

    }
    System.out.println("Please enter two int values to enter in a loop");
    int initialValue = scan.nextInt();
    int finalValue = scan.nextInt();
    int counter = 0;

    if (initialValue < finalValue) {
      System.out.println("Input accepted!");
      System.out.println("Initial Value: " + initialValue);
      System.out.println("Final Value: " + finalValue);
      System.out.println();
      System.out.println("Initiating count.");
      System.out.println();

      System.out.println(initialValue);
      counter++;

      while (initialValue < finalValue) {
        initialValue++;
        System.out.println(initialValue);
        counter++;

      }

      if (initialValue == finalValue) {

        System.out.println();
        System.out.println("Counting complete.");
        System.out.println("There are " + counter + " numbers (inclusive) between " 
            + (initialValue - counter + 1)
            + " and " + finalValue + "."); 
      } else {
        System.out.println("Final value is less than initial value!");
        System.out.println("Please choose new values.");
      }
      // for loop that decrements by one and prints out the value
      for (int i = 10; i > 1; i--) {
        System.out.println("The value of i is: " + i);
      }
      // for each loop that counts the number of elements in the array
      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      for (int item : numbers) {
        System.out.println("Count is: " + item);

      }
      // New array to show max, min, sum,
      // and index of each number
      int[] arr = new int[] { 2, 5, 13, 20, 100, 219 };
      //for loop using .length to loop through array
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }
      // Invoke max method of an array
      //The int array arr is the argument passed
      int max = getMax(arr);
      System.out.println("The maximum value of the array is: " + max);

      // Invoke minimum method of an array
      int min = getMin(arr);
      System.out.println("The minimum value of the array is: " + min);

      // for each loop to calculate the sum of the array
      int sum = 0;
      for (int num : arr) {
        sum = sum + num;
      }
      System.out.println("The sum of the array is: " + sum);
      

      // for each loop to show the index of each element
      for (int i = 0; i < arr.length; i++) {
        System.out.println("The number at index " + i + " is: " + arr[i]);
      }

      System.out.println("What is racecar spelled backwards?");

      // New string to use String builder methods
      String palindrome = "racecar";

      // String builder to reverse the String order
      StringBuilder sb = new StringBuilder(palindrome);
      sb.reverse();

      System.out.println("It is: " + sb);

      // String builder to delete a part of the string
      StringBuilder ab = new StringBuilder(palindrome);
      ab.delete(4, 7);

      System.out.println(ab);

      // String builder to replace a part of the string
      StringBuilder ac = new StringBuilder(palindrome);
      ac.replace(0, 4, "Eric has a cool ");

      System.out.println(ac);

      // Access my Baseball class that inherits the properties and methods of Sport
      Baseball myBaseball = new Baseball();
      System.out.println("He plays: " + myBaseball.getSport());
      System.out.println("His number is: " + myBaseball.getNumber());
      System.out.println("He is " + myBaseball.getAge() + " years old");
      System.out.println("His name is " + myBaseball.getName());
      System.out.println("The ball used in baseball is a " + myBaseball.getBall());

      // Access my Basketball class that inherits the properties and methods of Sport
      Basketball myBasketball = new Basketball();
      System.out.println("He plays: " + myBasketball.getSport());
      System.out.println("His number is: " + myBasketball.getNumber());
      System.out.println("He is " + myBasketball.getAge() + " years old");
      System.out.println("His name is " + myBasketball.getName());
      System.out.println("He is playing in the " + myBasketball.getGame());
      
      //overriding means to override the functionality of an existing method
      //Having the same method names in a base and in a derived class

      //Sport reference and object
      Sport a1 = new Sport();
      
      //Sport reference but Baseball object
      Sport a2 = new Baseball();
      
      //Sport reference but Basketball object
      Sport a3 = new Basketball();
      
      
      //runs sound method in Sport class
      a1.sound();
      
      //runs sound method in Baseball class
      a2.sound();
      
      //runs sound method in Basketball class
      a3.sound();
      
      //Polymorphism is where a subclass defines their own unique
      //behaviors and uses some of the parent class
      //The base methods can be overridden
      //Objects of derived type can be stored in a container declared as base type
      //Overridden method code will be executed even from call that
      //seems to be from base type
      
      //Used model from Module 10 to show polymorphism
      Samsung galaxy = new Samsung();
      Apple iphone = new Apple();
      Phone[] myPhones = { iphone, galaxy };
      for (Phone anPhone : myPhones) {
        anPhone.showBrand();
        anPhone.showColor();
      }
      
      // 2D Array model based off professors in Module 09
      int[][] bulls = new int[4][];
      bulls[0] = new int[7];
      bulls[1] = new int[8];
      bulls[2] = new int[9];
      bulls[3] = new int[10];

      for (int m = 0; m < bulls.length; m++) {
        for (int n = 0; n < bulls[m].length; n++) {
          bulls[m][n] = m + n;
        }
      }

      for (int m = 0; m < bulls.length; m++) {
        for (int n = 0; n < bulls[m].length; n++) {
          System.out.println(bulls[m][n] + " ");
        }
      }
      
      //ArrayList
      ArrayList<Integer> cool = new ArrayList<Integer>();
      
      //add elements to array list
      cool.add(1);
      cool.add(2);
      cool.add(5);
      cool.add(10);
      cool.add(45);
      cool.add(100);
      cool.add(125);
      //Return size of cool
      System.out.println("The size of cool is " + cool.size());
      
      //Show array list
      System.out.println("Cool has this in it " + cool);
      
      
      //remove elements from list
      cool.remove(0);
      cool.remove(4);
      
      System.out.println("The size of cool is now " + cool.size());
      System.out.println("Cool now contains" + cool);
      
      //Access NewShoes class
      NewShoes s = new NewShoes();
      s.color();
      s.size();
      s.brand();
      
      //stack using tutorials point layout
      Stack<Integer> stacker = new Stack<Integer>();
      System.out.println("stack: " + stacker);
      showpush(stacker, 13);
      showpush(stacker, 23);
      showpush(stacker, 5);
      showpush(stacker, 1997);
      showpop(stacker);
      showpop(stacker);
      try {
        showpop(stacker);
      } catch (EmptyStackException e1) {
        System.out.println("The stack is empty");
      }
      
      // String method
      String str = "Welcome to my sweet integration project";
      System.out.println(str.contains("sweet"));
      
      scan.close();
      System.out.println("GoodBye!");

    }
  }
}
