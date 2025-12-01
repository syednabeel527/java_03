import java.util.*;
public class pro7{
    public static void main(String args[]){
        int n;
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int oddSum =0;
        int evenSum =0;
        n = sc.nextInt();
        System.out.println("you have provided " + n + " as input");
        for (int i=1; i<=n; i++){
            System.out.println("please provide the number" + i);
            int num = sc.nextInt();
            if(num % 2 ==0){
                evenSum += num; 
            }else{
                oddSum += num;
        }
    }
    System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);
}
}