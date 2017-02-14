import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Main panel for selecting which product to add.
 * @author DrewOsborne
 *
 */
public class ProductsPanel extends JPanel
{
	public static JRadioButton coffeeButton;
	public static JRadioButton bagelButton;
	public static JRadioButton pastryButton;
	private ButtonGroup bg;
	
	/**
	 * Constructor
	 */
	public ProductsPanel()
	{
		setLayout(new GridLayout(3, 1));
		
		//Creates the buttons.
		coffeeButton = new JRadioButton("Coffee", true);
		bagelButton = new JRadioButton("Bagel");
		pastryButton = new JRadioButton("Pastry");
		
		//Groups the buttons.
		bg = new ButtonGroup();
		bg.add(coffeeButton);
		bg.add(bagelButton);
		bg.add(pastryButton);
		
		
		
		setBorder(BorderFactory.createTitledBorder("Products"));
		
		//Adds the buttons.
		add(coffeeButton);
		add(bagelButton);
		add(pastryButton);
	}
	
	
}
