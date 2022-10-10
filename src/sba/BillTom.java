package sba;
import java.util.*;
import java.util.Scanner;
public class BillTom
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizza=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int cool=sc.nextInt();
       
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+cool);
        System.out.println("Total price="+(pizza*100+puffs*20+cool*10));
        System.out.println("ENJOY THE SHOW BRUH!!!");
    }
}

