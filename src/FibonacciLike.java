public class FibonacciLike implements Fibonacci, Runnable {
    int amountofNumbersInSequence;
    int number1;
    int number2;


    public FibonacciLike(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }


    @Override
    public void run() {
        try {
            start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void start() throws InterruptedException {
        int number3;
        System.out.println(number1);
        Thread.sleep(3000);
        System.out.println(number2);
        Thread.sleep(3000);
        number3 = number1 + number2;
        System.out.println(number3);
        Thread.sleep(3000);

        for(int i = 3 ; i < amountofNumbersInSequence; i++) {
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
            System.out.println(number3);
            Thread.sleep(3000);
        }

    }
}
