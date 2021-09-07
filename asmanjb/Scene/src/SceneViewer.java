import java.awt.Dimension;

import javax.swing.JFrame;

public class SceneViewer
{
	public static final Dimension SCENE_VIEWER_SIZE = new Dimension(750, 600);
	
	
	/**
	 * Constructs and displays the JFrame which displays Scene via a
	 * SceneComponent.
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();

		frame.setSize(SCENE_VIEWER_SIZE);
		frame.setTitle("Scene!");

		frame.add(new SceneComponent());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
