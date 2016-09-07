import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a word");
    String userInput = myConsole.readLine();
    System.out.println(Scrabble.runScrabble(userInput));

  }
}
