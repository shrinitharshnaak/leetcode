import java.util.Scanner;
public class reverseInt {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int s=0;
        while(n!=0){
            s=s*10+n%10;
            n=n/10;

        }
        System.out.println(s);
    }
}

