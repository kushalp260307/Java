class Factorial {
    public static void main(String[] args) {

        long fact = 1;

        for (int i = 1; i <= 10; i++) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " = " + fact);
        }
    }
}