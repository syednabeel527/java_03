import java.util.*;
public class pro5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        
        do{
           int n =sc.nextInt();
           if(n % 10 ==0 ){
                break;
           }
           System.out.println("You entered:"+n); 
        }while(true);
        }
    }
