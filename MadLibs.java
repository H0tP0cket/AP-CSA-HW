/*Siddharth Srinivasan
 Period 6  */

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        System.out.println("Welcome to MadLibs Game");
        Scanner in = new Scanner(System.in);
        System.out.print("enter noun:");
        String n1 = in.nextLine();
        System.out.print("enter name:");
        String na2 = in.nextLine();
        System.out.print("enter num:");
        int nu1 = in.nextInt();
        System.out.print("enter num:");
        int nu2 = in.nextInt();
        System.out.println("enter verb:");
        String v1 = in.nextLine();
        System.out.println("enter verb:");
        String v2 = in.nextLine();
        System.out.print("enter verb:");
        String v3 = in.nextLine();
        System.out.print("enter noun:");
        String n2 = in.nextLine();
        System.out.print("enter place:");
        String p1 = in.nextLine();
        System.out.print("enter noun:");
        String n3 = in.nextLine();
        System.out.print("enter noun:");
        String n4 = in.nextLine();
        System.out.print("enter animal species: ");
        String an1 = in.nextLine();
        System.out.print("enter noun:");
        String n5 = in.nextLine();
        System.out.print("enter noun:");
        String n6 = in.nextLine();
        System.out.print("enter noun:");
        String n7 = in.nextLine();
        System.out.print("enter verb:");
        String v4 = in.nextLine();
        System.out.print("enter adj:");
        String a1 = in.nextLine();
        System.out.print("enter verb:");
        String v5 = in.nextLine();
        System.out.print("enter noun:");
        String n8 = in.nextLine();
        System.out.print("enter noun:");
        String n9 = in.nextLine();
        System.out.print("enter verb:");
        String v6 = in.nextLine();
        System.out.print("enter emotion:");
        String e1 = in.nextLine();
        System.out.print("enter adj:");
        String a2 = in.nextLine();
        System.out.print("enter verb:");
        String v7 = in.nextLine();
        System.out.print("enter animal:");
        String an2 = in.nextLine();
        System.out.print("enter number:");
        double d1 = in.nextDouble();
        System.out.println("enter verb:");
        String v8 = in.nextLine();
        System.out.println("enter noun:");
        String n10 = in.nextLine();
        System.out.print("enter verb: ");
        String v9 = in.nextLine();
        System.out.print("enter adverb(ending in ly):");
        String av1 = in.nextLine();

        System.out.println(
                "Once upon a time, there was a" + n1 + " who really loved" + na2 + "." + n1 + "  was " + nu1
                        + " years old and" + na2 + " was " + nu2
                        + " years old. Every day, they would " + v1
                        + "together and it made them so happy. One day, the " + n1 + " wanted to " + v2
                        + " their love, so they decided to " + v3
                        + " a big batch of " + n2
                        + ". But when they went to " + p1
                        + " the " + n3
                        + ", they realized that they were all out! They searched high and low but couldn't find any "
                        + n4 + " anywhere."

                        + "The couple was so " + e1
                        + " that they decided to go on a long walk to clear their head. On their walk, they ran into a "
                        + an1
                        + " who looked like they had been crying. When the " + n1
                        + " asked what was wrong, the stranger said that they had also run out of " + n5
                        + " and didn't know what to do."

                        + "The two of them commiserated for a while and then had a brilliant idea. They would search for more "
                        + n5 + " together! So off they went, hand in hand, looking for the perfect batch of " + n6 + "."
                        + "They searched for days and finally found the perfect " + n7
                        + ". They were so happy that they decided to " + v4
                        + " together to celebrate. They threw a " + a1 + "party before they" + v5 + "through a " + n8
                        + "made of" + n9 + " and it " + v6 + " up! At the end of their " + a2
                        + "day, the couple decided to" + v7 + "with the" + an1 + "before they encountered a" + an2
                        + "together the " + d1 + " of them " + v8 + "into the " + n10 + "and " + v9 + av1
                        + "ever after");
        in.close();
    }
}
