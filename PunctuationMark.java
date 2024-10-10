/**
 * Represents a punctuation mark in a sentence
 */
public class PunctuationMark {
  public final char mark;

  public PunctuationMark(char mark) {
    this.mark = mark;
  }

  @Override
  public String toString() {
    return String.valueOf(mark);
  }
}
