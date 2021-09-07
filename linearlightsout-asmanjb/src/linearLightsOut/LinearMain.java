package linearLightsOut;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Runs the Linear Lights Out application.
 * 
 * @author Jordan Asman. Created April 4, 2019
 */
public class LinearMain
{
	/**
	 * Starts here.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
		String nButtonsString = JOptionPane.showInputDialog("How many buttons would you like?");
		int nButtons = Integer.parseInt(nButtonsString);
		JFrame myFrame = new JFrame("Linear Lights Out!");
		myFrame.setSize(500, 200);
		// you'll want to think about how you want to manage the state of the game
		// also you want to add some buttons and stuff
		
		JPanel panel = new JPanel();
		JPanel label = new JPanel();
		
		myFrame.add(label, BorderLayout.CENTER);
		myFrame.add(panel, BorderLayout.SOUTH);
		
		JButton newGame = new JButton("New Game");
		JButton exit = new JButton("Exit");
		
		panel.add(newGame);
		panel.add(exit);
		
		for(int i=0;i<nButtons;i++)
		{
			int k = (int)(Math.random()*100);
			String j = "";
			if(k % 2 == 0)
				j = "X";
			else
				j = "O";
			JButton num = new JButton(j);
			buttons.add(num);
			label.add(num);
			GameButtonsListener gameButtons = new GameButtonsListener(buttons,myFrame);
			num.addActionListener(gameButtons);
		}
		
		NewGameButtonListener setNewGame = new NewGameButtonListener(buttons,myFrame);
		ExitButtonListener setExit = new ExitButtonListener(myFrame);
		newGame.addActionListener(setNewGame);
		exit.addActionListener(setExit);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}
