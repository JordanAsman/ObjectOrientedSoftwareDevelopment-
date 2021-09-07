package pizza;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;

public class Pizza
{

	private final Color CRUST_COLOR = new Color(238, 216, 174);
	private final Color CHEESE_COLOR = new Color(253, 245, 230);
	private final Color PEPPERONI_COLOR = new Color(205, 55, 0);
	private final int CRUST_THICKNESS = 10;
	private final int PEPPERONI_SIZE = 15;
	private int centerX;
	private int centerY;
	private int size;

	public Pizza()
	{
		this.centerX = 100;
		this.centerY = 100;
		this.size = 150;
	}
	public Pizza(int centerX,int centerY,int size)
	{
		this.centerX=centerX;
		this.centerY=centerY;
		this.size=size;
	}

	/**
	 * Draws the Pizza crust
	 * 
	 * @param g2
	 */
	public void drawCrust(Graphics2D g2)
	{
		int startX = centerX - (size / 2);
		int startY = centerY - (size / 2);
		g2.setColor(CRUST_COLOR);
		g2.fillOval(startX, startY, size, size);
	}

	/**
	 * Draws the "cheesey part" of the Pizza, where the toppings can be placed. This
	 * part is circular and is smaller than the crust. The radius of the cheese is
	 * CRUST_THICKNESS shorter than the radius of the crust.
	 * 
	 * @param g2
	 */
	public void drawCheese(Graphics2D g2)
	{
		int cheeseSize = size-CRUST_THICKNESS;
		int startX = centerX - (cheeseSize/2);
		int startY = centerY - (cheeseSize/2);
		g2.setColor(CHEESE_COLOR);
		g2.fillOval(startX,startY,cheeseSize,cheeseSize);
		
		
		// Complete the method
	}

	/**
	 * Draws the entire pizza
	 * 
	 * @param g2
	 */
	public void drawOn(Graphics2D g2)
	{
		g2.translate(centerX, centerY);
		this.drawCrust(g2);
		this.drawCheese(g2);
		g2.translate(-centerX, -centerY);
		// Complete this method in stage 4
	}

	/**
	 * Adds a slice of pepperoni in the specified position. Be careful how you do
	 * so. You should be able to translate the pizza later without having to change
	 * this method.
	 * 
	 * @param x
	 * @param y
	 */
	public void addPepperoni(int x, int y, Graphics2D g2)
	{
		g2.setColor(PEPPERONI_COLOR);
		g2.fillOval(x, y, PEPPERONI_SIZE, PEPPERONI_SIZE);
	}

	/**
	 * 
	 * Sets translation distance in both the x and y directions. Implement this
	 * method so that the "pepperoni" related methods do not have to change.
	 * 
	 * @param x
	 * @param y
	 */
	public void setTranslation(int x, int y)
	{
		this.centerX = centerX + x;
		this.centerY = centerY + y;
	}

}
