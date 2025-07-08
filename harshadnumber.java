import java.util.Scanner;
public class harshadnumber {
    public static int harshadnumber(int x){
        int sum=0;
        int num=x;
        while(num!=0){
            sum=sum+(num%10);
            num=num/10;
        }
        if(x%sum==0)return sum;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int result = harshadnumber(x);
        System.out.println(result);
        sc.close();
    }
}
