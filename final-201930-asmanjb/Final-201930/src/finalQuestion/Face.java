package finalQuestion;

import java.awt.Color;
import java.awt.Graphics2D;

public class Face {
	private int x, y, width, height;
	private Color faceColor, eyeColor;
	
	public Face(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.faceColor = Color.YELLOW;
		this.eyeColor = Color.BLACK;
	}
	public void drawOn(Graphics2D g) {
		g.setColor(this.faceColor);
		g.fillOval(getX(), getY(), getWidth(), getHeight());
		g.setColor(this.eyeColor);
		g.fillOval(getX()+getWidth()/3, getY()+getHeight()/3, getWidth()/10, getHeight()/10);
		g.setColor(this.eyeColor);
		g.fillOval(getX()+getWidth()*2/3, getY()+getHeight()/3, getWidth()/10, getHeight()/10);
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
