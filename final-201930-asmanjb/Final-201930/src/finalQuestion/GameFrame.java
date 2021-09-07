package finalQuestion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameFrame extends JFrame {
	
	private GameComponent gameComponent;
	private int xValue = 0;
	private int yValue = 0;
	private JTextField x = new JTextField();
	private JTextField y = new JTextField();
	
	public GameFrame() {
		this.setTitle("Great Graphics Game");
		
		this.gameComponent = new GameComponent(10,10,50,50);
		this.add(this.gameComponent, BorderLayout.CENTER);

		// TODO: Add labels, text fields, and button to south region of frame
		// Might consider adding these in their own Control panel. Default x, y 
		// values of text fields should be 10.
		
		JPanel panel = new JPanel();
		this.add(panel,BorderLayout.SOUTH);
		
		JLabel xPos = new JLabel("X:");
		this.x.setPreferredSize(new Dimension(100,20));
		panel.add(xPos,BorderLayout.WEST);
		panel.add(this.x);
		
		JLabel yPos = new JLabel("Y:");
		this.y.setPreferredSize(new Dimension(100,20));
		panel.add(yPos,BorderLayout.CENTER);
		panel.add(this.y);
		
		JButton update = new JButton("Update");
		panel.add(update,BorderLayout.EAST);
		
		
		// TODO: When user edits text fields with integer values and click update
		// button, the face should move to the specified position.
		
		ActionListener updateListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Clicked");
				System.out.println("X " + xValue + " Y " + yValue);
				// only works with 0 - 9
				gameComponent.moveFace(xValue, yValue);
				
			}
		};
		
		update.addActionListener(updateListener);
		
		KeyListener xListener = new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e)
			{
				xValue = (e.getKeyCode() - 48);
			}

			@Override
			public void keyReleased(KeyEvent e)
			{

			}

			@Override
			public void keyTyped(KeyEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		};
		this.x.addKeyListener(xListener);
		
		KeyListener yListener = new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e)
			{
				yValue = (e.getKeyCode() - 48);
			}

			@Override
			public void keyReleased(KeyEvent e)
			{
				
			}

			@Override
			public void keyTyped(KeyEvent e)
			{
				
			}
		};
		this.y.addKeyListener(yListener);
		// TODO: Add a MouseMotionListener instance to handle mouse drag events.
		// Dragging the mouse should cause the face to follow the mouse.
		
		MouseListener mouse = new MouseListenerClass(xValue,yValue,gameComponent,this);
		this.addMouseListener(mouse);
		// TODO: Dragging the mouse should cause the text fields to be updated with
		// x, y coordinates of the position of the mouse.
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
	}
	
	public void updateXJText(int newX) {
		this.x = new JTextField(newX);
	}
	
	public void updateYJText(int newY) {
		this.y = new JTextField(newY);
	}
}
