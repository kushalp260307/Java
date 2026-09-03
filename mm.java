class TypeConversion {
    public static void main(String[] args) {

        // int to double
        int a = 10;
        double b = a;

        System.out.println("int value: " + a);
        System.out.println("double value: " + b);


        // double to int
        double x = 10.75;
        int y = (int) x;

        System.out.println("double value: " + x);
        System.out.println("int value: " + y);


        // char to int
        char ch = 'A';
        int num = ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + num);
    }
}