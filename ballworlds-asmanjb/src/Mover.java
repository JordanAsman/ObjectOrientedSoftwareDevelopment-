import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.util.List;
import java.util.Random;

public class Mover extends Ball
{
	private double velocityX;
	private double velocityY;
	private Color color;
	private double currentX;
	private double currentY;

	public Mover(BallEnvironment world)
	{
		super(world);
		int height = world.getSize().height;
		int width = world.getSize().width;
		double x = width/2;
		this.currentX = x;
		double y = height/2;
		this.currentY = y;
		Point2D.Double point = new Point2D.Double(x,y);
		this.setCenterPoint(point);
		
		int i = (int)(Math.random()*100);
		int j = (int)(Math.random()*100);
		if(i%2 == 0)
		{
			this.velocityX = Math.random();
		}
		else
		{
			this.velocityX = -1 * Math.random();
		}
		if(j%2==0)
		{
			this.velocityY = Math.random();
		}
		else
		{
			this.velocityY = -1 * Math.random();
		}
		this.color = Color.CYAN;
	}

	@Override
	public Color getColor()
	{
		return color;
	}

	@Override
	public void updatePosition()
	{
		if(!this.getIsPaused())
		{
			double x = currentX + velocityX;
			double y = currentY + velocityY;
			Point2D.Double point = new Point2D.Double(x,y);
			this.setCenterPoint(point);
			currentX = x;
			currentY = y;
		}
	}

	@Override
	public void updateSize()
	{
		
	}

	@Override
	public void updateColor()
	{
	
	}

	@Override
	public double getDiameter()
	{
		return 30;
	}

	@Override
	public void addBall(Ball ball)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBall(Ball ball)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ball nearestBall(Point2D point)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInsideWorldX(Point2D point)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInsideWorldY(Point2D point)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInsideWorld(Point2D point)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Dimension getSize()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Drawable> getDrawableParts()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}