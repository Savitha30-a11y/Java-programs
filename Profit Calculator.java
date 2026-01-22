import java.io.*;
import java.util.*;

public class Profit Calculator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        double profit = (num * (num1 - num2)) - 100;
        
        System.out.printf("Number of copies sold:"+num);
        System.out.printf("\nCost of each copy:"+num1);
        System.out.printf("\nCost spent by agency on each newspaper:"+num2);
        System.out.printf("\nThe profit obtained is Rs.%.2f",profit);
        
    }
}
