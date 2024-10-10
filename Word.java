import java.util.ArrayList;
import java.util.List;

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
      if (letter.value == targetLetter) {
        count++;
      }
    }

    return count;
  }

  @Override
  public String toString() {
    String word = "";
    for (Letter letter : letters) {
      word += letter.value;
    }
    return word;
  }
}
