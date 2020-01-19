import java.awt.Color;
import java.awt.Graphics;

/*
 * Name: Hengcheng Yu
 * Date: 2017/04/27
 * Desc: This class defines a Line class for the paint program
 * 
 */

public class Line extends Shape{
    //This constructor takes 4 integer parameter represents (x1,y1) and (x2,y2) coordinates
    //of the shape and one Color object 
    public Line(int x1,int y1,int x2,int y2, Color color){
        super(x1,y1,x2,y2,color);
    }
    
    //This method draws a line with its coordinates
    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawLine( getX1(), getY1(), getX2(), getY2());
    }
    
    //This method returns false all the time because a line cannot be selected
    @Override
    public boolean isSelected(int x,int y){
      return false;
    }
    
    //This method returns false all the time because a line cannot be selected
    @Override
    public boolean isSelected(int x1,int y1, int x2, int y2){
      return false;
    }
}