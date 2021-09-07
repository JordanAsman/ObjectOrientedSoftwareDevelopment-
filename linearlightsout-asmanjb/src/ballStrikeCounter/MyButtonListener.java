package ballStrikeCounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Keeps track of the buttons pressed
 * 
 * @author Jordan Asman
 *
 */
public class MyButtonListener implements ActionListener
{
	private String type;
	private int count;

	public MyButtonListener(String type)
	{
		this.type = type;
		this.count = 0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void updateCount(int newCount)
	{
		count = newCount;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		count++;
	}

}
