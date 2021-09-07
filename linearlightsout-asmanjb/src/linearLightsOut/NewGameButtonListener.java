package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This button listener resets the buttons for a new game
 * 
 * @author Jordan Asman
 *
 */
public class NewGameButtonListener implements ActionListener
{
	private ArrayList<JButton> buttons;
	private JFrame myFrame;
	
	NewGameButtonListener(ArrayList<JButton> buttons, JFrame myFrame)
	{
		this.buttons = buttons;
		this.myFrame = myFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<buttons.size();i++)
		{
			int k = (int)(Math.random()*100);
			String j = "";
			if(k % 2 == 0)
				j = "X";
			else
				j = "O";
			buttons.get(i).setText(j);
		}
		myFrame.setTitle("Linear Lights Out!");
	}

}
