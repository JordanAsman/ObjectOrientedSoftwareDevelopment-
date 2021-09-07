import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.List;

public class Exploder extends AbstractBouncer
{
	private double diameter;
	private double maxDiameter;
	private Color color;
	private BallEnvironment world;
	private Point2D centerPoint;
	
	public Exploder(BallEnvironment world)
	{
		super(world);
		this.world = world;
		this.diameter = Math.random()*10;
		this.maxDiameter = diameter*(Math.random()*(10-2)+2);
		this.color = Color.MAGENTA;
	}
	
	public Exploder(BallEnvironment world,Point2D centerPoint)
	{
		super(world,centerPoint);
		this.world = world;
		this.diameter = Math.random()*10;
		this.maxDiameter = diameter*(Math.random()*(10-2)+2);
		this.color = Color.MAGENTA;
		this.centerPoint = centerPoint;
	}

	@Override
	public Color getColor()
	{
		return color;
	}

	@Override
	public void updatePosition()
	{
		super.updatePosition();
	}

	@Override
	public void updateSize()
	{
		if(!this.getIsPaused())
		{
			if(diameter < maxDiameter)
			{
				this.diameter = this.getDiameter() + 0.1;
				this.getShape();
			}
			if(diameter >= maxDiameter)
			{
				double x = this.getCurrentX();
				double y = this.getCurrentY();
				this.centerPoint = new Point2D.Double(x,y);
						
				Exploder a = new Exploder(this.getWorld(),centerPoint);
				Exploder b = new Exploder(this.getWorld(),centerPoint);
				world.addBall(a);
				world.addBall(b);
				a.getShape();
				b.getShape();
				this.die();
			}
		}
	}

	@Override
	public void updateColor()
	{

	}

	@Override
	public double getDiameter()
	{
		return this.diameter;
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
