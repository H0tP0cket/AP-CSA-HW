import java.io.File;
import java.io.FileNotFoundException;   
import java.util.*;

public class Wordle {

  public static void main(String[] args) {
    ArrayList<String> allWords = new ArrayList<String>();
    try {
      File myObj = new File("/Users/sidsri/Downloads/wordle.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        allWords.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    /* what to code
        generate the random word answer
        print the alphabet denoting the possible checkes they have left
        print the amount of checkes left, they have 6 total checkes

        things to have and show
        the check that they have
        amount of checkes left
        letters they still haven't checked
        green letters
        yellow letters
        letters that are not properly checked


        */
    boolean victory = false;
    Scanner in = new Scanner(System.in);
    boolean play = true;
    while (play) {
      System.out.println("Welcome To Wordle!");
      boolean valid = false;
      int randomWord = (int) (Math.random() * allWords.size()) + 1;
      wordleObject word = new wordleObject(parse(allWords.get(randomWord)));
      String input;
      String[] check;
      while (!valid) {
        System.out.println("enter check >> ");
        input = in.nextLine();
        check = parse(input);
        if (check.length == 5 && exists(input, allWords)) {
          valid = true;
          ArrayList<String> checkResult = checkColors(check, word.getLetters());
          displayArrayList(checkResult);

          if (victoryCheck(check, word.getLetters())) {
            System.out.println("nice one try >>");
            System.out.println("\n\nWould You like to play again? (y/n)");
            if (in.nextLine().equals("n")) {
              play = false;
            }
            victory = true;
          }
          if (!victory) {
            word.setAlphabet(removeLetter(check, word.getAlphabet()));
            System.out.print("you have this many tries left >> ");
            displayArrayList(word.getAlphabet());
          }
        } else {
          System.out.println(
            "try again, make sure you enter a valid check and that it is a 5 letter word"
          );
        }
      }
      int g1;
      for (int i = 0; i < 5; i++) {
        g1 = i + 1;
        valid = false;
        while (!valid && !victory) {
          System.out.println(" enter next check >>");
          input = in.nextLine();
          check = parse(input);
          if (check.length == 5 && exists(input, allWords)) {
            valid = true;
            ArrayList<String> checkResult = checkColors(
              check,
              word.getLetters()
            );
            displayArrayList(checkResult);
            if (victoryCheck(check, word.getLetters())) {
              int g2 = 6 - g1;
              victory = true;
              System.out.println("nice\nyou win\nit took you " + g2 + " tries");
              System.out.println("\n\nDo you want to play again? (y/n)");
              if (in.nextLine().equals("n")) {
                play = false;
              }
            }
            if (!victory) {
              word.setAlphabet(removeLetter(check, word.getAlphabet()));
              System.out.print("You have this many words left >> ");
              displayArrayList(word.getAlphabet());
              System.out.println("You have " + g1 + " checkes left");
            }
          } else {
            System.out.println("enter a valid check");
          }
        }
      }
      if (!victory) {
        System.out.println("you lose");
        System.out.print("The word was: ");
        displayStringArray(word.getLetters());
        System.out.println("\n\nWould You like to play again? (y/n)");
        if (in.nextLine().equals("n")) {
          play = false;
        }
      }
    }
  }

  public static ArrayList<String> checkColors(String[] a, String[] answer) {
    boolean green;
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < 5; i++) {
      // checking if the word is green and updating the Array List if it is
      green = false;
      if (a[i].equals(answer[i])) {
        result.add("g");
        green = true;
      }
      // checking if the word is Yellow and updating the Array List if it is
      boolean yellow = false;
      for (int j = 0; j < 5; j++) {
        if (!green && a[i].equals(answer[j])) {
          result.add("y");
          yellow = true;
        }
      }
      // checking if the word is black and updating the Array List if it is
      if (!yellow && !green) {
        result.add("b");
      }
    }
    return result;
  }

  public static String[] parse(String a) {
    String[] b = new String[a.length()];
    for (int i = 0; i < a.length(); i++) {
      b[i] = a.substring(i, i + 1);
    }
    return b;
  }

  public static void displayArrayList(ArrayList<String> a) {
    for (String temp : a) System.out.print(temp);
    System.out.println();
  }

  public static void displayStringArray(String[] a) {
    for (String x : a) System.out.print(x);

    System.out.println();
  }

  public static ArrayList<String> removeLetter(
    String check[],
    ArrayList<String> alphabet
  ) {
    for (int i = 0; i < check.length; i++) {
      for (int k = 0; k < alphabet.size(); k++) {
        if (check[i].equals(alphabet.get(k))) {
          alphabet.remove(k);
        }
      }
    }
    return alphabet;
  }

  public static boolean victoryCheck(String[] check, String[] answer) {
    boolean victory = true;
    for (int i = 0; i < 5; i++) {
      if (!check[i].equals(answer[i])) {
        victory = false;
      }
    }
    return victory;
  }

  public static boolean exists(String check, ArrayList<String> words) {
    boolean exists = false;
    for (int i = 0; i < words.size(); i++) {
      if (check.equals(words.get(i))) {
        exists = true;
      }
    }
    return exists;
  }
}
