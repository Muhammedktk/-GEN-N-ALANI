import java.util.Scanner;

public class ALAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int K,U,H,u,Alan;
        double Alan1;

        System.out.println("1. Kenarı Gir:");
        K = input.nextInt();
        System.out.println("2. Kenarı Gir:");
        U = input.nextInt();
        System.out.println("3.Kenar Gir:");
        H= input.nextInt();

        u=(K+U+H)/2;
        Alan=Math.abs(u*(u-K)*(u-U)*(u-H));
        Alan1= Math.sqrt(Alan);
        System.out.println("ALAN:   "+Alan1);









    }
}
