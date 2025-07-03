import java.util.Scanner;

public class divisorgame {
    public static boolean divisorGame(int n) {
        return (n % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(divisorGame(n));
        sc.close();
    }
}
