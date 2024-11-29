package CircleArea;
import java.util.*;

public class CircleArea
{
    public static void main(String[] args)
    {
        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
        input.close();
    }
}
