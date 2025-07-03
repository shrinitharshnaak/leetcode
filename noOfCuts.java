import java.util.Scanner;
public class noOfCuts {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        if(n%2!=0) return n;
    return 0;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of pieces:");
    int n=sc.nextInt();
    System.out.println("Number of cuts required: " + new noOfCuts().numberOfCuts(n));
    sc.close();
}
}