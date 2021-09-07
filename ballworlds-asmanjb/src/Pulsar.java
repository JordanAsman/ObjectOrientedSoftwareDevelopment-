import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.util.List;

public class Pulsar extends Ball
{
	private Color color;
	private Boolean increasing;
	
	public Pulsar(BallEnvironment world)
	{
		super(world);
		this.color = Color.BLACK;
		int height = world.getSize().height;
		int width = world.getSize().width;
		double x = Math.random()*width;
		double y = Math.random()*height;
		Point2D.Double point = new Point2D.Double(x,y);
		this.setCenterPoint(point);
	}

	@Override
	public Color getColor()
	{
		return color;
	}

	@Override
	public void updatePosition()
	{
		
	}

	@Override
	public void updateSize()
	{
		
	}

	@Override
	public void updateColor()
	{
		if(!this.getIsPaused())
		{
			int red = this.color.getRed();
			int green = this.color.getGreen();
			int blue = this.color.getBlue();
			if(red == 255 && green == 255 && blue == 255)
			{
				this.color = new Color(red-1,green-1,blue-1);
				increasing = false;
			}
			if(red == 0 && green == 0 && blue == 0)
			{
				this.color = new Color(red+1,green+1,blue+1);
				increasing = true;
			}
			else
			{
				if(increasing)
				{
					this.color = new Color(red+1,green+1,blue+1);
				}
				else
				{
					this.color = new Color(red-1,green-1,blue-1);
				}
			}
		}
	}

	@Override
	public double getDiameter()
	{
		return 25;
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