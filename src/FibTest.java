/**
 * Created by tmcbride on 4/21/2015.
 */
import com.troymcbride.Fibonacci;

public class FibTest extends Fibonacci {

    FibTest (int newStop) {
        super(newStop);
    }

    public static void main(String[] args) {
        FibTest fib = new FibTest(10);

        fib.calcFibRec();
    }
}
