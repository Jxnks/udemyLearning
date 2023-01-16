public class isPalindrome {

    public static boolean isItPalindrome(int number) {
        String number1 = Integer.toString(number);
        String reversedN = "";

        for (int i = number1.length(); i > 0; i--) {
            String lastChar = String.valueOf(number1.charAt(i-1));
            reversedN += lastChar;
        }
        System.out.println(reversedN);


        if (number1.equals(reversedN)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        isItPalindrome(11331);
    }
}






