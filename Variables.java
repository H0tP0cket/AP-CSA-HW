public class Variables {
    String name = "sid";
    int age = 15;
    String activity = "eat food";
    String annoy = "Homework";
    String job = "Software Engineer";

    public static void main(String[] args) {
        Variables obj = new Variables();
        System.out.print("Hello\n" +
                "My name is " + obj.name +
                "\nI am " + obj.age + " years old.\n" +
                "I love to " + obj.activity + ".\n" +
                obj.annoy + "annoys me hella!\n" +
                "I plan to be a" + obj.job + "when I grow up!");
    }
}