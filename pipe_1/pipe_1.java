package pipe_1;

import java.util.Scanner;

public class pipe_1
{
    public static void main (String args[])
    {
        Scanner stdin;
        int     n;

        stdin = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        n = stdin.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if (i % 5 == 0 && i != 0)
                System.out.print("/");
            else
                System.out.print("|");
        }
        stdin.close();
    }
}
