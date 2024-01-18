import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter up to which number you want to check:");
        int x = sc.nextInt();

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println("Number:" + i);
            }
        }

    }
}