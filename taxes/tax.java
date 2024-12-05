package taxes;

import java.util.Scanner;

public class tax {
    public static void main(String args[])
    {
        double  salary;
        Scanner stdin;
 
        stdin = new Scanner(System.in);
        salary = stdin.nextDouble();
        if (salary > 50000.00)
            System.out.println(salary * 0.10);
        else
            System.out.println(salary * 0.05);
        stdin.close();
    }
}
