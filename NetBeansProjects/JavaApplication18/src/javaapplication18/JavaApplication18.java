
package javaapplication18;
class A
{
    String name="A";
    String getName()
            {
                return name;
            }
    String greeting()
    {
        return "class A";
    }
}
class b extends A
{
    String name="B";
    String greeting()
    {
        return "class B";
    }
}
public class JavaApplication18 
{
    public static void main(String... args) 
    {
        A a=new A();
        A b=new b();
        System.out.println(a.greeting() +" has name "+a.getName());
        System.out.println(b.greeting() +" has name "+b.getName());
    }
    
}
