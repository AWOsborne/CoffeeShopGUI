import java.awt.*;
import javax.swing.*;

/**
 * Main panel to hold the buttons.
 * @author DrewOsborne
 *
 */
public class ButtonPanel extends JPanel
{
	public static JButton addItemButton;
	public static JButton totalButton;
	public static JButton newOrderButton;
	
	/**
	 * Constructor
	 */
	public ButtonPanel()
	{
		setLayout(new GridLayout(1,3));
		
		addItemButton = new JButton("Add Item");
		totalButton = new JButton("Total");
		newOrderButton = new JButton("New Order");
		
		add(addItemButton);
		add(totalButton);
		add(newOrderButton);
	}
}
