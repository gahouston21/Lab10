import java.awt.Color;
import java.awt.Graphics;


public class Polygon extends Shape
{
	
	
	public Polygon(Color color, boolean filled)
	{
		super(color,filled);
	}
	
	

	public void draw(Graphics graphics)
	{
		graphics.setColor(this.getColor());
		
		int[] xCoords = new int[location.length];
		int[] yCoords = new int[location.length];
		
		for(int i = 0; i < location.length; i++)
		{
			xCoords[i] = (int)location[i].getX();
			yCoords[i] = (int)location[i].getY();
		
		}
		
		graphics.drawPolygon(xCoords, yCoords, location.length);
		
		if(isFilled())
		{
			graphics.fillPolygon(xCoords, yCoords, location.length);
		}
		
	}
}
