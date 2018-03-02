/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;
public class MyMain
{
    public static void main(String[] args)
    {
        Overriding ob=new Overriding();
        ob.display();
        oss ob1=new oss();
        ob1.display();
        Overriding r=new oss();
        r.display();
    }
}
