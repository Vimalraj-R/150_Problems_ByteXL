import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if((n==9 && n*n%9==0)||n*n%9==n){
        System.out.println("Neon Number");
      }
      else{
        System.out.println("Not an Neon Number");
      }
    }
}

// Test Case : 9 -> 9^2 -> 18 -> 1+8 -> 9
