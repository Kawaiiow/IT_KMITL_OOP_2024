package tower;

import java.util.Scanner;

public class tower {
    public static void main (String args[])
    {
        Scanner stdin;
        int     n;

        stdin = new Scanner(System.in);
        n = stdin.nextInt();
        stdin.close();
        for (int i = 0; i < n; i++)
            System.out.println("#-#-#-#-#");
    }
}
