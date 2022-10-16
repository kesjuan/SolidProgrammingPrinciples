public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        // cant fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();
        ostrich.fly();
        ////////////
        // can fly
        Sparrow sparrow = new Sparrow();
        sparrow.greet();
        sparrow.fly();
    }
}
class Bird{
    public void greet() {
        System.out.println("greeting");
    }

    public void fly() {
        System.out.println("flying");
    }

}
class Sparrow extends Bird {}

class Ostrich extends Bird {}