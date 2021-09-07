package events;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * The BubbleComponent class allows you to keep track of a list of Bubbles. In
 * addition, it allows you to add Bubbles.
 * 
 * Bubbles can be added at bottom and incrementally across the screen
 * 
 * 
 * 
 * @author Jordan Asman
 *
 */
public class BubbleComponent extends JComponent
{

	private ArrayList<Bubble> bubbles = new ArrayList<Bubble>();

	// Used to increment the x position where Bubbles are added
	private int curXPos = BubbleViewer.CANVAS_SIZE / 2;

	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		for (Bubble b : this.bubbles)
		{
			b.drawOn(g2);
		}
	}

	/**
	 * Add Bubble of a given size (same as Bubble diameter) to Component,
	 * incrementing the locations across the bottom of the screen.
	 * 
	 * @param size
	 */
	public void addBubble(int size)
	{
		this.bubbles.add(new Bubble(curXPos, BubbleViewer.CANVAS_SIZE * 2 / 3, size));
		curXPos += size;
		if (curXPos > BubbleViewer.CANVAS_SIZE)
		{
			curXPos = 0;
		}
	}
	
	public void floatBubble()
	{
		for(int i = 0; i < this.bubbles.size(); i++)
		{
			this.bubbles.get(i).floatUp();
		}
	}
	
	public void popBubble()
	{
		ArrayList<Bubble> newBubbles = new ArrayList<Bubble>();
		for(int i=0;i<this.bubbles.size();i++)
		{
			int diameter = this.bubbles.get(i).getDiameter();
			if(diameter > 10)
			{
				int x = this.bubbles.get(i).getX();
				int y = this.bubbles.get(i).getY();
				Bubble b = new Bubble(x-diameter/2,y,diameter/2);
				Bubble c = new Bubble(x+diameter/2,y,diameter/2);
				newBubbles.add(b);
				newBubbles.add(c);
			}
		}
		for(int k = this.bubbles.size()-1;k>-1;k--)
		{
			this.bubbles.remove(this.bubbles.get(k));
		}
		for(int j=0;j<newBubbles.size();j++)
		{
			this.bubbles.add(newBubbles.get(j));
		}
	}

}
