package ballStrikeCounter;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tracker
{
	private JLabel label = new JLabel();

	// Call this to update the text on the label.
	public void updateLabel(int numBalls, int numStrikes)
	{
		this.label.setText("<html>Balls: " + numBalls + "<br />Strikes: " + numStrikes + "</HTML>");
	}

	public static void main(String[] args)
	{
		new Tracker();
	}

	public Tracker()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.add(label, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);

		// TODO: Add buttons and listeners to make things work.

		JButton balls = new JButton("Ball");
		JButton strikes = new JButton("Strike");
		
		panel.add(balls);
		panel.add(strikes);
		
		MyButtonListener ball = new MyButtonListener("ball");
		balls.addActionListener(ball);
		MyButtonListener strike = new MyButtonListener("strike");
		strikes.addActionListener(strike);

		// The following line is given to show you how to use the given method:
		updateLabel(0, 0);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		while(true)
		{
			if(ball.getCount()==4 || strike.getCount()==3)
			{
				ball.updateCount(0);
				strike.updateCount(0);
				updateLabel(0,0);
			}
			updateLabel(ball.getCount(),strike.getCount());
		}
	}
}

