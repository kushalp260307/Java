 class WhileLoop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            long factorial = 1;
            int j = 1;

            while (j <= i) {
                factorial = factorial * j;
                j++;
            }

            System.out.println("Factorial of " + i + " = " + factorial);
            i++;
        }
    }
}