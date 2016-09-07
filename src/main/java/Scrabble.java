// import java.util.List;
// import java.util.ArrayList;

public class Scrabble {

  public static Integer runScrabble(String inputWord) {
    // inputWord = inputWord.toUpperCase();
    // String[] inputArray = inputWord.split("");
    int score = 0;
    for (int i = 0; i < inputWord.length(); i++){
      if (inputWord.charAt(i) == 'a' || inputWord.charAt(i) == 'e' || inputWord.charAt(i) == 'i' || inputWord.charAt(i) == 'o' || inputWord.charAt(i) == 'u' || inputWord.charAt(i) == 'l'|| inputWord.charAt(i) == 'n' || inputWord.charAt(i) == 'r' || inputWord.charAt(i) == 's' || inputWord.charAt(i) == 't'){
        score += 1;
      } else if (inputWord.charAt(i) == 'd' || inputWord.charAt(i) == 'g'){
        score += 2;
      }
      else if (inputWord.charAt(i) == 'b' || inputWord.charAt(i) == 'c'|| inputWord.charAt(i) == 'm' || inputWord.charAt(i) == 'p'){
        score += 3;
      } else if (inputWord.charAt(i) == 'f' || inputWord.charAt(i) == 'h'|| inputWord.charAt(i) == 'v' || inputWord.charAt(i) == 'w'|| inputWord.charAt(i) == 'y'){
        score += 4;
      } else if (inputWord.charAt(i) == 'k'){
        score += 5;
      }
      else if (inputWord.charAt(i) == 'j' || inputWord.charAt(i) == 'x'){
        score += 8;
      } else if (inputWord.charAt(i) == 'q' || inputWord.charAt(i) == 'z'){
        score += 10;
      }

    }
    return score;
  }
}
