package la001;
import java.lang.String;
import java.util.Scanner;
import java.lang.Math;

class Main {
    private static void sout(String sout_txt) {
        System.out.println(sout_txt);
    }

    public static void main(String[] args) {

        sout("Enter A: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        sout("Enter B: ");
        int b = scan.nextInt();
        if(a >= 10000|| b >= 10000) {
            sout("Enter num < 10000");
        }
        else {
            double c = Math.pow(a, 2) + Math.pow(b, 2);
            System.out.println(Math.sqrt(c));
        }
    }


}