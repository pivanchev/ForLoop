
package forloop;
import java.util.Scanner;


public class GreatestCommonDivisor {
    
    

     
    public static void main(String args[]){
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        
        
        int gcd=1;
        for(int x=2;x<=num1 && x<=num2;x++){
            if(num1%x==0 && num2%x==0)
            gcd=x;
        }
        
        
        /*
        int gcd=1;//initial greatest common divisor is 1
        int x=2;//possible greatest common divisor
        
        while(x<=num1 && x<=num2){
            if(num1%x==0 && num2%x==0)
            gcd=x;//update gcd
            x++;
            }
        */
            
            System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);   
        }
    }

