  public class Nine //Learning about hybrid level inheritance
{
    void college()
    {
        System.out.println("Going to college");
    }
}
    class Ten extends Nine
    {
    void school()
    {
        System.out.println("Going to school");
    }
    }

  class Eleven extends Ten
 {
     void hospital()

 {
     System.out.println("Going to hospital");
 }}
 class fourteen extends Nine
 {
 void play()
 {
     System.out.println("Non static method");
 }
public static void main(String[] args)
{
    System.out.println("Main method");
    fourteen t1= new fourteen();
    t1.play();
    t1.college();
    Eleven a1=new Eleven();
    a1.hospital();
    a1.school();
    a1.college();
}}


