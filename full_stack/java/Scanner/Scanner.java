package full_stack.java.Scanner;

import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");

        int myint = scanner.nextInt();          
        int myint1 = scanner.nextInt();
        int myint2 = scanner.nextInt();

        System.out.println("You entered:");
        System.out.println(myint);
        System.out.println(myint1);
        System.out.println(myint2);

        scanner.close();
    }
}
