package PRAExam;

import java.util.Scanner;

public class sumofevennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        int sum=0;
        while(n>0){
            if((n%10)%2==0){
                sum+=n%10;
            }
            n=n/10;
        }
        return  sum;
    }
}
