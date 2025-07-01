import java.util.Scanner;
public class double2119{

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("True");
        }
        else if(n%10==0){
          System.out.println("False");  
        }
        else{
            System.out.println("True");
        }
    }
}
