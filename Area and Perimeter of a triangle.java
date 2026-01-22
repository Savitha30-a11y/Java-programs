import java.io.*;
import java.util.*;

public class Area and Perimeter of a triangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double area = 0.5 * base * height;
        double perimeter = side1 + side2 + side3;
        System.out.printf("Area of Triangle is %.2f\n",area);
                System.out.printf("Perimeter of Triangle is %.2f\n",perimeter);

    }
}
