import java.io.*;
import java.util.*;

public class Sum of its digits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=num/10;
        int b=num%10;
        int c=a+b;
        
        System.out.println("Bird said:"+num);
        System.out.println("Alice must go in path-"+c);
    }
}
