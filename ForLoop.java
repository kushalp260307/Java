 class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            long factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            System.out.println("Factorial of " + i + " = " + factorial);
        }
    }
}