/**
 * Created by tmcbride on 4/23/2015.
 */

import java.util.Random;

class Useless {
}

public class Finally {

    private static Random r = new Random();
    final static int STATIC_FINAL = r.nextInt(20);
    final int FINAL = r.nextInt(20);

    Finally() {
        System.out.println("Static Final: " + STATIC_FINAL + "  Final: "+ FINAL);
    }

    public static void main(String[] args) {
        Finally a = new Finally();
        Finally b = new Finally();
        Finally c = new Finally();
    }
}

