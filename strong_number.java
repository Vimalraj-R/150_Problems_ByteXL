//1.Recursion Approach for Strong Number

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += fact(digit);
            n /= 10;
        }
        if(sum==n){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
    private static int fact(int digit) {
        if (digit == 0 || digit == 1) {
            return 1;
        }
        return digit * fact(digit - 1);
    }
}

//2. DP Approach for Strong Number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[10];
        dp[0]=1;
        for(int i=1;i<10;i++){
          dp[i]=dp[i-1]*i;
        }
        int sum=0;
        while(n>0){
          int temp=n%10;
          n=n/10;
          sum+=dp[temp];
        }
        if(sum==n){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}



//Test Case : 145 = 1! + 4! + 5! = 145
