import java.io.*;
import java.util.*;

public class Condition{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int arrear=sc.nextInt();
        int cgpa=sc.nextInt();
        System.out.println("Name of the Student:"+name);
        
        boolean eligible=false;
        if(arrear==1 && cgpa>70){
            eligible=true;
        }
        else if((arrear==1 || arrear==2) && cgpa>75){
            eligible=true;
        }
        if(eligible){
            System.out.println(name + " is Eligible for Placement");
        }
        else{
            System.out.println(name + " is Not Eligible for Placement");
        }
        
      
   
    }
}
