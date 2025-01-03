public class Words {
  public static void makeWords (int remainingLetters, String result, String alphabet) {
    if (remainingLetters == 1) {
      for (int i = 0; i < alphabet.length(); i++) {
        System.out.println(result + alphabet.charAt(i));
      }
      return;
    }
    for (int i = 0; i < alphabet.length(); i++) {
      makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
    }
    return;
  }

  public static void main(String args[]) {
    makeWords(3, "", "abc");
  }

}
