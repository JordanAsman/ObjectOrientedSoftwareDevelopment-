import java.awt.Dimension;

import javax.swing.JFrame;

public class SunViewer
{
	public static final Dimension SUN_VIEWER_SIZE = new Dimension(750, 600);
	
	
	/**
	 * Constructs and displays the JFrame which displays Sun via a
	 * SunComponent.
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();

		frame.setSize(SUN_VIEWER_SIZE);
		frame.setTitle("I see suns!");

		frame.add(new SunComponent());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
