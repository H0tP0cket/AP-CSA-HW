public class ShoeMain {
    public static void main(String[] args) {
        Shoe mj = new Shoe(12, "green");
        Shoe isabelle = new Shoe(6, "pink");
        Shoe krishna = new Shoe(12, "blue");
        Shoe NCSChamp = new Shoe();
        System.out.println(NCSChamp.getSize());
        System.out.print(NCSChamp.getColor());
        NCSChamp.setSize(8);
        NCSChamp.setColor("brown");
        System.out.println(NCSChamp.getSize());
        System.out.println(NCSChamp .getColor());
    }
}
