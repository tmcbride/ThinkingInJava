/**
 * Created by tmcbride on 4/20/2015.
 */
public class Dog {
    private String name;
    private String says;

    public Dog (String setName, String setSays) {
        name = setName;
        says = setSays;
    }

    public String toString() {
        return name + " says " + says;
    }

    public boolean equals(Dog comp) {
        return name == comp.name;
    }

    public static void main(String[] args) {
        Dog rover = new Dog("Rover", "Bark");
        Cat cheryl = new Cat("Cheryl", "Meow");

        System.out.println("Cat: " + cheryl + "\nDog: " + rover);
    }
}

class Cat {
    private String name;
    private String says;

    Cat (String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String toString() { return name + " says " + says; }
}

