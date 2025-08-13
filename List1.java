package Javalabset;
import java.util.Scanner;
public class List1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        System.out.println("Enter the starting position");
        a=sc.nextInt();
        System.out.println("Enter the ending position");
        b=sc.nextInt();
        String s2=(s1.substring(a,b));
        System.out.println("Your character string:" +s2);
    }
}