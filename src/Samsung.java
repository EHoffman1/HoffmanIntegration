/**
 * The class samsung inherits properties of phone and returns color and brand.
 * @author Eric Hoffman
 *
 */

public class Samsung extends Phone {

  //Overriding base method to show the brand is Samsung
  public void showBrand() {
    System.out.println("Samsung running Android");
  }
  
  //Overriding base method to show the color is matte black
  public void showColor() {
    System.out.println("Matte Black");
  }

}
