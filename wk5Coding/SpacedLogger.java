package wk5Coding;

public class SpacedLogger implements Logger {


  @Override
  public void log(String log) {
    for (int i = 0; i < log.length(); i++) {
      System.out.print(log.charAt(i) + " ");
    } // end of for loop
    System.out.println();
  } // end of log METHOD

  @Override
  public void error(String error) {
    System.err.print("ERROR: "); //the System.err.print prints red error messages
    for (int i = 0; i < error.length(); i++) {
      System.err.print(error.charAt(i) + " "); //the System.err.print prints red error messages
    } // end of for loop
  } // end of error METHOD


} // end of SpacedLogger CLASS
