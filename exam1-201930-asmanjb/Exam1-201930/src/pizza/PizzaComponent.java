package pizza;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class PizzaComponent extends JComponent
{

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.drawString("Part 1: default cheese pizza", 100, 200);
		g2.drawString("Part 2: specify chese pizza", 400, 200);
		g2.drawString("Part 3: Adding pepperoni", 100, 500);
		g2.drawString("Part 4: Translating your pizza", 100, 750);

		/*
		 * Stage 1: default cheese pizza 5 points
		 */
		Pizza smallPizza = new Pizza();
		smallPizza.drawCrust(g2);
		smallPizza.drawCheese(g2);

		/*
		 * Stage 2: instance variable based cheese pizzas 5 points Uncomment the code
		 * below when you are ready to test this part. Do not change this code
		 * otherwise.
		 */
		Pizza secondPizza = new Pizza(400, 100, 100);
		secondPizza.drawCrust(g2);
		secondPizza.drawCheese(g2);

		Pizza otherPizza = new Pizza(600, 100, 180);
		otherPizza.drawCrust(g2);
		otherPizza.drawCheese(g2);

		/*
		 * Stage 3: add an "addPepperoni" to a pizza method 6 points Uncomment the code
		 * below when you are ready to test this part. Do not change this code
		 * otherwise.
		 */

		// Add pepperoni in center
		Pizza centerPizza = new Pizza(100, 400, 150);
		centerPizza.drawCrust(g2);
		centerPizza.drawCheese(g2);
		centerPizza.addPepperoni(92, 392, g2);

		// Add pepperoni to make an L
		Pizza ellePizza = new Pizza(400, 400, 100);
		ellePizza.drawCrust(g2);
		ellePizza.drawCheese(g2);
		ellePizza.addPepperoni(375, 370, g2);
		ellePizza.addPepperoni(375, 390, g2);
		ellePizza.addPepperoni(375, 410, g2);
		ellePizza.addPepperoni(395, 410, g2);

		// Add pepperoni to form triangle on upper half
		Pizza bigPizza = new Pizza(600, 400, 180);
		bigPizza.drawCrust(g2);
		bigPizza.drawCheese(g2);
		int start = 520;
		int end = 670;
		for (int j = 392; j > 312; j -= 20)
		{
			for (int i = start; i < end; i += 20)
			{

				bigPizza.addPepperoni(i, j, g2);
			}
			start += 20;
			end -= 20;
		}

		/*
		 * Part 4: add the ability to translate pizza 2 points Uncomment the code below
		 * when you are ready to test this part. Do not change this code otherwise.
		 */
		Pizza movingPizza = new Pizza(100, 650, 150);
		movingPizza.drawCrust(g2);
		movingPizza.drawCheese(g2);
		movingPizza.addPepperoni(52, 642, g2);
		movingPizza.addPepperoni(72, 642, g2);
		movingPizza.addPepperoni(92, 642, g2);
		movingPizza.addPepperoni(112, 642, g2);
		movingPizza.addPepperoni(132, 642, g2);
		
		movingPizza.setTranslation(155, 0);
		movingPizza.drawOn(g2);

		for (int translateX = 310; translateX < this.getWidth() - 155; 
				translateX+=155) {
			movingPizza.setTranslation(translateX, 50);
			movingPizza.drawOn(g2);
		}
	}
}
