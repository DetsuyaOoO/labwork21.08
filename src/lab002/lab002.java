package lab002;
import java.lang.String;
import java.util.Scanner;




class Main {

    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int result = num + 1;
        System.out.println("The next number for the number "+ num +  " is " + result+"." );
        result = num - 1;
        System.out.println("The previous number for the number "+ num +  " is " + result+"." );
    }

}
