package lab003;
import java.lang.String;
import java.util.Scanner;



 class Main {

    public static void main(String[] args) {
        int result;

        System.out.println("Enter the number of people");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the number of apple");
        int k = scan.nextInt();

        if(n>k) {
            System.out.println("Error");
        }

        else {
            result = k / n;
            System.out.println("Result: " + result);
        }
    }
}