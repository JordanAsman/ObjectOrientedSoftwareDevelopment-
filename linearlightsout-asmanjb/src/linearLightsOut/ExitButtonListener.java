package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/*
 * This button listener is used for the exit method
 */
public class ExitButtonListener implements ActionListener
{
	private JFrame myFrame;
	
	ExitButtonListener(JFrame myFrame)
	{
		this.myFrame = myFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		myFrame.dispose();
	}

}
