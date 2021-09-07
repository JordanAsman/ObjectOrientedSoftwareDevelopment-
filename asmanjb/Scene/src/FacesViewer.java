import java.awt.Dimension;

import javax.swing.JFrame;

public class FacesViewer
{
	public static final Dimension FACES_VIEWER_SIZE = new Dimension(750, 600);
	
	/**
	 * creates the viewer for face
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();

		frame.setSize(FACES_VIEWER_SIZE);
		frame.setTitle("I see faces!");

		frame.add(new FacesComponent());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
