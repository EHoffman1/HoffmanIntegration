/**
 * Class Basketball inherits all properties of Sport.
 * @author Eric Hoffman
 *
 */

//Class basketball inherits Sport
public class Basketball extends Sport {
  
  /**
   * Declaring the String game.
   */
  private String game;
  
  //overriding method sound of Sport
  //overriding means to override the functionality of an existing method
  public void sound() {
    System.out.println("When the ball hits nothing but net is makes a SWISH sound");
  }

  /**
   * Public method overriding the values originally assigned in Sport.
   * 
   */
  public Basketball() {
    //Overriding what is assigned in Sport
    age = 25;
    number = 23;
    name = "Michael Jordan";
    sport = "Basketball";
    game = "Playoffs";
    
  }
  
  /**
   * Assigning variables to there parameter type.
   * @param num1 integer value assigned to age
   * @param num2 integer value assigned to number
   * @param str String value assigned to name
   * @param str1 String value assigned to sport
   * @param str2 String value assigned to ball
   */
  public Basketball(int num1, int num2, String str, String str1, String str2) {
    age = num1;
    number = num2;
    name = str;
    sport = str1;
    game = str2;
  }

  public String getGame() {
    return game;
  }

  /**
   * Public method to set the private field value.
   * @param game String value for the type of game 
   */
  public void setGame(String game) {
    this.game = game;
  }
}
