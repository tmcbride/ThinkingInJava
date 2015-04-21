public class Main {

    public static void main(String[] args) {
        ExerciseOneOne testOne = new ExerciseOneOne();
        testOne.checkVariables();

        ExerciseOneOne testTwo = new ExerciseOneOne();

        //Do a series of checks on the static int from different objects
        //as well as from a static context
        ExerciseOneOne.checkStaticInt();
        ExerciseOneOne.staticInt = 0;
        ExerciseOneOne.checkStaticInt();

        testOne.setStaticInt(2);
        testOne.checkStaticInt();

        testTwo.setStaticInt(4);
        testOne.checkStaticInt();

        ExerciseOneOne.checkStaticInt();

        /* Beginning of Exercise Two Examples
         * Output
         */
        System.out.println("\n\nExercise Two\n");

        ExerciseTwo x2 = new ExerciseTwo();
        System.out.println("Calcuate Velocity: " + x2.calculateVelocity());

        //x2.showIncrementers();

        Dog spot = new Dog("Spot", "Ruff!");
        Dog scruffy = new Dog("Scruffy", "Wurf!");

        System.out.println(spot);
        System.out.println(scruffy);

        Dog sparky = spot;

        System.out.println("sparky == spot: " + (sparky == spot));
        System.out.println("sparky.equals(spot): " + (sparky.equals(spot)));

        System.out.println("sparky == scruffy: " + (sparky == scruffy));
        System.out.println("sparky.equals(scruffy): " + (sparky.equals(scruffy)));

        for (int i = 0; i < 10; i++) {
            System.out.println("Attempt " + i + ": " + x2.flipCoin());
        }

        x2.binaryOperations();

        Fibonacci fib = new Fibonacci(7);

        //fib.calculateFibonacci();
        fib.calcFibRec();

    }
}
