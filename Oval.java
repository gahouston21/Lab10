import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape
{
	int diameter1;
	int diameter2;
	Point pointUL;
	
	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
	{
		super(color, filled);
		this.diameter1 = d1;
		this.diameter2 = d2;
		this.pointUL = pointUL;
	}
	
	public int getDiameter1() 
	{
		return diameter1;
	}
	
	public int getDiameter2()
	{
		return diameter2;
	}
	
	public void draw(Graphics graphics)
	{
		graphics.setColor(this.getColor());
		
		
		graphics.drawOval((int)pointUL.getX(),(int)pointUL.getY() , getDiameter1(), getDiameter2());
		
		if(isFilled())
		{
			graphics.fillOval((int)pointUL.getX(),(int)pointUL.getY() , getDiameter1(), getDiameter2());
		}
		
	}
}
