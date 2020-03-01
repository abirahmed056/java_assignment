
package cube;

/**
 *
 * @author Abir
 */
public class Rectangle {
    
    int length;
    int breath;
    
    Rectangle(int length,int breath)
    {
        this.length=length;
        this.breath=breath;
    }
    Rectangle()
    {
        length=1;
        breath=1;
    }
    int getLength(){
        return length;
    }
    int gethBreath(){
        return breath;
    }
    
    int area()
    {
        return length*breath;
    }
    int perimeter()
    {
        return 2*(length+breath);
    }
    
    
    
}
