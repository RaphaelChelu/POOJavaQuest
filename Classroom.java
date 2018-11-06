public class Classroom{

    public static void main(String[] args) {

        // la référence raphael reçoit une nouvelle instance de la classe Wilder

        Wilder raphael = new Wilder("Raphael");
        raphael.setAware(true);
        System.out.println(raphael.whoAmI());

        // la référence carlos reçoit une nouvelle instance de la classe Wilder

        Wilder carlos = new Wilder("Carlos");
        carlos.setAware(false);
        System.out.println(carlos.whoAmI());
    }
}