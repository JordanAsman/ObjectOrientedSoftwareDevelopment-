import java.awt.Color;
import java.awt.geom.Point2D;

/**
 * A ball that bounces off the walls.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public abstract class AbstractBouncer extends Ball
{
	private double height;
	private double width;
	private double currentX;
	private double currentY;
	private double velocityX;
	private double velocityY;
	private Point2D centerPoint;

	/**
	 * Constructs a abstract bouncer in the given world.
	 * 
	 * @param world
	 */
	public AbstractBouncer(BallEnvironment world)
	{
		super(world);
		
		this.height = world.getSize().height;
		this.width = world.getSize().width;
		double x = width/2;
		this.currentX = x;
		double y = height/2;
		this.currentY = y;
		Point2D.Double point = new Point2D.Double(x,y);
		this.setCenterPoint(point);
		
		int i = (int)(Math.random()*100);
		int j = (int)(Math.random()*100);
		if(i%2 == 0)
			this.velocityX = Math.random();
		else
			this.velocityX = -1 * Math.random();
		if(j%2==0)
			this.velocityY = Math.random();
		else
			this.velocityY = -1 * Math.random();
	}
	public AbstractBouncer(BallEnvironment world,Point2D centerPoint)
	{
		super(world,centerPoint);
		this.centerPoint = centerPoint;
		this.setCenterPoint(centerPoint);
		this.currentX = centerPoint.getX();
		this.currentY = centerPoint.getY();
		
		int i = (int)(Math.random()*100);
		int j = (int)(Math.random()*100);
		if(i%2 == 0)
			this.velocityX = Math.random();
		else
			this.velocityX = -1 * Math.random();
		if(j%2==0)
			this.velocityY = Math.random();
		else
			this.velocityY = -1 * Math.random();
	}
	
	public void updatePosition()
	{
		if(!this.getIsPaused())
		{
			if(currentX-25 <= 0 || currentX+25 >= width)
			{
				velocityX = -1*velocityX;
			}
			if(currentY-25 <= 0 || currentY+25 >= height)
			{
				velocityY = -1*velocityY;
			}
			double x = currentX + velocityX;
			double y = currentY + velocityY;
			Point2D.Double point = new Point2D.Double(x,y);
			this.setCenterPoint(point);
			currentX = x;
			currentY = y;
		}
	}
	
	public double getCurrentX()
	{
		return this.currentX;
	}
	
	public double getCurrentY()
	{
		return this.currentY;
	}
}
