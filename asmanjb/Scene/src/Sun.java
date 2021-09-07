import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Sun
{
	 private static final Color BORDER_COLOR = Color.BLACK;
	 private static final int NUMBER_OF_RAYS = 8;
	 private static final double RAY_LENGTH_SCALE = 0.5;
	 private static final double RAY_WIDTH_SCALE = 0.1;
	 private static final double RAY_DISTANCE_FROM_SUN_SCALE = .2;
	 private static final double DEFAULT_SUN_DIAMETER = 100.0;
	 private static final double DEFAULT_SUN_X = 100.0;
	 private static final double DEFAULT_SUN_Y = 100.0;
	 private static final Color DEFAULT_SUN_COLOR = Color.YELLOW;
	 private static final double LITTLE_SUNS_X_OFFSET = 50; 
	 private double x;
	 private double y;
	 private double circleDiameter;
	 private double rayLength;
	 private double rayWidth;
	 private double rayDistanceFromSun;
	 private Color color;
	 
	 public Sun(double x,double y,double circleDiameter,Color color)
	 {
		 this.x=x;
		 this.y=y;
		 this.circleDiameter=circleDiameter;
		 this.color=color;
		 this.rayLength=this.circleDiameter*RAY_LENGTH_SCALE;
		 this.rayWidth=this.circleDiameter*RAY_WIDTH_SCALE;
		 this.rayDistanceFromSun=this.circleDiameter*RAY_DISTANCE_FROM_SUN_SCALE;
	 }
	 
	 public Sun()
	 {
		 this.x=DEFAULT_SUN_X;
		 this.y=DEFAULT_SUN_Y;
		 this.circleDiameter=DEFAULT_SUN_DIAMETER;
		 this.color=DEFAULT_SUN_COLOR;
		 this.rayLength=this.circleDiameter*RAY_LENGTH_SCALE;
		 this.rayWidth=this.circleDiameter*RAY_WIDTH_SCALE;
		 this.rayDistanceFromSun=this.circleDiameter*RAY_DISTANCE_FROM_SUN_SCALE;
	 }
	 
	 /**
	  * creates the draw on method for sun
	  * @param g2
	  */
	 public void drawOn(Graphics2D g2)
	 {		
		double centerX = x+circleDiameter/2;
		double centerY = y+circleDiameter/2;
		Shape sun = new Ellipse2D.Double(x,y,circleDiameter,circleDiameter);
		g2.setColor(BORDER_COLOR);
		g2.draw(sun);
		g2.setColor(color);
		g2.fill(sun);
		for(int i =0; i < NUMBER_OF_RAYS;i++)
		{
			g2.translate(centerX, centerY);
			g2.rotate(i*2*Math.PI/NUMBER_OF_RAYS);
			this.drawRay(g2);
			g2.rotate(-i*2*Math.PI/NUMBER_OF_RAYS);
			g2.translate(-centerX,-centerY);
		}
	 }
	 
	 public void drawRay(Graphics2D g2)
	 {
		 double circleRadius = circleDiameter/2;
		 g2.setColor(BORDER_COLOR);
		 Rectangle ray = new Rectangle((int)(circleDiameter/2+rayDistanceFromSun),0,(int)rayLength,(int)rayWidth);
		 g2.draw(ray);
		 g2.setColor(color);
		 g2.fill(ray);
	 }
}
