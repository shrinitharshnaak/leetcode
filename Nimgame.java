import java.util.Scanner;
public class Nimgame {
    public static boolean canWinNim(int n) {
       if(n==1 || n==2 || n==3 || n%4!=0) return true;
       return false; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stones:");
        int n = sc.nextInt();
        System.out.println(canWinNim(n));
    }
}

