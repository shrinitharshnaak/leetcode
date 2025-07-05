import java.util.Scanner;
public class Uglynumber {
   public static  boolean isUgly(int n) {
    if(n<=0) return false;
    while(n%2==0) n=n/2;
    while(n%3==0) n=n/3;
    while(n%5==0) n=n/5;
return n==1;
}
public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a number: ");
    int number = sc.nextInt();
    if (isUgly(number)) {
        System.out.println(number + " is an ugly number.");
    } else {
        System.out.println(number + " is not an ugly number.");
    }
    sc.close();
   }
}
