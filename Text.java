import java.util.ArrayList;
import java.util.List;

/**
 * Represents a text as a list of sentences
 */
public class Text {
  public final List<Sentences> sentences;

  public Text(String text) {
    sentences = new ArrayList<>();
    String[] splitedSentences = text.split("(?<=[.!?])\\s+");
    for (String sentence : splitedSentences) {
      sentences.add(new Sentence(sentence));
    }
  }

  /**
   * sorts all sentences' words by target letter occurrances in them
   */
  public void sortTextByLetterOccurrances(char targetLetter) {
    for (Sentence sentence : sentences) {
      sentence.sortWordsByLetterUccurrances(targetLetter);
    }
  }
}
