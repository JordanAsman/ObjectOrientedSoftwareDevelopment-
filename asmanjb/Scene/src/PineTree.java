import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;

public class PineTree
{
	private int x;
	private int y;
	private int width;
	private int height;
	private Color trunkColor = new Color(145, 112, 33);
	private Color branchColor = new Color(40, 135, 22);
	
	public PineTree(int x, int y, int width, int height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	/**
	 * creates the draw on method for pine tree
	 * @param g2
	 */
	public void drawOn(Graphics2D g2)
	{
		int trunkWidth = width/3;
		int trunkHeight = height/3;
		int branchHeight = 2*(height/3);
		int branchWidth = width;
		int xTip = x + width/2;
		int [] xValues = new int [3];
		xValues[0] = x;
		xValues[1] = xTip;
		xValues[2] = x + branchWidth;
		int [] yValues = new int [3];
		yValues[0] = y + branchHeight;
		yValues[1] = y;
		yValues[2] = y + branchHeight;
		Rectangle trunk = new Rectangle(x+trunkWidth,y+branchHeight,trunkWidth,trunkHeight);
		g2.setColor(trunkColor);
		g2.draw(trunk);
		g2.fill(trunk);
		Polygon branch = new Polygon(xValues,yValues,3);
		g2.setColor(branchColor);
		g2.draw(branch);
		g2.fill(branch);
	}
}
