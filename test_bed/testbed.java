package test_bed;

import java.util.Scanner;

public class testbed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        if( n1.equals(n2) ) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
