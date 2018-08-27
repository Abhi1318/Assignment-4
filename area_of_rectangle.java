import java.util.*;
class Rectangle
{
    Scanner sc=new Scanner(System.in);
    double length,breadth;
    void CalculateArea()
    {
        System.out.print("Enter Length: ");
        length=sc.nextDouble();
        System.out.print("Enter Breadth: ");
        breadth=sc.nextDouble();
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
public class Assignment
{
    public static void main(String[] args)
    {
        Rectangle ob=new Rectangle();
        ob.CalculateArea();
    }
}