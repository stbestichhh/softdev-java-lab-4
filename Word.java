import java.util.ArrayList;

/**
 * Represents word in a sentence
 */
public class Word {
  public final List<Letter> letters;

  public Word(String word) {
    letters = new ArrayList<Letter>();

    for (char c : word.toCharArray()) {
      letters.add(new Letter(c));
    }
  }

  public int countLetterOccurrances(char targetLetter) {
    int count = 0;
    for (Letter letter : letters) {
      if (letter.var == targetLetter) {
        count++;
      }
    }

    return count;
  }
}
