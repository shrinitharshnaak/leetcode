import java.util.Scanner;
public class numofstepstozero {
    public  static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    int result = numberOfSteps(num);
    System.out.println("Number of steps to reduce to zero: " + result);
    sc.close();

    }
}
