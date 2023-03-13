import java.util.ArrayList;

public class basednotes {

  public static void main(String[] args) {
    ArrayList<ArrayList<String[]>> notes = new ArrayList<ArrayList<String[]>>();
    String[] john = { "john", "anushri" };

    ArrayList<String[]> a1 = new ArrayList<String[]>();
    a1.add(john);

    notes.add(a1);
    System.out.println(notes.get(0).get(0)[1].substring(1, 5));
  }

  public ArrayList<Integer> george(ArrayList<Integer> x) {
    return x;
  }
}
