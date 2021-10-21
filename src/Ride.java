public class Ride //Learning about method overriding in java
{

    void class1()
    {
        System.out.println("superclass");
    }
   static class class2 extends Ride

   {
     void class1()
{
    System.out.print("sub class");

}}
public static void main(String[]args)
{
    class2 a1=new class2();
    a1.class1();
}
}

