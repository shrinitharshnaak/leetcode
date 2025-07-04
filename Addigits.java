import java.util.Scanner;
public class Addigits {
     public static int addDigits(int n) {
     if(n==0) return 0;
    else
    return n%9==0?9:n%9;   
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(addDigits(n));
        sc.close();
    }
}
