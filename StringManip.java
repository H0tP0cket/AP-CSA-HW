public class StringManip {
    public static void main(String[] args) {
        String a = "mission";
        String b = " ";
        String c = "san";
        String d = "jose";
        String name = a + b + c + b + d;
        System.out.println(name);
        System.out.println(name.length());

        String state = "mississippi";
        System.out.println(state.substring(0, 4));
        String i = "nat";
        String j = "";
        System.out.println(i.compareTo(j));
    }
}