import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D.Double;

public class Face
{
	private double faceRadius;
	private double eyeRadius;
	private double mouthRadius;
	private double centerX;
	private double centerY;
	private double x;
	private double y;
	private Color faceColor;
	private Color eyeColor;
	private Color outlineColor;
	private Color mouthColor;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param faceRadius
	 * @param faceColor
	 * @param eyeColor
	 * @param outlineColor
	 * @param mouthColor
	 */
	public Face(double x,double y,double faceRadius,Color faceColor,Color eyeColor,Color outlineColor,Color mouthColor)
	{
		this.faceRadius = faceRadius;
		this.x = x;
		this.y = y;
		this.eyeRadius = faceRadius*0.28;
		this.mouthRadius = faceRadius*0.7;
		this.centerX = x+faceRadius;
		this.centerY = y+faceRadius;
		this.faceColor=faceColor;
		this.eyeColor=eyeColor;
		this.outlineColor=outlineColor;
		this.mouthColor=mouthColor;
	}
	
	
	/**
	 * creates the draw on method for face
	 * @param g2
	 * @param angle
	 */
	public void drawOn(Graphics2D g2,double angle)
	{
		g2.rotate(angle);
		// Makes face
		Shape face = new Ellipse2D.Double(x,y,faceRadius*2,faceRadius*2);
		g2.setColor(outlineColor);
		g2.draw(face);
		g2.setColor(faceColor);
		g2.fill(face);
		
		// Makes eyes
		Shape leftEye = new Ellipse2D.Double(centerX-(0.75*faceRadius),centerY-(0.5*faceRadius),eyeRadius*2,eyeRadius*2);
		g2.setColor(eyeColor);
		g2.draw(leftEye);
		g2.fill(leftEye);
		Shape rightEye = new Ellipse2D.Double(centerX+(0.25*faceRadius),centerY-(0.5*faceRadius),eyeRadius*2,eyeRadius*2);
		g2.draw(rightEye);
		g2.fill(rightEye);
		
		// Makes mouth
		Shape mouth = new Arc2D.Double(centerX-mouthRadius,centerY-mouthRadius,mouthRadius*2,mouthRadius*2,-15,-150,0);
		g2.setColor(mouthColor);
		g2.draw(mouth);	
		
		g2.rotate(-angle);
	}
}
