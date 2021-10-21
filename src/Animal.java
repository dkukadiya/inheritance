public class Animal //Learning about polymorphism runtime example
{
    void eat() {
        System.out.println("eating!!");
    }}
    class Dog extends Animal{
         void eat()
        {System.out.println("eating bread");}
    }
    class cat extends Animal{
         void eat()
        {System.out.println("eating rat");
    }}
    class Lion extends Animal{
         void eat()
        {System.out.println("eating meat");
    }}
    class testpolymorphism3{
        public static void main(String[]args)
    {
        Animal a;
        a=new Dog();
        a.eat();
        a=new cat();
        a.eat();
        a=new Lion();
        a.eat();
    }}

