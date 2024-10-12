import java.util.ArrayList;
import java.util.List;

/**
 * Represents a text as a list of sentences
 */
public class Text {
  public final Sentence[] sentences;

  /**
   * Constructor
   *
   * @param text
   * @return Text
   */
  public Text(String text) {
    String[] splitedSentences = text.split("(?<=[.!?])\\s+");
    sentences = new Sentence[splitedSentences.length];
    for (int i = 0; i < splitedSentences.length; i++) {
      sentences[i] = new Sentence(sentence);
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
