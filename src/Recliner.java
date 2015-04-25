/**
 * Created by tmcbride on 4/22/2015.
 */

class Furniture {
    protected String name;

    Furniture() {
        name = "Default";
        System.out.println("Created furniture with name " + name);
    }

    Furniture(String name) {
        this.name = name;
        System.out.println("Created furniture with name " + name);
    }
}

class Chair extends Furniture {
    Chair() {
        this.name = "Default Chair";
        System.out.println("Created chair with name " + name);
    }

    Chair(String name) {
        super(name);
        this.name = name;
        System.out.println("Created chair with name " + name);
    }
}

public class Recliner extends Chair {
    Recliner() {
        this.name = "Default Recliner";
        this.printName();
    }

    Recliner(String name) {
        super(name);
        //this.name = name;
        this.printName();
    }

    public String getType() {
        return "Recliner";
    }

    public static void main(String[] args) {
        Recliner r = new Recliner("Bob");
    }

    protected void printName() {
        System.out.println("Created recliner with name " + name);
    }
}
