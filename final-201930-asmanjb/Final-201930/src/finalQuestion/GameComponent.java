package finalQuestion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class GameComponent extends JComponent {
	private Face shape;

	public GameComponent(int x, int y, int w, int h) {
		this.shape = new Face(x, y, w, h);
		this.setPreferredSize(new Dimension(400, 300));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		this.shape.drawOn(g2);;
	}
	
	/**
	 * @return the x-coordinate of the contained shape
	 */
	public int getShapeX() {
		return (int) this.shape.getX();
	}

	/**
	 * @return the y-coordinate of the contained shape
	 */
	public int getShapeY() {
		return (int) this.shape.getY();
	}
	
	
	/**
	 * Moves the face to the specified destination.
	 *
	 * @param x and y coordinates of destination point.
	 */
	public void moveFace(int x, int y) {
		this.shape.setX(x);
		this.shape.setY(y);
		this.repaint();
	}

}
