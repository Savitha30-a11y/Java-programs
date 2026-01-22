import java.io.*;
import java.util.*;

public class MathFunction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        System.out.println((int)Math.floor(num1));
        System.out.println((int)Math.ceil(num1));
        System.out.println((int)Math.sqrt(num2));
        System.out.println((int)Math.pow(num3,num4));
    }
}
