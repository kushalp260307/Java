class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting
        int a = 10;
        double b = a;

        System.out.println("Integer value: " + a);
        System.out.println("Converted to double: " + b);


        // Narrowing Casting
        double x = 10.75;
        int y = (int) x;

        System.out.println("Double value: " + x);
        System.out.println("Converted to integer: " + y);
    }
}