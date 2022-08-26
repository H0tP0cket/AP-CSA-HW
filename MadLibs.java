/*Siddharth Srinivasan
 Period 6  */

import java.util.HashMap;
import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to MadLibs Game");
        String story = "Once upon a time, there was a n1 who really loved na2. n1 was nu1 years old and na2 was nu2 years old. Every day, they would v1 together and it made them so happy. One day, the n1 wanted to v2 their love, so they decided to v3 a big batch of n2. But when they went to _______ the _______, they realized that they were all out! They searched high and low but couldn't find any _______ anywhere."

                + "The _______ was so sad that they decided to go on a long walk to clear their head. On their walk, they ran into a _______ who looked like they had been crying. When the _______ asked what was wrong, the stranger said that they had also run out of _______ and didn't know what to do."

                + "The two of them commiserated for a while and then had a brilliant idea. They would search for more _______ together! So off they went, hand in hand, looking for the perfect batch of _______."

                + "They searched for days and finally found the perfect _______. They were so happy that they decided to _______ together to celebrate. And they _______ happily ever after!";
        HashMap<String, String> blanks = new HashMap<>();
        blanks.put("n1", "Noun: ");
        blanks.put("na2", "Name: ");
        blanks.put("nu1", "Number: ");
        blanks.put("nu2", "Number: ");
        blanks.put("v1", "Verb: ");
        blanks.put("v2", "Verb: ");
        blanks.put("v3", "Verb: ");
        blanks.put("n2", "plural noun: ");

        for (String key : blanks.keySet()) {

            System.out.print(blanks.get(key));
            blanks.replace(key, in.nextLine());
        }

        String split[] = story.split("");
        for (int i = 0; i < split.length; i++) {
            if (blanks.containsKey(split[i])) {
                split[i] = blanks.get(split[i]);
            }
        }
        story = String.join(" ", split);

        System.out.println(story);
        in.close();
    }
}
