/**
 * Created by tmcbride on 4/20/2015.
 */
public class Fibonacci {
    private int stop;

    public Fibonacci(int setStop) {
        stop = setStop;
    }

    public void calculateFibonacci() {
        int current = 1, previous1 = 0, previous2 = 0;

        for (int itr = 0; itr < stop; itr++) {

            if (itr == 1) {
                previous1 = current;
            } else if (itr > 1) {
                previous2 = previous1;
                previous1 = current;
                current = previous1 + previous2;
            }

            if (itr > 0) {
                System.out.print(", ");
            }

            System.out.print(current);

        }
    }

    /**
     * Overloaded function with default values for current, previous, and itr
     * This is the only public function so that it can't be started from another
     * point
     *
     * Recursive version of Fibonacci sequence above
     * */
    public void calcFibRec() {
        calcFibRec(1, 0, 0);
    }

    private void calcFibRec(int current, int previous, int itr) {
        if (itr > stop) {
            return;
        } else if (itr > 0) {
            System.out.print(", ");
        }

        System.out.print(current);

        int newCur = current;
        current += previous;

        calcFibRec(current, newCur, ++itr);
    }

    public static void main(String[] args) {
        int fibonacci = Integer.parseInt(args[0]);

        Fibonacci fib = new Fibonacci(fibonacci);

        //fib.calculateFibonacci();
        fib.calcFibRec();

    }
}
