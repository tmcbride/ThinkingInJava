/**
 * Created by tmcbride on 4/19/2015.
 */
public class ExerciseOneOne {
  private int testInt;
  private int testChar;
  static int staticInt = 1;

  public void checkVariables() {
    System.out.println("Test Integer: " + testInt);
    System.out.println("Test Character: "+testChar);
  }

  public static void checkStaticInt() {
    System.out.println("The current value is " + staticInt);
  }

  public void setStaticInt(int newValue) {
    staticInt = newValue;
  }
}
