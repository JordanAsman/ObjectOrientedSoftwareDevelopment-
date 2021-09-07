package events;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * This is a complete example to get you started
 * 
 * @author Jordan Asman
 *
 */
public class BubbleViewer extends BubbleComponent
{

	public static final int CANVAS_SIZE = 400;
	public static final int BUBBLE_SIZE = 40;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();

		BubbleComponent component = new BubbleComponent();
		// Default provided
		component.addBubble(BUBBLE_SIZE);
		
		// Add buttons and panels here
		JPanel panel = new JPanel();
		JButton addButton = new JButton("add");
		JButton floatButton = new JButton("float");
		JButton popButton = new JButton("pop");
		panel.add(addButton);
		panel.add(floatButton);
		panel.add(popButton);
		frame.add(panel,BorderLayout.SOUTH);
		
		ActionListener addBubble = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				component.addBubble(BUBBLE_SIZE);
				frame.repaint();
			}
		};
		
		addButton.addActionListener(addBubble);
		
		ActionListener floatBubble = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				component.floatBubble();
				frame.repaint();
			}
		};
		
		floatButton.addActionListener(floatBubble);
		
		ActionListener popBubble = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				component.popBubble();
				frame.repaint();
			}
		};
		
		popButton.addActionListener(popBubble);
		
		frame.add(component, BorderLayout.CENTER);

		frame.setSize(CANVAS_SIZE, CANVAS_SIZE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
