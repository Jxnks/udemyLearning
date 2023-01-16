public class Ternary {
    public static void main(String[] args) {
        // ternary
        double numberOne = 20.00d;
        double numberTwo = 80.00d;

        double together = 100 * (numberOne + numberTwo);
        double remainder = together / 40;

        boolean isNoRemainder = remainder == 0;  // if remainder equals zero then testing is true, else its false

        System.out.println(isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
