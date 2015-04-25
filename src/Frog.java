/**
 * Created by tmcbride on 4/23/2015.
 */

class Amphibian {
    private String name;

    public Amphibian(String name){
        this.name = name;
    }

    public static void getName(Amphibian amp) {
        System.out.println("My Name is: " + amp.name);
    }
}

public class Frog extends Amphibian {

    public Frog (String name) {
        super(name);
    }

    public static void getName(Amphibian amp) {
        System.out.println("My Name is inaccessible");
    }

    public static void main(String[] args) {
        Frog fred = new Frog("Fred");
        Amphibian.getName(fred);
    }
}

