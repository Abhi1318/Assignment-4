import java.util.*;
class Complex
{
    int real,imag;
    Scanner sc=new Scanner(System.in);
    void ComplexNumber()
    {
        System.out.print("Enter Real Part: ");
        real=sc.nextInt();
        System.out.print("Enter Imaginary Part: ");
        imag=sc.nextInt();
    }
    void Display()
    {
        System.out.println("Entered Complex Number:\n"+real+"+"+imag+"i");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Complex ob=new Complex();
        ob.ComplexNumber();
        ob.Display();
    }
    
}