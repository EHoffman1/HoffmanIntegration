/**
 * Sport class that returns a persons age, number, name, and sport.
 * @author Eric Hoffman
 *
 */

public class Sport {
  
  /**
   * Declaring all variables I used in the class.
   */
  protected int age;
  protected int number;
  protected String name;
  protected String sport;
  
  //method for sound of the ball
  public void sound() {
    System.out.println("sound of the ball");
  }

  /**
   * Public method assigning values to the variables.
   */
  public Sport() {
    age = 0;
    number = 0;
    name = "Name";
    sport = "sport";
  }

  /**
   * Assigning the variables to their parameters.
   * @param num1 integer value assigned to age
   * @param num2 integer value assigned to number
   * @param str String value assigned to name
   * @param str1 String value assigned to sport
   */
  public Sport(int num1, int num2, String str, String str1) {
    age = num1;
    number = num2;
    name = str;
    sport = str1;
  }
  
  //Setters and Getters
  
  public int getNumber() {
    return number;
  }

  /**
   * Public method to set the private field value.
   * @param number integer value for number of the player
   */
  public void setNumber(int number) {
    this.number = number;
  }

  public String getSport() {
    return sport;
  }

  /**
   * Public method to set the private field value.
   * @param sport String value for what sport it is
   */
  public void setSport(String sport) {
    this.sport = sport;
  }

  public int getAge() {
    return age;
  }

  /**
   * Public method to set the private field value.
   * @param age integer value for the age of the person
   */
  public void setAge(int age) {
    this.age = age;
  }
  
  public String getName() {
    return name;
  }
  
  /**
   * Public method to set the private field value.
   * @param name String value for the name of the person
   */
  public void setName(String name) {
    this.name = name;
  }

}


