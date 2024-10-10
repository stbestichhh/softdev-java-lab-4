public class Lab4 {

  public static void main(String[] args) {
    try {
      if (args.length < 2) {
        throw new IlligalArgumentException("Required arguments are missing.\nUsage: java Lab4 'text tot sort' 'target letter'");
      }

      String textInput = args[0];
      char targetLetter = args[1];

      Text text = new Text(textInput);
      text.sortTextByLetterOccurrances(targetLetter);

      System.out.println(text);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
