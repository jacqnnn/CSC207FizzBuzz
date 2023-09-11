public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int n = 100;
            while (n > 0) {
                boolean even = n % 2 == 0;
                if (even) {
                n = n / 2;
                step++;
            } else {
                n = n - 1;
                step++;
            }
        }
        System.out.println(step);
    }
}
