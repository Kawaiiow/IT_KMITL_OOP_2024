package salary;

import java.util.Scanner;;

public class salary {
    public static void main(String args[])
    {
        Scanner stdin;
        String  name;
        int     age;
        int     work;
        int     absn;
        int     weight;
        int     salary;
        int     bonus;

        stdin = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        name = stdin.next();
        System.out.print("Please insert your age : ");
        age = stdin.nextInt();
        System.out.print("Please insert your number of working days : ");
        work = stdin.nextInt();
        System.out.print("Please insert your number of absent days : ");
        absn = stdin.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = stdin.nextInt();
        salary = 0;
        bonus = 0;
        if (age > 20 && age <= 30)
            salary = work * 300 - absn * 50;
        else if (age > 31 && age <= 40)
            salary = work * 500 - absn * 50;
        else if (age > 41 && age <= 50)
            salary = work * 1000 - absn * 25;
        else if (age > 51 && age <= 60)
            salary = work * 3000;
        if (weight >= 10 && weight <= 60)
            bonus = 5000;
        else if (weight > 60 && weight <= 90)
            bonus = 5000 - ((weight - 60) * 10);
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary);
        System.out.println("Your salary and bonus is " + (salary + bonus));
    }
}
