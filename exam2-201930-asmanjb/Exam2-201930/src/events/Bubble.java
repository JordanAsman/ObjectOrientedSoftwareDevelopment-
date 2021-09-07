package events;

import java.awt.Graphics2D;

/**
 * The Bubble class contains the necessary information to draw a Bubble on a
 * provided graphics context. It can have a location and a diameter specified.
 * In addition, Bubbles can be told to floatUp() in which case they move up half
 * their diameter. They can also be popped, in which case two smaller Bubbles
 * are returned to use as replacements for the original Bubble.
 * 
 * @author Jordan Asman
 *
 */

public class Bubble
{

	// Determines location of upper left corner and diameter of Bubble to be drawn
	private int x, y, diameter;

	public Bubble(int x, int y, int diameter)
	{
		this.x = x;
		this.y = y;
		this.diameter = diameter;
	}

	/**
	 * Draws the Bubble according to its location and diameter
	 * 
	 * @param g
	 */
	public void drawOn(Graphics2D g)
	{
		g.drawOval(this.x, this.y, this.diameter, this.diameter);
	}

	/*
	 * Moves the bubble up by half its diameter
	 * 
	 */
	public void floatUp()
	{
		this.y -= this.diameter / 2;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public int getDiameter()
	{
		return this.diameter;
	}

}
