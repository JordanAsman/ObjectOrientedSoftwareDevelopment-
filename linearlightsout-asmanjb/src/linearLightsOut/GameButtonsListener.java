package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * This button listener plays the game
 */

public class GameButtonsListener implements ActionListener
{
	private ArrayList<JButton> buttons;
	private JFrame myFrame;
	
	GameButtonsListener(ArrayList<JButton> buttons,JFrame myFrame)
	{
		this.buttons = buttons;
		this.myFrame = myFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton k = (JButton) e.getSource();
		for(int i=0;i<buttons.size();i++)
		{
			if(buttons.get(i)==k)
			{
				updateGame(i);
				if(checkWin())
				{
					myFrame.setTitle("You Won!!");
				}
			}
		}
	}
	
	public void updateGame(int index)
	{
		if(index != 0)
		{
			flip(buttons.get(index-1));
				
		}
		if(index != buttons.size()-1)
		{
			flip(buttons.get(index+1));
		}
		flip(buttons.get(index));
	}
	
	public void flip(JButton b)
	{
		if(b.getText().equals("X"))
		{
			b.setText("O");
		}
		else
		{
			b.setText("X");
		}
	}
	
	public Boolean checkWin()
	{
		for(int i=0;i<buttons.size()-1;i++)
		{
			if(!buttons.get(i).getText().equals(buttons.get(i+1).getText()))
			{
				return false;
			}
		}
		return true;
	}

}
