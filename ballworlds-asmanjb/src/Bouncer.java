import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.util.List;

public class Bouncer extends AbstractBouncer
{
	
	private Color color;

	public Bouncer(BallEnvironment world)
	{
		super(world);
		this.color = Color.GREEN;
	}

	@Override
	public Color getColor()
	{
		return this.color;
	}

	@Override
	public void updatePosition()
	{
		super.updatePosition();
	}

	@Override
	public void updateSize()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateColor()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getDiameter()
	{
		return 20;
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
