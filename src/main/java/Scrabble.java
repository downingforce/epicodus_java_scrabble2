import java.util.List;
import java.util.ArrayList;

public class Scrabble {

  public static Integer runScrabble(String inputWord) {
    inputWord = inputWord.toUpperCase();
    String[] inputArray = inputWord.split("");
    int score = 0;
    for (int i = 0; i < inputArray.length; i++){
      if (inputArray[i].equals("A") || inputArray[i].equals("E") || inputArray[i].equals("I") || inputArray[i].equals("O") || inputArray[i].equals("U") || inputArray[i].equals("L")|| inputArray[i].equals("N") || inputArray[i].equals("R") || inputArray[i].equals("S") || inputArray[i].equals("T")){
        score += 1;
      } else if (inputArray[i].equals("D") || inputArray[i].equals("G")){
        score += 2;
      }
      else if (inputArray[i].equals("B") || inputArray[i].equals("C")|| inputArray[i].equals("M") || inputArray[i].equals("P")){
        score += 3;
      } else if (inputArray[i].equals("F") || inputArray[i].equals("H")|| inputArray[i].equals("V") || inputArray[i].equals("W")|| inputArray[i].equals("Y")){
        score += 4;
      } else if (inputArray[i].equals("K")){
        score += 5;
      }
      else if (inputArray[i].equals("J") || inputArray[i].equals("X")){
        score += 8;
      } else if (inputArray[i].equals("Q") || inputArray[i].equals("Z")){
        score += 10;
      }

    }
    return score;
  }
}
