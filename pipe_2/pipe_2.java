package pipe_2;

import java.util.Scanner;

public class pipe_2
{
    public static void main (String args[])
    {
        Scanner stdin;
        int     n;

        stdin = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        n = stdin.nextInt();
        for (int i = 0; i < n / 5; i++)
            System.out.println("|||||");
        for (int i = 0; i < n % 5; i++)
            System.out.print("|");
        stdin.close();
    }
}
