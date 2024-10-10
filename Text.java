import java.util.ArrayList;
import java.util.List;

/**
 * Represents a text as a list of sentences
 */
public class Text {
  public final List<Sentence> sentences;

  /**
   * Constructor
   *
   * @param text
   * @return Text
   */
  public Text(String text) {
    sentences = new ArrayList<>();
    String[] splitedSentences = text.split("(?<=[.!?])\\s+");
    for (String sentence : splitedSentences) {
      sentences.add(new Sentence(sentence));
    }
  }

  /**
   * Sorts all sentences' words by target letter occurrances in them
   *
   * @param targetLetter
   * @return void
   */
  public void sortTextByLetterOccurrances(char targetLetter) {
    for (Sentence sentence : sentences) {
      sentence.sortWordsByLetterUccurrances(targetLetter);
    }
  }

  @Override
  public String toString() {
    String text = "";
    for (Sentence sentence : sentences) {
      text += sentence.toString() + " ";
    }

    return text.trim();
  }
}
