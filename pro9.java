import java.util.*;
public class pro9{
    public static void main(String args[]){
        int n;
        System.out.println("enter the value of n:");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(n+" * " + i + " = " + (n*i));
        }
    }
}