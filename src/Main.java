public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.isPalindrome(1211112);




    }

    public static boolean hasTeen(int number1, int number2, int number3) {
        int lowerBound = 12;
        int upperBound = 20;

        if (number1 > lowerBound && number1 < upperBound) {
            return true;
        } else if (number2 > lowerBound && number2 < upperBound) {
            return true;
        } else return number3 > lowerBound && number3 < upperBound;


    }

    public static boolean isTeen(int number) {
        int lowerBound = 12;
        int upperBound = 20;

        if (number > lowerBound && number < upperBound) {
            return true;
        } else {
            return false;
        }

    }
}










