package wk5Coding;

public class AsteriskLogger implements Logger { // step 3


  @Override
  public void log(String log) {
    System.out.println("***" + log + "***");
  } // end of log METHOD

  @Override
  public void error(String error) {
    checkAsterisk(error);
    System.err.print("***ERROR: " + error + "***");
  //the System.err.print prints red error messages
    System.out.println();
    checkAsterisk(error);
  } // end of error METHOD


  public static void checkAsterisk(String error) {
    int num = 13 + error.length();
    for (int i = 0; i < num; i++) {
      System.err.print("*"); //the System.err.print prints red error messages
    } // end of for loop
    System.out.println();
  } // end of checkAsterisk METHOD

} // end of AsteriskLogger CLASS
