import java.util.List;
import java.util.ArrayList;

/**
 * Represents a sentence in a text
 */
public class Sentence {
  public final List<Object> components;

  /**
   * Constructor
   *
   * @param sentence
   * @return Sentence
   */
  public Sentence(String sentence) {
    components = new ArrayList<>();
    String[] wordsAndPunctuation = sentence.split("(?<=\\w)(?=\\p{Punct})|\\s+|(?<=\\p{Punct})(?=\\w)");
    for (String part : wordsAndPunctuation) {
      if (part.matches("\\p{Punct}")) {
        components.add(new PunctuationMark(part.charAt(0)));
      } else {
        components.add(new Word(part));
      }
    }
  }

  /**
   * Sorts words in sentence by amount of targetLetter occurrances in a word
   *
   * @param targetLetter
   * @return void;
   */
  public void sortWordsByLetterUccurrances(char targetLetter) {
    components.sort((obj1, obj2) -> {
      if (obj1 instanceof Word && obj2 instanceof Word) {
        Word word1 = (Word) obj1;
        Word word2 = (Word) obj2;
        return word1.countLetterOccurrances(targetLetter) - word2.countLetterOccurrances(targetLetter);
      }

      return 0;
    });
  }

  @Override
  public String toString() {
    String sentence = "";
    for (Object component : components) {
      sentence += component.toString() + " ";
    }

    return sentence.trim().replaceAll("\\s+", " ");
  }
}
