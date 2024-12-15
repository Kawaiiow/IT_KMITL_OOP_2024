package bank_account;

import java.util.Scanner;

public class bank {
    public static void main(String args[])
    {
        int     dep;
        char    opt;
        Scanner stdin;

        stdin = new Scanner(System.in);
        System.out.print("Input your money : ");
        dep = stdin.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        opt = stdin.next().charAt(0);
        switch (opt) {
            case 'A':
                System.out.println("Your total money in one year = " + (float)(dep * 1.015));
                break;
            case 'B':
                System.out.println("Your total money in one year = " + (dep * 1.020));
                break;
            case 'C':
                System.out.println("Your total money in one year = " + (dep * 1.015));
                break;
            case 'X':
                System.out.println("Your total money in one year = " + (dep * 1.05));
                break;
            default:
                break;
        }
        stdin.close();
    }
}
