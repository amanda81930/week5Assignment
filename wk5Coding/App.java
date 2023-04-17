package wk5Coding;

public class App {

  public static void main(String[] args) {

    Logger logger = new AsteriskLogger();
    logger.log("Week 5");
    System.out.println();
    logger.error("Week 5");
    System.out.println();

    Logger logger1 = new SpacedLogger();
    logger1.log("Object-Oriented Programming");
    System.out.println();
    logger1.error("Object-Oriented Programming");
    System.out.println();

  } // end of main METHOD


} // end of App CLASS
