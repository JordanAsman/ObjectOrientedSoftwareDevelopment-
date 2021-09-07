import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class House
{
	private static final int HEIGHT = 50;
	private static final int WIDTH = 100;
	private static final int ROOF_HEIGHT = 20;
	private int x;
	private int y;
	
	private Color color;

	public House(int x, int y, Color color)
	{
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	/**
	 * creates the draw on method for house
	 * @param g2
	 */
	public void drawOn(Graphics2D g2)
	{
		double xTip = x + WIDTH/2;
		double yTip = y - ROOF_HEIGHT;
		Rectangle base = new Rectangle(x,y,100,50);
		g2.setColor(color);
		g2.draw(base);
		g2.fill(base);
		Line2D.Double roof = new Line2D.Double(x,y,xTip,yTip);
		Line2D.Double roof2 = new Line2D.Double(x+WIDTH,y,xTip,yTip);
		g2.draw(roof);
		g2.fill(roof);
		g2.draw(roof2);
		g2.fill(roof2);
	}

}
