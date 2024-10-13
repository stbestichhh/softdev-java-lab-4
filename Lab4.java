public class Lab4 {

  public static void main(String[] args) {
    try {
      if (args.length < 2) {
        throw new IllegalArgumentException("Required arguments are missing.\nUsage: java Lab4 'text to sort' 'target letter' ");
      }

      String textInput = args[0];
      char targetLetter = args[1].charAt(0);

      Text text = new Text(textInput);
      text.sortTextByLetterOccurrances(targetLetter);

      System.out.println(text);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
