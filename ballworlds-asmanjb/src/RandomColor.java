import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.util.List;

public class RandomColor extends Pulsar
{
	private Color color;
	
	public RandomColor(BallEnvironment world)
	{
		super(world);
		
		int height = world.getSize().height;
		int width = world.getSize().width;
		double x = Math.random()*width;
		double y = Math.random()*height;
		Point2D.Double point = new Point2D.Double(x,y);
		this.setCenterPoint(point);
		
		int k = (int)(Math.random()*10);
		if(k==1)
			this.color = Color.BLACK;
		else if(k==2)
			this.color = Color.WHITE;
		else if(k==3)
			this.color = Color.CYAN;
		else if(k==4)
			this.color = Color.DARK_GRAY;
		else if(k==5)
			this.color = Color.GRAY;
		else if(k==6)
			this.color = Color.GREEN;
		else if(k==7)
			this.color = Color.LIGHT_GRAY;
		else if(k==8)
			this.color = Color.MAGENTA;
		else if(k==9)
			this.color = Color.ORANGE;
		else if(k==10)
			this.color = Color.PINK;
		else 
			this.color = Color.YELLOW;
	}
	
	public Color getColor()
	{
		return this.color;
	}

	@Override
	public void updatePosition()
	{
		
	}

	@Override
	public void updateSize()
	{
		
	}
	public void updateColor()
	{
		super.updateColor();
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
