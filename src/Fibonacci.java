/**
 * Created by tmcbride on 4/20/2015.
 */
public class Fibonacci {
    private int stop;

    /**
     * Constructor for Fibonacci Class
     *
     * @param setStop The number of digits/iterations to go through in the Fibonacci sequence
     */
    public Fibonacci(int setStop) {
        stop = setStop;
    }

    /**
     * Non-recursive function that runs through the fibonacci sequence starting at 0 and going
     * through the the number of interations set in the constructor.
     */
    public void calculateFibonacci() {
        int current = 1, previous = 0, previous2;

        for (int itr = 0; itr < stop; itr++) {

            if (itr == 1) {
                previous = current;
            } else if (itr > 1) {
                previous2 = previous;
                previous = current;
                current = previous + previous2;
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

    /**
     * Recursive function for calculating the Fibonacci sequence.  Private function that
     * is called by the overloaded function calcFibRec to initialize the values.
     *
     * @param current The current value of the sequence
     * @param previous The last value of the sequence
     * @param itr The current iteration to be compared to the stop to see how many
     *            more iterations are required.
     */
    private void calcFibRec(int current, int previous, int itr) {
        if (itr >= stop) {
            return;
        } else if (itr > 0) {
            System.out.print(", ");
        }

        System.out.print(current);

        int newCur = current;
        current += previous;

        //recursive call with current and previous passed correctly
        calcFibRec(current, newCur, ++itr);
    }

    /**
     * Main function for Fibonacci sequence class
     *
     * @param args takes 1 value that is used to say how many digits are required for the fibonacci sequence.
     *             Defaults to 5
     *
     */
    public static void main(String[] args) {

        int fibonacci;

        //If no command line arguments are present, set the default to 5
        try {
            fibonacci = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            fibonacci = 5;
        }

        Fibonacci fib = new Fibonacci(fibonacci);

        //fib.calculateFibonacci();
        fib.calcFibRec();

    }
}
