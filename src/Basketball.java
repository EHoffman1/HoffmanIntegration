//Eric Hoffman
//Basketball class that inherits Sport
public class Basketball extends Sport {
  private String game;
  
  //overriding method sound of Sport
//overriding means to override the functionality of an existing method
  public void sound() {
    System.out.println("When the ball hits nothing but net is makes a SWISH sound");
  }

  public Basketball() {
    //Overriding what is assigned in Sport
    age = 25;
    number = 23;
    name = "Michael Jordan";
    sport = "Basketball";
    game = "Playoffs";
    
  }
  
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

  public void setGame(String game) {
    this.game = game;
  }
}
