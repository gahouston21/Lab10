import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

public abstract class Shape implements Drawable
{
	protected Point[] location;
	private Color color;
	private boolean filled;
	
	public Shape(Color color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
	public boolean isFilled()
	{
		if(filled = true)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public Point[] getLocation()
	{
		return location;
	}
	
}
