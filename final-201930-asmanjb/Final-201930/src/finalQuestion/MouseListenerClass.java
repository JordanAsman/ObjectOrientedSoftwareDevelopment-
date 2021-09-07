package finalQuestion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

public class MouseListenerClass implements MouseListener 
{
	private int xValue;
	private int yValue;
	private GameFrame frame;
	private GameComponent gameComponent;
	private int moveX = 0;
	private int moveY = 0;
	
	public MouseListenerClass(int xValue,int yValue, GameComponent gameComponent,GameFrame frame) {
		this.xValue = xValue;
		this.yValue = yValue;
		this.gameComponent = gameComponent;
		this.frame = frame;
	}
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		while(moveX < e.getX() && moveY < e.getY()) {
			moveX++;
			moveY++;
			xValue = moveX;
			yValue = moveY;
			gameComponent.moveFace(xValue, yValue);
			System.out.println("X: " + xValue + " Y: " + yValue);
			frame.updateXJText(xValue);
			frame.updateYJText(yValue);
		}	

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		moveX = 0;
		moveY = 0;
	}
}
