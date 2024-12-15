package even_odd;

import java.util.Scanner;

public class even_odd
{
    public static void main (String args[])
    {
        Scanner stdin;
        int     even;
        int     odd;
        int     n;

        stdin = new Scanner(System.in);
        even = 0;
        odd = 0;
        n = stdin.nextInt();
        while (n != -1)
        {
            if (n % 2 == 1)
                odd++;
            else
                even++;
            n = stdin.nextInt();
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
        stdin.close();
    }
}