public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean useManyThreads = true;
        FibonacciLike fib1 = new FibonacciLike(5, 3, 4);
        //  3 4 7 11 18

        FibonacciLike fib2 = new FibonacciLike(8, -1, 10);
        if (useManyThreads) {
            Thread fib1Thread = new Thread(fib1);
            Thread fib2Thread = new Thread(fib2);
            fib1Thread.start();
            fib2Thread.start();
        } else {
            fib1.start();
            fib2.start();
        }

    }
}