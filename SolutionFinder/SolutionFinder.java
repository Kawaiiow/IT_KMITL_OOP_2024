package SolutionFinder;

public class SolutionFinder
{
    public static void main(String[] args)
    {
        double a;
        double b;
        double c;
       
        a = 4;
        b = 8;
        c = 3;
        System.out.println((-b + Math.sqrt(((Math.pow(b, 2))) - (4 * a * c))) / (2 * a));
        System.out.println((-b - Math.sqrt(((Math.pow(b, 2))) - (4 * a * c))) / (2 * a));
    }
}
