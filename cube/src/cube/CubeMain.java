/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cube;


public class CubeMain {
    
    public static void main(String[] args)
    {
        Rectangle myrectangle=new Rectangle(20,10);
        Cube1 mycube=new Cube1(myrectangle,5);
        Cube1 mycube2=new Cube1(mycube);
        
        System.out.println("Print Rectangle Area and Perimeter");
        System.out.print(myrectangle.area());
        System.out.print(" and ");
        System.out.println(myrectangle.perimeter());
        System.out.println("Print Cube1 valume");
        System.out.println(mycube.volume());
        System.out.println("Print Cube2 valume");
        System.out.println(mycube2.volume());
        
    }
    
}
