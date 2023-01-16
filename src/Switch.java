public class Switch {
    public static void main(String[] args) {

//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//            case 3: case 4: case 5:
//                System.out.println("Was a 3 or 4 or 5.");
//                System.out.println("Actually it was " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
//        }

        char switchValue = 'A';

        switch (switchValue) {
            case 'A':
                System.out.println("Able");
            case 'B':
                System.out.println("Baker");
            case 'C':
                System.out.println("Charlie");
            case 'D':
                System.out.println("Dog");
            case 'E':
                System.out.println("Easy");
            default:
                System.out.println("Was not found");
        }


    }


}

