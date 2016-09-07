import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  // @Test
  // public void runScrabble_makeInputUpperCase_String() {
  //   Scrabble testScrabble = new Scrabble();
  //   String expectedOutput = "A";
  //   assertEquals(expectedOutput, testScrabble.runScrabble("a"));
  // }

  @Test
  public void runScrabble_findValueOfSingleLetter_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 1;
    assertEquals(expectedOutput, testScrabble.runScrabble("a"));
  }

  @Test
  public void runScrabble_findCharacterWorth2Points_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 2;
    assertEquals(expectedOutput, testScrabble.runScrabble("d"));
  }

  @Test
  public void runScrabble_findCharacterWorth3Points_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 3;
    assertEquals(expectedOutput, testScrabble.runScrabble("b"));
  }

  @Test
  public void runScrabble_findCharacterWorth4Points_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 4;
    assertEquals(expectedOutput, testScrabble.runScrabble("f"));
  }

  @Test
  public void runScrabble_findCharacterWorth5Points_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 5;
    assertEquals(expectedOutput, testScrabble.runScrabble("k"));
  }

  @Test
  public void runScrabble_findCharacterWorth8Points_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 8;
    assertEquals(expectedOutput, testScrabble.runScrabble("j"));
  }

  @Test
  public void runScrabble_findCharacterWorth10Points_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 10;
    assertEquals(expectedOutput, testScrabble.runScrabble("z"));
  }

  @Test
  public void runScrabble_addUpPoints_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 8;
    assertEquals(expectedOutput, testScrabble.runScrabble("hello"));
  }
}
