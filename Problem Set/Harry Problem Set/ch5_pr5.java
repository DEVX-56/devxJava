//find factorial of a given number


import java.util.Scanner;
public class ch5_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*(i);
        }
        System.out.println("Answer is :"+fact);
    }
    
}
