import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class FacesComponent extends JComponent
{
	/**
	 * creates the paint method for face
	 */
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		Face f1 = new Face(0.0,50.0,75.0,Color.red,Color.black,Color.blue,Color.darkGray);
		f1.drawOn(g2, 0);
		Face f2 = new Face(150.0,100.0,25.0,Color.black,Color.red,Color.blue,Color.blue);
		f2.drawOn(g2, 0);
		Face f3 = new Face(200.0,50.0,75.0,Color.black,Color.green,Color.red,Color.yellow);
		f3.drawOn(g2, 0);
		Face f4 = new Face(400.0,100.0,25.0,Color.black,Color.blue,Color.yellow,Color.green);
		f4.drawOn(g2, 0);
		Face f5 = new Face(0.0,0.0,30.0,Color.red,Color.blue,Color.green,Color.black);
		f5.drawOn(g2, 0);
		
		
		g2.translate(0, 200);
		for(int i=0;i<7;i++)
		{
			g2.translate(75,50);
			Face f = new Face(0.0,0.0,25.0,Color.yellow,Color.black,Color.black,Color.black);
			f.drawOn(g2,Math.PI/6*i);
		}
	}
}
