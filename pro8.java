import java.util.*;
public class pro8{
    public static void main(String args[]){
        int n ;
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("you have provided " + n + " as input");
        int factorial =1;   
        for (int i=1; i<=n; i++){
            factorial *= i; 
        }   
        System.out.println("The factorial of " + n + " is: " + factorial);

    }
}