import java.io.Console;

public class Score {
  public static void main(String[] args){
    Console console = System.console();
    String[] wordArray;
    int score = 0;

    System.out.println("Let's get started");
    String userWord = console.readLine();
    String lowerUserWord = userWord.toLowerCase();

    wordArray = lowerUserWord.split("");


    for (String letter : wordArray){
      if (letter.matches(".*[aeioulnrst].*")){
        score += 1;
        System.out.println(letter.toUpperCase() + " is worth 1 point");
      } else if (letter.matches(".*[dg].*")){
        score += 2;
        System.out.println(letter.toUpperCase() + " is worth 2 points");
      } else if (letter.matches(".*[bcmp].*")){
        score += 3;
        System.out.println(letter.toUpperCase() + " is worth 3 points");
      } else if (letter.matches(".*[fhvwy].*")){
        score += 4;
        System.out.println(letter.toUpperCase() + " is worth 4 points");
      } else if (letter.matches(".*[k].*")) {
        score += 5;
        System.out.println(letter.toUpperCase() + " is worth 5 points");
      } else if (letter.matches(".*[jx].*")){
        score += 8;
        System.out.println(letter.toUpperCase() + " is worth 8 points");
      } else if (letter.matches(".*[qz].*")){
        score += 10;
        System.out.println(letter.toUpperCase() + " is worth 10 points");
      }

    }

    System.out.println(userWord + " is worth " + score + " points!");

  }
}
