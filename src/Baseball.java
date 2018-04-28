//Eric Hoffman
//Baseball class that inherits Sport
public class Baseball extends Sport {
  private String ball;
  
  //overriding method sound from Sport
  //overriding means to override the functionality of an existing method
  public void sound() {
    System.out.println("The ball hitting the bat makes a CRACK! sound on the bat");
  }

  public Baseball() {
    //Overriding what is assigned in Sport
    age = 38;
    number = 5;
    name = "Albert Pujols";
    sport = "Baseball";
    ball = "Small white ball with red laces";
  }

  public Baseball(int num1, int num2, String str, String str1, String str2) {
    age = num1;
    number = num2;
    name = str;
    sport = str1;
    ball = str2;
  }

  public String getBall() {
    return ball;
  }

  public void setBall(String ball) {
    this.ball = ball;
  }
}