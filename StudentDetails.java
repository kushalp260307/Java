import java.util.Scanner;

 class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[5];
        int[] age = new int[5];
        int[][] marks = new int[5][5];
        int[] total = new int[5];
        double[] average = new double[5];

        int topper = 0;

        // Input details
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Subject 1: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Subject 2: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Subject 3: ");
            marks[i][2] = sc.nextInt();

            System.out.print("Subject 4: ");
            marks[i][3] = sc.nextInt();

            System.out.print("Subject 5: ");
            marks[i][4] = sc.nextInt();

            // Calculate total
            for (int j = 0; j < 5; j++) {
                total[i] = total[i] + marks[i][j];
            }

            // Calculate average
            average[i] = total[i] / 5.0;

            // Find topper
            if (total[i] > total[topper]) {
                topper = i;
            }
        }

        // Display student details
        System.out.println("\n----- STUDENT DETAILS -----");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nName    : " + name[i]);
            System.out.println("Age     : " + age[i]);
            System.out.println("Sub1    : " + marks[i][0]);
            System.out.println("Sub2    : " + marks[i][1]);
            System.out.println("Sub3    : " + marks[i][2]);
            System.out.println("Sub4    : " + marks[i][3]);
            System.out.println("Sub5    : " + marks[i][4]);
            System.out.println("Total   : " + total[i]);
            System.out.println("Average : " + average[i]);
        }

        // Display topper
        System.out.println("\n----- CLASS TOPPER -----");
        System.out.println("Name    : " + name[topper]);
        System.out.println("Age     : " + age[topper]);
        System.out.println("Total   : " + total[topper]);
        System.out.println("Average : " + average[topper]);

        sc.close();
    }
}

