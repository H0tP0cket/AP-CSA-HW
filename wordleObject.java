import java.sql.Array;
import java.util.*;

//this class is used to represent the word people are trying to solve.
public class wordleObject {

  public String[] letters; //the letters that are in the word
  public ArrayList<String> alphabet;
  public ArrayList<String> blackLetters = new ArrayList<String>();

  public ArrayList<String> fullAlphabet = new ArrayList<String>();

  public wordleObject(String[] letters) {
    this.letters = letters;
    alphabet = new ArrayList<String>();
    String[] x = {
      "a",
      "b",
      "c",
      "d",
      "e",
      "f",
      "g",
      "h",
      "i",
      "j",
      "k",
      "l",
      "m",
      "n",
      "o",
      "p",
      "q",
      "r",
      "s",
      "t",
      "u",
      "v",
      "w",
      "x",
      "y",
      "z",
    };
    for (String temp : x) alphabet.add(temp);
  }

  public ArrayList<String> getAlphabet() {
    return alphabet;
  }

  public String[] getLetters() {
    return letters;
  }

  public ArrayList<String> getBlackLetters() {
    return blackLetters;
  }

  public ArrayList<String> getFullAlphabet() {
    return fullAlphabet;
  }

  public void setAlphabet(ArrayList<String> alphabet) {
    this.alphabet = alphabet;
  }

  public void setLetters(String[] letters) {
    this.letters = letters;
  }

  public void setBlackLetters(ArrayList<String> blackLetters) {
    this.blackLetters = blackLetters;
  }
}
