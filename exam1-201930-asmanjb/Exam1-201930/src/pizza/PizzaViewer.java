package pizza;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class PizzaViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		int frameWidth = 800;
		int frameHeight = 800;

		frame.setSize(frameWidth, frameHeight);
		frame.setTitle("Graphics Question");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 100);
		frame.setResizable(false);
		
		JComponent component = new PizzaComponent();
		frame.add(component);

		frame.setVisible(true);
	}
}
