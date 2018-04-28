/**
 * Class Baseball inherits properties from Sport.
 * @author Eric Hoffman
 *
 */

//Class Baseball inherits Sport
public class Baseball extends Sport {
  
  /**
   * Declaring String ball.
   */
  private String ball;
  
  //overriding method sound from Sport
  //overriding means to override the functionality of an existing method

  public void sound() {
    System.out.println("The ball hitting the bat makes a CRACK! sound on the bat");
  }
  
  //Assigning all fields with a value
  /**
   * Assigning values to all variables.
   */
  public Baseball() {
    age = 38;
    number = 5;
    name = "Albert Pujols";
    sport = "Baseball";
    ball = "Small white ball with red laces";
  }

  /**
   * Assigning the variables to there parameter type.
   * @param num1 integer value assigned to age
   * @param num2 integer value assigned to number
   * @param str String value assigned to name
   * @param str1 String value assigned to sport
   * @param str2 String value assigned to ball
   */
  public Baseball(int num1, int num2, String str, String str1, String str2) {
    age = num1;
    number = num2;
    name = str;
    sport = str1;
    ball = str2;
  }

  /**
   * Public method returning the value assigned to ball.
   * @return String value assigned to ball
   */
  public String getBall() {
    return ball;
  }

  /**
   * Public method to set the private field value.
   * @param ball string value for the type of ball used
   */
  public void setBall(String ball) {
    this.ball = ball;
  }
}