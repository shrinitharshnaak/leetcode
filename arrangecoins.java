import java.util.Scanner;
public class arrangecoins {
    public static int arrangecoins(int n){
        int count=0;
        int i=1;
        while(n>=i){
            n=n-i;
            i++;
            count++;
        }
        return count;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of coins:");
    int n=sc.nextInt();
    int result=arrangecoins(n);
    System.out.println(result);
    sc.close();
}
}
