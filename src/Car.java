/**
 * Class Car that creates a car object with speed and make.
 * @author Eric Hoffman
 *
 */
public class Car {

  /**
   * Declaring integer speed and String make.
   */
  private int speed;
  private String make;

  /**
   * Public method to set the private field value.
   * 
   * @param s
   *          integer value for speed of the car
   */
  public void setSpeed(int s) {
    speed = s;
  }

  public int getSpeed() {
    return speed;
  }

  public String getMake() {
    return make;
  }

  /**
   * Public method to set the private field value.
   * 
   * @param m
   *          String value for make of the car
   */
  public void setMake(String m) {
    make = m;
  }
}