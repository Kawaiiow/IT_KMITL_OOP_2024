package student;

import java.util.Scanner;

public class Student
{
    public String   name;
    public double   mScore;
    public double   fScore;

    public Student(String name, double mScore, double fScore)
    {
        this.name = name;
        this.mScore = mScore;
        this.fScore = fScore;
    }

    public void showGrade()
    {
        double s;

        s = (this.mScore * 0.4 + this.fScore * 0.4) + 20;
        if (s >= 80)
            System.out.println("Your grade is A");
        else if (s >= 70)
            System.out.println("Your grade is B");
        else if (s >= 60)
            System.out.println("Your grade is C");
        else if (s >= 50)
            System.out.println("Your grade is D");
        else
            System.out.println("Your grade is F");
    }

    public static void main (String args[])
    {
        Scanner stdin;
        Student p1;

        stdin = new Scanner(System.in);
        p1 = new Student(stdin.next(), stdin.nextDouble(), stdin.nextDouble());
        p1.showGrade();
        stdin.close();
    }
}
