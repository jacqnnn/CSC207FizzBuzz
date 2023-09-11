/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
// public function is different
        for (int i = 1; i < 100; i++) {
// i starts at 1, while i is less than 100, i = i+1
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            // you put semicolon at the end of every line
            boolean divisibleBy5 = i % 5 == 0;
            // don't need to assign variables first
            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");
                // need to write System.out.println()?
                // while only need print() with python
            } else if (divisibleBy3) {
                //python: if xxx : , java: if {}

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                doFizzBuzz(i);

            }
        }
    }

    private static void doFizzBuzz(int i) {
        System.out.println(i);
    }
}
//        int i = 1;
//        while (i < 100) {
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//            i++;
//
//        }
//    }
//}
//
