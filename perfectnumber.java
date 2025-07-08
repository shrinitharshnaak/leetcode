import java.util.Scanner;
public class perfectnumber {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int i=1;
        int sum=0;
        while(i<num){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
        return num==sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        perfectnumber pn = new perfectnumber();
        if (pn.checkPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        sc.close();
    }
}

