import java.util.Arrays;

/**
 * Represents a sentence in a text
 */
public class Sentence {
  public final Object[] components;

  /**
   * Constructor
   *
   * @param sentence
   * @return Sentence
   */
  public Sentence(String sentence) {
    String[] wordsAndPunctuation = sentence.split("(?<=\\w)(?=\\p{Punct})|\\s+|(?<=\\p{Punct})(?=\\w)");
    components = new Object[wordsAndPunctuation.length];
    for (int i = 0; i < wordsAndPunctuation.length; i++) {
      String part = wordsAndPunctuation[i];
      if (part.matches("\\p{Punct}")) {
        components[i] = new PunctuationMark(part.charAt(0));
      } else {
        components[i] = new Word(part);
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
    Arrays.sort(components, (obj1, obj2) -> {
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
