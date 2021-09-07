import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class SceneComponent extends JComponent
{
	/**
	 * draws the full scene
	 */
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

	    // Get the 2D graphics object
	    Graphics2D g2 = (Graphics2D)g;
	    
	    // Make sky
	    Rectangle sky = new Rectangle(0,0,750,375);
	    g2.setColor(Color.blue);
	    g2.draw(sky);
	    g2.fill(sky);
	    
	    // Make grass
	    Rectangle grass = new Rectangle(0,375,750,225);
	    g2.setColor(Color.green);
	    g2.draw(grass);
	    g2.fill(grass);
	    
	    // Make sun
	    Sun sun = new Sun();
	    sun.drawOn(g2);
	    
	    // Make houses
	    int betweenHouses = 750/5;
	    for(int k=0;k<5;k++)
	    {
	    	House house = new House(k*betweenHouses,450,Color.red);
	    	house.drawOn(g2);
	    }
	    
	    // Make little trees
	    int betweenLittleTrees = 750/25;
	    for(int i=0;i<25;i++)
	    {
	    	PineTree littleTree = new PineTree(i*betweenLittleTrees,350,10,40);
	    	littleTree.drawOn(g2);
	    }
	    
	    // Make big trees
	    int betweenBigTrees = 750/15;
	    for(int j=0;j<15;j++)
	    {
	    	PineTree bigTree = new PineTree(j*betweenBigTrees,325,20,80);
	    	bigTree.drawOn(g2);
	    }
	}
}
