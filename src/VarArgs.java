/**
 * Created by tmcbride on 4/20/2015.
 */
public class VarArgs {
    VarArgs (Object... args) {
        for (Object s : args) {
            System.out.print(s.getClass() + ": ");
            System.out.println(s.toString());
        }
    }

    public static void main (String[] args) {
        VarArgs va = new VarArgs (new String[] {"Caitlin", "is", "Cute"});
        VarArgs va2 = new VarArgs ("Caitlin", "is", "Cute", 1);
    }
}
