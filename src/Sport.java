//Eric Hoffman
//Sport class
public class Sport {
  protected int age;
  protected int number;
  protected String name;
  protected String sport;
  
  //method for sound of the ball
  public void sound() {
    System.out.println("sound of the ball");
  }

  public Sport() {
    age = 0;
    number = 0;
    name = "Name";
    sport = "sport";
  }

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

  public void setNumber(int number) {
    this.number = number;
  }

  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

}


