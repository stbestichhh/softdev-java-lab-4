import java.util.ArrayList;
import java.util.List;

/**
 * Represents word in a sentence
 */
public class Word {
  public final List<Letter> letters;

  /**
   * Constructor
   * @param word
   * @return Word
   */
  public Word(String word) {
    letters = new ArrayList<Letter>();

    for (char c : word.toCharArray()) {
      letters.add(new Letter(c));
    }
  }

  /**
   * Counts how many time target letter occurrs in the word
   *
   * @param targetLetter
   * @return int count
   */
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
