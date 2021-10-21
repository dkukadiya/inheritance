public class Seven //Learning about this calling statement
{
    Seven()
    {
        System.out.println("my zero constructor");
    }
    Seven(int a)
    {
        this();
        System.out.println("my first constructor");
    }
    Seven(double b,int a)
    {
        this(20);
        System.out.println("my second constructor");
    }
    Seven(char c,double b,int a)
    {
        this(23.34,6);
        System.out.println("my third constructor");
    }
    Seven(char c,double b)
    {
        this('z',3.6,10);
        System.out.println("my fourth constructor");
    }
    Seven(double b)
    {
        this('a',2.3);
        System.out.println("my fifth constructor");
    }
    public static void main(String[]args)
    {
        System.out.println("i love software testing");
        new Seven(7.5);
    }
}
