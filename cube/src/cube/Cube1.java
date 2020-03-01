/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cube;

public class Cube1 {
    int hight;
    
    Rectangle r1=new Rectangle();
     
    //here i pass other type object through a constructor..
     Cube1(Rectangle r1,int hight)
     {
         this.hight=hight;
         this.r1.length=r1.length;
         this.r1.breath=r1.breath;
     }
     Cube1()
     {
         hight=1;
         r1.length=1;
         r1.breath=1;
     }
     //here i pass same type object through constructure...
     Cube1(Cube1 C )
     {
         this.hight=C.hight;
         this.r1.length=C.r1.length;
         this.r1.breath=C.r1.breath;
     }
     int getHight()
     {
         return hight;
     }
     /*here i pass other object through a function..*/
     int volume()
     {
         return r1.area()*hight;
     }
    
}
